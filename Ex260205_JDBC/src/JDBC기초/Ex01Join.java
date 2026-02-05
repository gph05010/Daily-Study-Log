package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01Join {

	public static void main(String[] args) {

		// JDBC(Java DataBase Connectivity)

		// JDBC 드라이버
		// -> java에서 제공해주는 인터페이스들을 데이터베이스 회사들에서
		// 구현한 클래스 파일들의 모음

		Scanner sc = new Scanner(System.in);

		// 사용자 정보 입력 구간
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		PreparedStatement psmt = null;
		Connection conn = null;

		// 1. 드라이버 로딩
		try {
			// try 구문
			// -> 예외가 발생할 수도 있지만, 우선 시도해보는 구간

			Class.forName("oracle.jdbc.driver.OracleDriver");
			// -> 반드시 프로젝트에 jar 파일 넣어주기!
			// jar 파일이란?
			// -> 클래스 파일들을 여러 개 모아놓은 압축 파일

			// 프로젝트에 jar 파일 추가하는 방법
			// 프로젝트 선택 -> 마우스 우클릭 -> build path
			// -> configure build path -> libraries 탭 선택
			// -> class path 선택 -> 우측 add external jars 버튼 선택
			// -> 원하는 jar 파일 경로 선택 -> apply and close
			// C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib

			// 2. 데이터베이스 연결
			// 준비물 3가지
			// 1) 연결 경로 2) 계정 이름 3) 계정 비밀번호
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// thin -> JDBC 드라이버가 thin 타입
			// @localhost -> ip주소
			// 1521 -> port번호
			// xe -> DB 기본이름 (DB 별칭)
			String user = "hr";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);
			// Connection ?
			// : 데이터베이스에 접속하기 위한 모든 메서드를 가진 인터페이스
			// -> 데이터베이스와 하는 모든 통신은 Connection을 통해서 이루어짐
			// Connection == MetaData
			// -> 사용 가능한 테이블 목록, 컬럼들에 대한 정보 등 연결된 데이터베이스의 정보들을 전부 가지고 있음

			if (conn != null) {
				System.out.println("연결 성공~!");
			} else {
				System.out.println("연결 실패...");
			}

			// 3. Query문 전송
			String sql = "INSERT INTO MEMBER VALUES(?, ?, ?, ?)";

			// ? 인자
			// : 사용자로부터 어떤 데이터가 들어올지 모를 때 사용
			// 지정된 데이터 공간만큼 비워놓고 실행하기 전까지 대기

			psmt = conn.prepareStatement(sql);
			// -> 전송하기 전에 sql문을 담아서 전송할 수 있는 형식으로 변경

			// ? 인자를 채우는 작업 (반드시 실행 전에 진행할 것)
			// 데이터 바인딩 작업 (data binding)
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);

			// 3-1. sql문 실행
			int row = psmt.executeUpdate();

			// 4. 결과를 이용한 작업처리
			if (row > 0) {
				System.out.println("회원가입 성공~!");
			} else {
				System.out.println("회원가입 실패...");
			}

		} catch (Exception e) { // -> 모든 예외 클래스는 Exception을 상속받음!
								// Exception e = new ClassNotFoundException();
								// => 업캐스팅이 일어나는 개념!
			// catch 구문
			// -> 예외가 발생했을 때, 어떤 로직을 수행할지 작성하는 구간
			// () 안에 있는 매개변수는 어떤 예외 상황을 잡아줄 건지 기술하는 공간

			e.printStackTrace();
			// -> 예외상황이 왜 발생했고, 어디서 문제가 나고 있는지 출력해주는 구문
			// (개발할 때만 사용, 배포할 때는 삭제하는 것이 좋음)
			// System.out.println("에러 발생!"); -> 이 방식으로 사용자에게 보여줄 수는 있음
		} finally {
			// 5. 자원반납 = DB 연결 종료
			// 위에서 예외상황이 발생하더라도 반드시 한 번은 들어오는 구간
			// ** 자원반납은 항상 사용한 순서의 반대로 반납!
			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
