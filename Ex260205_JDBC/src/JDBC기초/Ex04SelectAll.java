package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex04SelectAll {

	public static void main(String[] args) {

		System.out.println("===== 전체 회원 조회 =====");

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

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
			// 데이터 조회 -> SELECT

			String sql = "SELECT * FROM MEMBER";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			// 4) 결과를 이용한 작업처리
			// 데이터베이스에서 가지고 있는 전체 정보 다 가져오기

			while (rs.next()) {
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");

				System.out.printf("ID : %s / NAME : %s / AGE : %d\n", id, name, age);
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
