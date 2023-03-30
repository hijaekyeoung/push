package ex03_exception;

import java.util.Scanner;

public class ThrowsMain {
	public static void main(String[] args) throws Exception { //예외처리 위임
		int x = 0;
		int y;
		int result;

		System.out.println("x, y input : ");
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();

		result = x / y; // 문제발생
		
		System.out.println(result);

	}
}
