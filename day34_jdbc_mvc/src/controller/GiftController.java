package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;
import model.GiftVO;

public class GiftController {

	// 연결, 삽입, 삭제, 수정, 검색.......
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static PreparedStatement pstmt = null;
	static Connection conn = null;

	// connect
	public static void connect() {
		try {
			conn = ConnectionHelper.getConnection("oracle");
			stmt = conn.createStatement();
			conn.setAutoCommit(false); // 자동 커밋 끄기
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// close
	public static void close() {
		try {
			CloseHelper.close(rs);
			CloseHelper.close(stmt);
			CloseHelper.close(pstmt);
			CloseHelper.close(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// menu
	public static void menu() throws SQLException {
		GiftVO vo = new GiftVO();

		while (true) {
			System.out.println();
			ConnectionHelper.menu();

			switch (sc.nextInt()) {
			case 0:
				System.out.println("Commit 하시겠습니까?(Y/N) ");
				System.out.println("안하시려면 Rollback 됩니다.");
				if (sc.next().equalsIgnoreCase("Y")) {
					conn.commit(); // 예외발생
					selectAll(vo.getClassName());
				} else {
					conn.rollback();
					selectAll(vo.getClassName());
				}
				break;

			case 1:
				selectAll(vo.getClassName());
				break;
			case 2:
				insert();
				selectAll(vo.getClassName());
				break;
			case 3:
				update(vo.getClassName());
				break;
			case 4:
				delete(vo.getClassName());
				break;
			case 5:
				selectByGno(vo.getClassName());
				break;
			case 6:
				close();
				System.out.println("프로그램 종료합니다.");
				System.exit(0);
				break;
			case 9:
				conn.commit();
				System.out.println("성공적으로 완료 되었습니다.");
				break;
			}
		} // end while
	} // end menu()

	private static void selectByGno(String className) {
		try {
			pstmt = conn.prepareStatement("select * from " + className + " where gno = ? ");
			System.out.print("GNO : ");
			pstmt.setString(1, sc.next());
			pstmt.executeQuery();
			System.out.println("조건 선택 완료");
		} catch (Exception e) { e.printStackTrace(); }
	}

	private static void delete(String className) {
		try {
			pstmt = conn.prepareStatement("delete from " + className + " where gno = ? ");
			System.out.print("삭제할 GNO : ");
			pstmt.setString(1, sc.next());
			int result = pstmt.executeUpdate();
			System.out.println(result + "개 GNO 삭제");
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	// 수정 나중에 해보기
	private static void update(String className) {
		System.out.print("수정할 GNO 입력 : ");
		String gno = sc.next();
		try {
			pstmt = conn.prepareStatement("update " + className + " set where " + gno + "=?");
			pstmt.setString(1, gno);
			pstmt.setString(2, gno);
			pstmt.setString(3, gno);
			pstmt.setString(4, gno);
		} catch (Exception e) { e.printStackTrace(); }
	}

	// selectAll
	public static void selectAll(String className) throws SQLException {
		rs = stmt.executeQuery("select * from " + className); // 반환값 있는 경우

		ResultSetMetaData rsmd = rs.getMetaData(); // 해당 테이블에 대한 정보를 담는다.
		int count = rsmd.getColumnCount();

		while (rs.next()) {
			for (int i = 1; i <= count; i++) { // 각 타입별로 출력하기

				switch (rsmd.getColumnType(i)) {
				case Types.NUMERIC:
				case Types.INTEGER:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getInt(i) + " ");
					break;
				case Types.FLOAT:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getFloat(i) + " ");
					break;
				case Types.DOUBLE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDouble(i) + " ");
					break;
				case Types.CHAR:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + " ");
					break;
				case Types.DATE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDate(i) + " ");
					break;
				default:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + " ");
					break;
				} // switch end
			} // for end
			System.out.println();
		} // end while

	} // end selectAll()

	// insert
	public static void insert() {
		System.out.print("GNO :");
		String gno = sc.next();
		System.out.print("GNAME :");
		String gname = sc.next();
		System.out.print("G_START :");
		String g_start = sc.next();
		System.out.print("G_END :");
		String g_end = sc.next();

		try {
			pstmt = conn.prepareStatement("INSERT INTO GIFT VALUES(?,?,?,?)");
			pstmt.setString(1, gno);
			pstmt.setString(2, gname);
			pstmt.setString(3, g_start);
			pstmt.setString(4, g_end);
			int result = pstmt.executeUpdate();
			System.out.println(result + "개 데이터 추가되었다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end insert()
}
