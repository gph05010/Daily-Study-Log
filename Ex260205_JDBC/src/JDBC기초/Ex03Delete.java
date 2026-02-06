package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03Delete {

	public static void main(String[] args) {

		// 1. 사용자로부터 탈퇴할 id, pw 입력받기

		Scanner sc = new Scanner(System.in);

		Connection conn = null;
		PreparedStatement psmt = null;

		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();

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

			String sql = "DELETE FROM MEMBER WHERE ID = ? AND PW = ?";
			// 데이터 삭제 -> DELETE

			// 3-1) ? 인자 채우기
			// 3-2) 실행

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			int row = psmt.executeUpdate();

			// 4) 결과를 이용한 작업 처리
			// 회원탈퇴 성공 출력 / 실패 출력
			if (row > 0) {
				System.out.println("회원탈퇴 성공~!");
			} else {
				System.out.println("회원탈퇴 실패...");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} // 5) 자원반납
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