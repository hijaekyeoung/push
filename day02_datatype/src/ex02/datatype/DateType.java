package ex02.datatype;

import java.util.Iterator;

public class DateType {

	public static void main(String[] args) {
		String str = "A"; // 문자열, " ", 2byte, 문자열은 끝에 null을 포함하기 때문에 2바이트
		char ch = 'A'; // 문자, ' ', 1byte
		char ch2 = 67;
		char ch3 = 'b';
		int su = 20;
		String nickname = "happy";
		double d = 12.34;
		
		System.out.println('a' + 'a');
		System.out.println(ch); // A
		System.out.println(str); // A
		System.out.println((int)ch); // A의 ASCII코드값 : 65
		System.out.println(ch2 + ch3); // ?
		// tip 대문자에서 소문자로 변경시 ASCII값 +32
		System.out.println("nickname : " + nickname);
		System.out.println("실수형 데이터 : " + d);

		for (int i = 65; i <= 90; i++) {
			System.out.print((char) i + " "); // \t : tab
		}
		System.out.println("\n\n======================");
		for (int i = 'a'; i <= 'z'; i++) { // ASCII값으로 인식해서 가능
			System.out.print((char) i + " "); // \t : tab
		}

		System.out.println("\n\nboolean type");
		boolean flag = true; // 기본값 false
		// int b = flag;
		System.out.println(flag);
	}

}
