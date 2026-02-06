package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex05Update {

	public static void main(String[] args) {

		// 1. 사용자한테 id, pw 입력받기

		Scanner sc = new Scanner(System.in);

		Connection conn = null;
		PreparedStatement psmt = null;

		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();

		// 2. 수정할 이름 입력받기

		System.out.print("수정할 이름 입력 : ");
		String name = sc.next();

		// JDBC
		// 1) 드라이버 로딩

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2) 데이터베이스 연결
			// 준비물 3가지

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결 성공~!");
			} else {
				System.out.println("연결 실패...");
			}

			// 3) Query문 전송
			// 회원 정보 수정 -> UPDATE

			String sql = "UPDATE MEMBER SET NAME = ? WHERE ID = ? AND PW = ?";

			// 3-1) ? 인자 채우기

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, name);
			psmt.setString(2, id);
			psmt.setString(3, pw);

			// 3-2) 실행

			int row = psmt.executeUpdate();

			// 4) 결과를 이용한 작업처리
			// 성공 -> 수정 성공 출력
			// 실패 -> 수정 실패 출력
			if (row > 0) {
				System.out.println("정보 수정 성공~!");
			} else {
				System.out.println("정보 수정 실패...");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		// 5) 자원반납

		finally {
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
