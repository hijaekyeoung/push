package ex02.scanner;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		
		// 객체생성, 메모리할당, 생성자함수자동호출
		Scanner sc = new Scanner(System.in);
		// next() : 공백인식x, nextLine() : 공백인식o
		System.out.println("String input : ");
//		String s1 = sc.next();
		
		String s1 = sc.nextLine();
		System.out.println(s1);
		
		System.out.println("======================");
		System.out.println("integer, double date input : ");
		
//		int num = sc.nextInt();
//		double su = sc.nextDouble();
//		System.out.println(num + ", " + su);
		
		System.out.println(sc.nextInt() + ", " + sc.nextDouble());
	}
}
