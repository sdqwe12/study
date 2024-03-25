package mysqltestt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {

	public void insert(String todo) {
	System.out.println("DB에 할일입력 넣기");
	
	// 예외처리 db에다가 연결 했는데 db컴퓨터 켜져있다
	// db 아이디 비번 root 1234 틀리게 적으면 -> 예외
		try {
			 Connection con = DriverManager.getConnection(INFO.JDBC_URL, INFO.USERNAME, INFO.PASSWORD);
			 String sql_query = "insert into jyh.todo (할일, 상태) values (피아노치기, C)"; // 수정
			 PreparedStatement pstmt = con.prepareStatement(sql_query);
			pstmt.executeUpdate();
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select() {
		System.out.println("DB에 할일목록 보여주기");
		try {
			Connection con = DriverManager.getConnection(INFO.JDBC_URL, INFO.USERNAME, INFO.PASSWORD);
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM todo");
			ResultSet rs = pstmt.executeQuery();
				
			while(rs.next()) {
				System.out.println(rs.getInt("idx"));
				System.out.println(rs.getInt("할일"));
				System.out.println(rs.getInt("상태"));
			}
				
		}catch (Exception e) {
				// TODO: handle exception
		}
	}
}
