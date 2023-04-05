package quiz;

import java.util.Scanner;

public class QuizEx2 {
	
	// plus(1,2), mul(1,2) 리턴타입 없이
	// sub(-), div(/) 리턴타입 있고, div함수는 예외처리

	public static void line() {
		System.out.println("----------------------------------");
	}

	public static void plus(int x, int y) {
		System.out.println(x +"+"+ y +"= " + (x + y));
	}

	public static void mul(int x, int y) {
		System.out.println(x +"*"+ y +"= " + (x * y));
	}

	public static int sub(int x, int y) {
		System.out.print(x + "-" + y + "= ");
		return x - y;
	}

	public static int div(int x, int y) {
		try {
			System.out.print(x + "/" + y + "= ");
			if (x > y) return x / y;
			else return 0;
		} catch (Exception e) {
			System.out.println("에러발생!");
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1번숫자 : "); int num1 = sc.nextInt();
		System.out.print("2번숫자 : "); int num2 = sc.nextInt();
		
		// 함수 호출
		plus(num1, num2);
		line();
		mul(num1, num2);
		line();
		int sub = sub(num1, num2);
		System.out.println(sub);
		line();
		int div = div(num1, num2);
		System.out.println(div);
	}
}
