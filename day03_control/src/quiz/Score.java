package quiz;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("국어 : ");
		int kr = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("전산 : ");
		int math = sc.nextInt();
		
		int score = kr + eng + math;
		double avg = score / 3;
		
		sc.close();
		
		System.out.println("\n\n********************");
		System.out.println(name + "님의 성적표");
		System.out.println("********************");
		System.out.println("국어 : " + kr);
		System.out.println("영어 : " + eng);
		System.out.println("전산 : " + math);
		System.out.println("총점 : " + score);
		System.out.printf("평균 : %.2f" , avg);
		System.out.println();
		
		char grade = ' ';
		
		switch ((int)avg / 10) {
		case 10 : case 9: grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
		case 5 : grade = 'E'; break;
		default : grade = 'F'; break;
		}
		
		System.out.println("학점 : " + grade);
	} // main method end
}


//문제 3
//이름 입력 받고, 국어, 영어의 전산 점수 입력 받아서
//총점, 평균까지 구하는 프로그램 작성

//000님의 성적표 ************
//국어 : 100, 영어 : 100, 전산 : 100
//총점 : 300, 평균 : 100.0, 평점(A) : A