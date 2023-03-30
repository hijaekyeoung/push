//*
package ex03_exception;

import java.util.Scanner;

public class MainEntry {
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
		} catch (Exception e) {
			System.out.println(x);
			// System.out.println("0으로 나눌수 없습니다."); // user message
			// System.out.println(e.getMessage());
			e.printStackTrace(); // 에러발생 위치와 메시지 표시
		}

	}
}
//*/

/*
 * package ex03_exception;
 * 
 * import java.util.Scanner;
 * 
 * public class MainEntry { public static void main(String[] args) {
 * 
 * int x; int y; int result;
 * 
 * 
 * x = new Scanner(System.in).nextInt(); y = new Scanner(System.in).nextInt();
 * 
 * 
 * if (y == 0) { System.out.println("0으로 나눌 수 없습니다."); return; } result = x / y;
 * // 에러발생
 * 
 * System.out.println(result);
 * 
 * } }
 */