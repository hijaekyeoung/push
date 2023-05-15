package ex01.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;

public class MainEntry {
	public static void main(String[] args) {
		Connection conn = ConnectionHelper.getConnection("oracle");
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//conn.setAutoCommit(false);
			stmt = conn.createStatement();
			// SQL 구문, HTML Tag는 java/jsp/servlet에서 문장으로 취급
			//String sql = "CREATE TABLE KOSADB(NAME VARCHAR2(20), AGE NUMBER)";
			StringBuilder sb = new StringBuilder();
			//sb.append("if exis ts table drop");
			sb.append("CREATE TABLE KOSADB(NAME VARCHAR2(20), AGE NUMBER)");
			stmt.executeUpdate(sb.toString()); // 반환값이 없는 경우
			System.out.println(sb.toString());
			
			String sql = "insert into kosadb values('yuna',33)";
			int result = stmt.executeUpdate(sql);
			
			sql = "select * from kosadb";
			rs = stmt.executeQuery(sql); // 반환값이 있는 경우
			
			System.out.println(result + "개 추가");
			
			while(rs.next()) {
				System.out.print("name : " + rs.getString(1) + "\t");
				System.out.println("age : " + rs.getInt("age"));
			}
			//conn.commit();
			//sql = "DROP TABLE KOSADB";
			//result = stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseHelper.close(rs);	CloseHelper.close(stmt);  CloseHelper.close(conn);
		}
	}
}
