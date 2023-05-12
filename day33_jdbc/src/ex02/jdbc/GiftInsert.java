package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GiftInsert {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
				"kingsmile","oracle");
	
		Statement stmt = conn.createStatement();
		// 1. 고정값 레코드 입력
		//String sql = "INSERT INTO GIFT VALUES(11,'종합과자',1000,20000)";
		
		// 2. 레코드 값 입력 받아서 처리 - Scanner, IO, main args
		String sql = "INSERT INTO GIFT VALUES("+args[0]+", '"+args[1]+"',"+args[2] +","+args[3]+")";
		System.out.println(sql);
		int result = stmt.executeUpdate(sql);
		System.out.println(result + "개 데이터 추가 성공함.");
		
		stmt.close();
		conn.close();
	}
}
