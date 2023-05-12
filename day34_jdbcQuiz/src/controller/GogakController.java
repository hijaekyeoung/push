package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import dbConn.utill.ConnectionSingletonHelper;
import model.GogakVO;

public class GogakController {
	
	static Connection conn = null;
	static Statement stat = null;
	static PreparedStatement pstat = null;
	static ResultSet rs = null;
	static Scanner sc = new Scanner(System.in);
	
	public static void connect() {
		try {
			conn = ConnectionSingletonHelper.getConnection("oracle");
			//conn = ConnectionSingletonHelper.getConnection("oracle", "kingsmile", "oracle");
			stat = conn.createStatement();
			//conn.setAutoCommit(false); // 자동커밋 끄기
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close() {
		try {
			ConnectionSingletonHelper.close(rs);
			ConnectionSingletonHelper.close(pstat);
			ConnectionSingletonHelper.close(stat);
			ConnectionSingletonHelper.close(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void gogakMenu() throws SQLException {
		
		GogakVO gvo = new GogakVO();
		
		while(true) {
			ConnectionSingletonHelper.gogakMenu();
			
			switch(sc.nextInt()) {
			case 1: selectAll(); break;
			case 2: insert(); break;
			case 3: updateGogak(); break;
			case 4: delete(); break;
			case 5: 
				close();
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			case 6: conn.rollback(); break;
			case 7: conn.commit(); break;
			case 8: selectByGno(); break;
			}
		}
		
	}
	
	// update
	public static void updateGogak() {
		System.out.print("수정하실 GNO : "); String gno = sc.next();
		System.out.print("수정하실 GNAME : "); String gname = sc.next();
		System.out.print("수정하실 JUMIN : "); String jumin = sc.next();
		System.out.print("수정하실 POINT : "); String point = sc.next();
		
		String sql = "UPDATE GOGAK SET GNAME = ?,JUMIN = ?, "
				+ "POINT = ? where GNO = ?";
		
		try {
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, gname);
			pstat.setString(2, jumin);
			pstat.setString(3, point);
			pstat.setString(4, gno);
			int result = pstat.executeUpdate();
			System.out.println(result + "개 수정 완료!");
		} catch (Exception e) { e.printStackTrace(); }
		
	}
	
	
	// select
	public static void selectAll() throws SQLException {
	      rs = stat.executeQuery("SELECT * FROM gogak");
	      
	      ResultSetMetaData rsmd = rs.getMetaData();
	      int count = rsmd.getColumnCount();
	      
	      while(rs.next()) {
	         for (int i =1; i<=count; i++) {
	            
	            switch(rsmd.getColumnType(i)) {
	               case Types.NUMERIC:
	               case Types.INTEGER:
	                  System.out.println(rsmd.getColumnName(i)+ ":"+rs.getInt(i)+ " ");
	                  break;
	                  
	               case Types.FLOAT:
	                  System.out.println(rsmd.getColumnName(i)+ ":"+rs.getFloat(i)+ " ");
	                  break;
	                  
	               case Types.DOUBLE:
	                  System.out.println(rsmd.getColumnName(i)+ ":"+rs.getDouble(i)+ " ");
	                  break;   
	               
	               case Types.CHAR:
	                  System.out.println(rsmd.getColumnName(i)+ ":"+rs.getString(i)+ " ");
	                  break;   
	                  
	               case Types.DATE:
	                  System.out.println(rsmd.getColumnName(i)+ ":"+rs.getDate(i)+ " ");
	                  break;   
	                  
	                  default :
	                     System.out.println(rsmd.getColumnName(i)+ ":"+rs.getString(i)+ " ");
	                     break;
	            }
	         }
	         System.out.println();
	      }
	   }
	
	
	
	// insert
	private static void insert() {
//      private String gno, gname,jumin, point;
      
      System.out.print("GNO:"); String gno = sc.next();
      System.out.print("GNAME:"); String gname = sc.next();
      System.out.print("JUMIN:"); String jumin = sc.next();
      System.out.print("point:"); String point = sc.next();

      try {
         
         pstat = conn.prepareStatement("INSERT INTO GOGAK VALUES(?,?,?,?)");
         pstat.setString(1, gno);
         pstat.setString(2, gname);
         pstat.setString(3, jumin);
         pstat.setString(4, point);
         
         int result = pstat.executeUpdate(); //
         
         System.out.println(result + "개 데이터가 추가 되었습니다.");
         
         
      } catch (Exception e) {e.printStackTrace();}
      
   } // end insert
	
	
	// delete
	private static void delete() throws SQLException {
		selectAll();
		System.out.println("삭제할 고객의 번호를 입력하세요.");
		sc.nextLine();
		String gno = sc.nextLine();

		try {
			pstat = conn.prepareStatement("delete gogak where gno = ?");
			pstat.setString(1, gno);
			;
			pstat.executeUpdate();
			System.out.println(gno + "번 고객의 정보가 삭제 되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void selectByGno() throws SQLException {
		pstat = conn.prepareStatement("select * from gogak where gname = ?");
		System.out.println("검색할 고객의 이름을 입력하세요");
		pstat.setString(1, sc.next());
		rs = pstat.executeQuery(); // 반환값 있는 경우

		ResultSetMetaData rsmd = rs.getMetaData();
		int count = rsmd.getColumnCount();

		while (rs.next()) {
			for (int i = 1; i <= count; i++) { // 각 타입별로 출력하기

				switch (rsmd.getColumnType(i)) {
				case Types.NUMERIC:
				case Types.INTEGER:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getInt(i) + "  ");
					break;
				case Types.FLOAT:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getFloat(i) + "  ");
					break;
				case Types.DOUBLE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDouble(i) + "  ");
					break;
				case Types.CHAR:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + "  ");
					break;
				case Types.DATE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDate(i) + "  ");
					break;
				default:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + "  ");
					break;
				} // switch end
			} // end for
			System.out.println();
		} // end while
	}
}
