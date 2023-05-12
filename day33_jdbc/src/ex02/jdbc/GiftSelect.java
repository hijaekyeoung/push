package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GiftSelect {
	public static void main(String[] args) throws Exception{
		// 드라이브 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 연결 및 오픈
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String uid = "kingsmile";
		String pwd = "oracle";
		
		Connection conn = DriverManager.getConnection(url,uid,pwd);
		
		// 사용
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT"); // ctrl+shift+x
		
		System.out.println("상품번호\t상품명\t최저가\t최고가");
		while(rs.next()) {
			int gno = rs.getInt(1); //rs.getxxx(인덱스번호); , rs.getxxx(필드명)
			String gname = rs.getString("gname");
			int g_s = rs.getInt(3);
			int g_e = rs.getInt("g_end");
			
			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}

		// 닫기
		rs.close();
		stmt.close();
		conn.close();
	}
}
