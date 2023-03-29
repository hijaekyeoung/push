package quiz;

import java.util.Scanner;

public class Quiz_Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int big = (a > b) ? a : b;
		
		System.out.println("큰 수 : " + big);

	}
}

// 문제 3
// 정수 2개 입력 받아서 큰 수 출력 