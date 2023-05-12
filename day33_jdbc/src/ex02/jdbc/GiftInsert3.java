package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class GiftInsert3 {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
				"kingsmile","oracle");
	
		String sql = "INSERT INTO GIFT VALUES(?,?,?,?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 20);
		pstmt.setString(2, "초코렛");
		pstmt.setInt(3, 3000);
		pstmt.setInt(4, 9999);
		
		int result = pstmt.executeUpdate();
		System.out.println(result + "개 데이터 추가 성공함.");
		
		pstmt.close();
		conn.close();
	}
}
