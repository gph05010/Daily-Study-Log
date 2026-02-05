package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02Login {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PreparedStatement psmt = null;
		Connection conn = null;
		ResultSet rs = null;

		// 1. 사용자로부터 아이디와 비밀번호 입력받기

		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();

		// JDBC
		// 1) 드라이버 로딩

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2) 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결 성공~!");
			} else {
				System.out.println("연결 실패...");
			}

			// 3) Query 전송

			String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ?";
			// 3-1) ? 인자 채우기, 실행

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();
			// ResultSet?
			// -> : 조회된 데이터 결과를 테이블과 같은 형태로 표현해주는 집합 자료구조
			// -> cursor(커서)를 가지고 있음 (처음에는 column명을 가리키고 있음)
			// -> cursor가 가리키고 있는 데이터만 가져올 수 있음

			// rs.next(); // -> cursor를 한 행 밑으로 내리는 작업
			// boolean 자료형으로 데이터가 있다면 true / 없다면 false 반환

			// 4) 결과를 이용한 작업 처리

			if (rs.next()) {
				System.out.println("로그인 성공~!");
			} else {
				System.out.println("로그인 실패...");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		// 5) 자원반납
		finally {
			try {
				if (rs != null) {
					rs.close();
				}
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
