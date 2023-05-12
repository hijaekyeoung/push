package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class GiftInsert2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
				"kingsmile","oracle");
		
		System.out.println("Gift Table data input : 상품번호/상품명/최저가/최고가 = ");
		String sql = "INSERT INTO GIFT VALUES(?,?,?,?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setInt(1, sc.nextInt());
		pstmt.setString(2, sc.next());
		pstmt.setInt(3, sc.nextInt());
		pstmt.setInt(4, sc.nextInt());
		
		int result = pstmt.executeUpdate();
		System.out.println(result + "개 데이터 추가 성공함.");
		
		pstmt.close();
		conn.close();
	}
}
