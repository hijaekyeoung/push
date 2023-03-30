package quiz;

import java.util.Scanner;

public class Quiz_Switch {
	
	public static void main(String[] args) {
		System.out.println("당신이 받은 점수는? ");
		int score = new Scanner(System.in).nextInt();
		char grade = ' ';
		
		
		// 평점 구하는 프로그램 작성 (switch)
//		if (score >= 90) grade = 'A';
//		else if (score >= 80) grade = 'B';
//		else if (score >= 70) grade = 'C';
//		else if (score >= 60) grade = 'D';
//		else grade = 'F';
		
		System.out.println();
		System.out.println("점수 평점 프로그램");
		System.out.println("당신의 점수는 " + score + "이므로");
		switch (score/10) {
		case 10 : case 9: System.out.print("A");
			break;
		case 8 : System.out.print("B");
			break;
		case 7 : System.out.print("C");
			break;
		case 6 : System.out.print("D");
		default:
			System.out.print("F" + "학점입니다.");
			System.exit(0);
		}
		System.out.println( "학점입니다.");
	}
	
}
