package ex04.array;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		// next() vs nextline();
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.next(); sc.next(); // 공백처리
		String b = sc.next();
		System.out.println(a + ", " + b);
		

		
//		String name = sc.nextLine(); //공백인식한다
//		String str = sc.next(); // 공백을 인식하지 못한다.
//		
//		System.out.println(name + ", " + str);
	}
}
