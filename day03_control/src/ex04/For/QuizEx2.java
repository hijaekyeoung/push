//*
package ex04.For;

import java.util.Scanner;

public class QuizEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("======= 구구단 프로그램 =======");
			System.out.print("Dan : ");
			int num = sc.nextInt();
			
			for (int i = 1; i <= 9; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
			
		} catch(Exception e) {
			System.out.println("1~9까지의 숫자를 입력해주세요.");
		}
	}
}
//*/
// 문제2 원하는 단을 입력 받아서 구구단 출력


/*
package ex04.For;

public class QuizEx2 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if (i%2 == 0) {
				System.out.print(i + " ");
				if (i%20 == 0) {
					System.out.println();
				}
			}
		}
	}
}
*/
// 문제1 1~100까지 중에서 짝수 출력(열), 한행에 10개씩

