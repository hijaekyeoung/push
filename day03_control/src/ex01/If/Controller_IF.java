package ex01.If;

import java.util.Scanner;

public class Controller_IF {
	public static void main(String[] args) {

		String str = ""; // null
		System.out.println("integer data input : ");

		int su = new Scanner(System.in).nextInt();

		if (su % 2 != 0) {
			System.out.println("odd");

			if (su > 0) {
				System.out.println("양수");
			} else if (su < 0) {
				System.out.println("음수");
			} else
				System.out.println("0이군요");

		} else {
			System.out.println("even");

			if (su > 0) {
				System.out.println("양수");
			} else if (su < 0) {
				System.out.println("음수");
			} else {
				System.out.println("0이군요");

			} // in if end
		} // out if end
	}
}
