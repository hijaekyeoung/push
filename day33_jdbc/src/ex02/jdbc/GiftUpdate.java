package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class GiftUpdate {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
				"kingsmile","oracle");
	
		String sql = "update gift set gname = ?, g_start = ?, g_end = ? where gno = ?";
		System.out.print("수정을 원하는 상품의 번호 : ");
		int giftNum = sc.nextInt();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, sc.next());
		pstmt.setInt(2, sc.nextInt());
		pstmt.setInt(3, sc.nextInt());
		pstmt.setInt(4, giftNum);
		
		int result = pstmt.executeUpdate();
		System.out.println(result + "개 데이터 변경 성공함.");
		
		pstmt.close();
		conn.close();
	}
}
