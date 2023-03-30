package quiz;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz_ExceptionTryMultiCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		String str = " ";
		char sign;
		
		try {
			System.out.println("2개의 정수 입력 : ");
			System.out.print("첫 번째 숫자 : ");
			x = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			y = sc.nextInt();
			System.out.print("연산 기호 : ");
			str = sc.next();
			sign = str.charAt(0);

			switch (sign) {
			case '+':
				System.out.println(x + y);
				break;
			case '-':
				System.out.println(x - y);
				break;
			case '*':
				System.out.println(x * y);
				break;
			case '/':
				System.out.println(x / y);
				break;
			default:
				System.out.println("사칙연산 기호만 입력 가능합니다.");
			}

		} catch (ArithmeticException e) {
			System.out.println("나눗셈을 할 시 2번째 숫자는 0을 입력할 수 없습니다.");
		} catch (InputMismatchException e) {
			System.out.println("올바른 숫자나 연산을 입력하지 않았습니다. 숫자와 (+,-,*,/) 중 하나를 입력하세요.");
		} catch (Exception e) {
			System.out.println("오류가 발생하였습니다.");
			e.printStackTrace();
		} finally {
			System.out.println("무조건 출력됌");
		}
	}
}

// 문제> 정수 2개 입력 받아서 / 연산처리 프로그램 작성 (예외처리 할 것)