package ex03_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyMain {
	public static void main(String[] args) {
		
		int x = 0;
		int y;
		int result;

		try {
			System.out.println("x, y input : ");	
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();

			result = x / y; // 에러발생
			System.out.println(result);
		
		// 예외처리 최상위 클래스가 제일 마지막에 와야한다.(Exception)
		} catch (ArithmeticException e) {
			System.out.println("곱하거나 나눌 경우 0을 입력하지마세요.");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally { // 정상출력해도 예외발생해도 무조건 출력
			System.out.println("finally 무조건 출력!");
		}
		
	}
}
