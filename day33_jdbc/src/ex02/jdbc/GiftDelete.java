package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class GiftDelete {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
				"kingsmile","oracle");
	
		String sql = "delete gift where gname = ?";
		System.out.print("삭제할 상품명을 입력 : ");
		String gift = sc.next();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, gift);
		
		int result = pstmt.executeUpdate();
		
		System.out.println(result + "개 데이터 삭제 성공함.");
		
		pstmt.close();
		conn.close();
	}
}
