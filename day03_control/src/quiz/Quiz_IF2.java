package quiz;
import java.util.Scanner;

public class Quiz_IF2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("평점프로그램");
		System.out.println("점수를 입력하세요.");
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		double avg = (kor + eng + math) / 3.0;
		
		if (avg >= 60) {
			System.out.println("평균 점수는 " + avg);
			
			if(kor < 40 && eng >= 40 && math >= 40) {
				System.out.println("국어 과락");
				System.out.println("불합격");
			} else if(kor >= 40 && eng < 40 && math >= 40) {
				System.out.println("영어 과락");
				System.out.println("불합격");
			} else if(kor < 40 && eng >= 40 && math < 40) {
				System.out.println("수학 과락");
				System.out.println("불합격");
			} else if(kor < 40 && eng < 40) {
				System.out.println("국어,영어과락");
				System.out.println("불합격");
			} else if(kor < 40 && math < 40) {
				System.out.println("국어,수학과락");
				System.out.println("불합격");
			} else if(math < 40 && eng < 40) {
				System.out.println("수학,영어과락");
				System.out.println("불합격");
			}  else
				System.out.println("합격");
			
		} else {
			System.out.println("평균 점수는 " + avg);
			System.out.println("평균 점수 불합격! 분발하세요!");
		}
	}
}

// 문제> 3과목(K,E,Com) 점수 입력 받아서
// 평균 점수 : 60 이상, 과락이 있으면 안됌 각 과목 40점미만시 과락
// 40점 이상은 "합격", 평균 불합격, 각 과목 과락은 불합격
