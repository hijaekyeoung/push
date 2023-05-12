package ex01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainEntry {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. 드라이브 로드 -> 예외발생
		Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이브를 로드하는 경우, String을 객체로 바꾸는 경우
		System.out.println("driver load sucess!!");
		// 2. Connection & Open
		// 드라어버:@IP:PORT번호:SID(전역 데이터이름)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
		String uid = "kingsmile";
		String pwd = "oracle";
		
		Connection conn = DriverManager.getConnection(url,uid,pwd);
		System.out.println("Connection sucess!!");
		
		// 3. 사용 (DML 명령어)
		
		// 4. 닫기 (자원 반환)
		
	}
	
	// SQL, Tag는 자바에서 문자열 취급한다.
}
