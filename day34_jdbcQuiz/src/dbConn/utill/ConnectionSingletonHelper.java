package dbConn.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionSingletonHelper {
	private static Connection conn;
	private ConnectionSingletonHelper() {}
	
	public static Connection getConnection(String dsn) {
		Connection conn = null;
		try {
			if(dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:3306:kosaDB","kingsmile","mysql");
			
			} else if(dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","kingsmile","oracle");
				//System.out.println("oracle connection success!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	
//	public static Connection getConnection(String dsn, String userid, String pwd) {
//		if(conn != null) {
//			return conn;
//		}
//		
//		try {
//			if(dsn.equals("oracle")) {
//				Class.forName("oracle.jdbc.OracleDriver");
//				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl");
//				System.out.println("oracle 연결 성공");
//			} 
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			return conn;
//		}
//	}
	
	public static void close() throws SQLException {
		if(conn != null) {
			if(!conn.isClosed()) {
				conn.close();
			}
		}
	}
	
	public static void close(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Statement stat) {
		if(stat != null) {
			try {
				stat.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(PreparedStatement pstat) {
		if(pstat != null) {
			try {
				pstat.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void gogakMenu() {
		System.out.println("  ======================== 고객 메뉴 =======================");
		System.out.println("  1. 전체 고객 리스트");
		System.out.println("  2. 고객 정보 추가");
		System.out.println("  3. 고객 정보 수정");
		System.out.println("  4. 고객 정보 삭제");
		System.out.println("  5. 프로그램 종료");
		System.out.println("  6. rollback");
		System.out.println("  7. commit");
		System.out.println("  8. >> 원하는 메뉴를 선택하세요.");
	}
}
