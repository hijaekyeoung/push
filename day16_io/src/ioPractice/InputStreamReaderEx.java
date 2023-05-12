package ioPractice;

import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		try {
			System.out.print("입력: ");
			int code = isr.read();
			System.out.println("code:"+code);
			char ch = (char)code;
			System.out.println("char : " + ch);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
