package dbConn.util;
/*
 	ConnectionHelper 클래스의 문제
 	매번 드라이버 로드.......
 	Connection 객체 생성...
 	
 	어차피 하나의 프로세스에서 하나만 만들어서 재사용
	해결방법 >> 공유자원(싱글톤)
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingletonHelper {
	// 하나의 프로세스에서 공통으로 사용할 수 있는 공용자원(static)
	private static Connection conn;
	private ConnectionSingletonHelper() { }
	
	public static Connection getConnection(String dsn, String userid, String pwd) {
		if(conn != null) { // 핵심
			return conn;
		}
		
		try {
			if(dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:3306:kosaDB",userid,pwd);
			} else if(dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",userid,pwd);
				System.out.println("oracle connection success!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	public static void close() throws SQLException {
		if(conn != null) {
			if(!conn.isClosed()) {
				conn.close();
			}
		}
	}
}
