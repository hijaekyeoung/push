package quiz;

import java.util.Scanner;

public class Quiz_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int temp;
		int a = sc.nextInt(); // 큰수가 들어갈 변수 
		int b = sc.nextInt(); // 중간수가 들어갈 변수
		int c = sc.nextInt(); // 작은수가 들어갈 변수
		
		// 그림그려서 이해하기
		if (a < b) { 
			temp = a;
			a = b; 
			b = temp;		
		} 
		if (a < c) { 
			temp = a;
			a = c;
			c = temp;
		}
		if (b < c) {
			temp = b;
			b = c;
			c = temp;
		}
		System.out.println(a + " > "+ b +" > "+ c);
		
	}
}
