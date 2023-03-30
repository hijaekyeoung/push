package quiz;

import java.util.Scanner;

public class Quiz_year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("평년 / 윤년 판정 프로그램");
		System.out.print("연도 입력 : ");
		int year = sc.nextInt();

		if (year % 4 == 0) {
			if (year % 100 != 0 || year % 400 == 0)
				System.out.println(year + "년도는 4년에 한번 오는 윤년입니다.");

		} else
			System.out.println(year + "년도는 평년입니다.");
	}
}
