package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEntry {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫 번째 값 :");
		int su1 = Integer.parseInt(br.readLine());
		System.out.println();

		System.out.print("두 번째 값 :");
		int su2 = Integer.parseInt(br.readLine());
		System.out.println();

		System.out.print("연산자(+ | - | * | /) : ");
		char op = br.readLine().charAt(0);

		if (op == '+') {
			System.out.println(su1 + "+" + su2 + "=" + (su1 + su2));
		} else if (op == '-') {
			System.out.println(su1 + "-" + su2 + "=" + (su1 - su2));
		} else if (op == '*') {
			System.out.println(su1 + "*" + su2 + "=" + (su1 * su2));
		} else if (op == '/') {
			System.out.println(su1 + "/" + su2 + "=" + (su1 / su2));
		} else
			System.out.println("사칙 연산 기호만 입력이 가능합니다.");

	}
}

//사칙연산 프로그램
// su1 = 3, su2 = 5, op=* 
