package ex02.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmpCRUD {

	static Scanner sc = new Scanner(System.in);
	static Connection conn;
	// static Date date;
	// static SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd");
	static PreparedStatement pstmt;
	static ResultSet rs;

	// connection
	public static void connection() throws Exception {
		System.out.println("로딩중.........");
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:jdbc:thin:@localhost:1521;orcl";
	}

	// selectByNo()
	static ResultSet selectByEmpNo(int n) throws SQLException {
		String sql = "SELECT * FROM EMP WHERE EMPNO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, n);
		return pstmt.executeQuery();
	}

	static ResultSet selectByNoBtw(int startn, int endn) throws SQLException { // selectByNo()
		String sql = "SELECT * FROM EMP WHERE EMPNO BETWEEN ? AND ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, startn);
		pstmt.setInt(2, endn);
		return pstmt.executeQuery();
	}

	// selectAll()
	static void selectAll() throws SQLException {

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMP"); // ctrl + shift + x = 전부 대문자 만들기
		// 반환값이 있는 경우는 대부분 select 부분이다.
		System.out.println("사번\t성명\t직업\t관리자번호\t입사일\t급여\t성과금\t부서");

		while (rs.next()) {
			int empNo = rs.getInt(1); // rs.getxxx(인덱스번호); // rs.getxxx("필드명");
			String eName = rs.getString(2);
			String job = rs.getString(3);
			int mgr = rs.getInt(4);
			Date hireDate = rs.getDate(5);
			int sal = rs.getInt(6);
			int comm = rs.getInt(7);
			int deptno = rs.getInt(8);

			System.out.println(empNo + "\t" + eName + "\t" + job + "\t" + mgr + "\t" + hireDate + "\t" + sal + "\t"
					+ comm + "\t" + deptno);
		}
	}

	// insert()
	public static void insert() throws Exception {
		System.out.println("사원번호,사원이름,직급,MGR,입사일,월급,커미션,부서번호순으로 입력 :");
		String sql = "INSERT INTO EMP VALUES(?,?,?,?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, sc.nextInt());
		pstmt.setString(2, sc.next());
		pstmt.setString(3, sc.next());
		pstmt.setInt(4, sc.nextInt());
		pstmt.setString(5, sc.next());
		pstmt.setInt(6, sc.nextInt());
		pstmt.setInt(7, sc.nextInt());
		pstmt.setInt(8, sc.nextInt());

		pstmt.executeUpdate();

		System.out.println("입력완료");
	}

	// update()
	public static void update() throws SQLException {
		System.out.print("수정할 사원번호 입력: ");
		String empno = sc.next();

		System.out.print("수정할 칼럼명 입력(job, sal, deptno): ");
		String cName = sc.next();

		System.out.print("수정할 값 입력: ");
		String value = sc.next();

//		if (conn == null) {
//			connect();
//		}

		try {
			pstmt = conn.prepareStatement("update emp set " + cName.toUpperCase() + "=? where empno=?");
			if (cName.equals("job")) {
				pstmt.setString(1, value.toUpperCase());
			} else {
				pstmt.setInt(1, Integer.parseInt(value));
			}
			pstmt.setInt(2, Integer.parseInt(empno));
			System.out.println(pstmt.executeUpdate() + "개행이 수정되었습니다.");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		// exit();

	}

	// delete()
	public static void delete() throws SQLException, ClassNotFoundException, NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("삭제하실 사원 번호를 입력하세요.");
		String sql = "delete emp where empno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, Integer.parseInt(br.readLine()));
		int result = pstmt.executeUpdate();
		System.out.println(result + "개 데이터 삭제 성공");
	}

	// 종료
	public static void exit() throws SQLException {
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
		System.out.println("종료");
	}

	// menu()
	static void menu() throws Exception {
		while (true) {

			System.out.println("1: 특정 테이블 출력  2: 테이블 전체 출력  3: 데이터 삽입  4: 테이블 업데이트  5: 테이블 삭제  6: 종료");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				selectByEmpNo(sc.nextInt());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				insert();
				break;
			case 4:
				update();
				break;
			case 5:
				delete();
				break;
			case 6:
				exit();
				System.exit(0);
			case 7:
				selectByNoBtw(sc.nextInt(),sc.nextInt());
				break;

			}
		}
	}

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "kingsmile", "oracle");
		menu();
	}
}
