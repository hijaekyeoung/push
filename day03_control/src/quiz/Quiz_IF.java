package quiz;

import java.util.Scanner;

public class Quiz_IF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("평점프로그램");
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("평점 : A");
		} else if (score >= 80 && score < 90) {
			System.out.println("평점 : B");
		} else {
			System.out.println("평점 : C");
		}
		
	}
}

// 문제> 점수 입력 받아서 평점 구하는 프로그램 작성
// 100~90 : A, 80~89 : B
