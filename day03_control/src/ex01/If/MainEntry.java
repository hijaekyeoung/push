package ex01.If;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println("integer data input : ");
		
		int su = new Scanner(System.in).nextInt();
		
		
		//삼항 연산자 이용
		String str = (su % 2 == 0) ? "even" : "odd";
		System.out.println(str);
		
//		if (su % 2 == 0) {
//			System.out.println("Even");
//		} else
//			System.out.println("Odd");
		
		// 양수, 음수, 0 판정 if
		if(su > 0) System.out.println("양수");
		else if(su < 0) System.out.println("음수");
		else System.out.println("0");
		
		String s = (su > 0) ? "양수" : (su < 0) ? "음수" : "0";
	}
}
