package ioPractice;

import java.io.InputStream;

public class InputStreamEx {
	public static void main(String[] args) {
		InputStream kbd = System.in;
		System.out.print("입력 : ");
		try {
			int code = kbd.read();
			System.out.println(code);
			char ch = (char)code;
			System.out.println("char : " + ch);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main 메소드 종료");
	}
}
