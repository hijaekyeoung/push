package projectCode;

import java.util.Scanner;

class Score {
	String name;
	int kr, eng, math, total;
	double avg;
	char grade;
}
// 7명 성적 출력
public class PracticeArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======= 성적 입출력 프로그램 =======");
		System.out.print("몇 명의 학생의 성적을 입력하시겠습니까? : ");
		int n = sc.nextInt();
		Score[] stu = new Score[n]; // 학생 수 만큼의 Score[] 생성
		
		for (int i = 0; i < n; i++) {
			stu[i] = new Score(); // Score 생성자 호출
			System.out.println("이름 : ");
			stu[i].name = sc.next();
			System.out.println("국어 점수 : ");
			stu[i].kr = sc.nextInt();
			System.out.println("영어 점수 : ");
			stu[i].eng = sc.nextInt();
			System.out.println("수학 점수 : ");
			stu[i].math = sc.nextInt();
			
			stu[i].total = stu[i].kr + stu[i].eng + stu[i].math;
			stu[i].avg = stu[i].total/3.0;
			
			switch((int)stu[i].avg/10) {
			case 10 : case 9 :
				stu[i].grade = 'A'; break;
			case 8 :
				stu[i].grade = 'B'; break;
			case 7 :
				stu[i].grade = 'C'; break;
			case 6 :
				stu[i].grade = 'D'; break;
			case 5 :
				stu[i].grade = 'E'; break;
			default :
				stu[i].grade = 'F'; break;
			}
			
			System.out.println(stu[i].name + "님의 성적표 ********");
			System.out.println("국어 : " + stu[i].kr + ", 영어 : " + stu[i].eng + ", 수학 : " + stu[i].math);
			System.out.printf("총점 : %d, 평균 : %.2f, 학점 : %c\n",stu[i].total,stu[i].avg,stu[i].grade);
			System.out.println("***************");
			System.out.println();
		}
	}
}
