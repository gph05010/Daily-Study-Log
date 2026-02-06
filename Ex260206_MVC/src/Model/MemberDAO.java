package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	// DAO
	// : Data Access Object (데이터에 접근하는 것을 도와주는 객체)
	// DB와 연결해서 insert, delete, update, select 하는 코드들의 모음
	// -> 메서드 형태로 코드를 작성
	// -> SQL 쿼리를 실행하고, 실행결과를 리턴

	// 공통 필드 선언
	// -> 공통으로 사용될 자원
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int row = 0;

	// DB 연결 메서드
	private void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 자원반납 메서드
	private void getClose() {
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

	// 회원가입 메서드
	public int join(String id, String pw, String name, int age) {

		getConn(); // -> DB 연결 메서드 호출

		String sql = "INSERT INTO MEMBER VALUES(?, ?, ?, ?)";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);

			row = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return row;
	}

	// 로그인 메서드
	public MemberDTO login(String id, String pw) { // DTO에 저장된 데이터를 가져와야 되니까...

		getConn();

		String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ?";

		MemberDTO dto = null;

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next()) { // 데이터가 있다면
				dto = new MemberDTO();
				dto.setId(rs.getString("ID"));
				dto.setPw(rs.getString("PW"));
				dto.setName(rs.getString("NAME"));
				dto.setAge(rs.getInt("AGE"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return dto;

	}

	// 회원탈퇴 메서드

	public int delete(String id, String pw) {

		getConn();

		String sql = "DELETE FROM MEMBER WHERE ID = ? AND PW = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			row = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return row;
	}

	// 전체회원조회 메서드

	// 회원정보 수정 메서드

	public int update(String id, String pw, String name) {

		getConn();

		String sql = "UPDATE MEMBER SET NAME = ? WHERE ID = ? AND PW = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.setString(2, id);
			psmt.setString(3, pw);

			row = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return row;
	}

}
