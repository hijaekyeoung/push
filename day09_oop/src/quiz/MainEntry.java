package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class MainEntry {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		Score[] scoArr = new Score[n];
		System.out.println(scoArr.length);
		input(scoArr);
		cal(scoArr);
		output(scoArr);
	}
	
	// 입력
	public static void input(Score[] scoArr) {
		for (int i = 0; i < scoArr.length; i++) {
			scoArr[i] = new Score();
			System.out.println("학생 이름 : ");
			scoArr[i].setName(sc.next());
			System.out.println("국어 점수 : ");
			scoArr[i].setKor(sc.nextInt());
			System.out.println("영어 점수 : ");
			scoArr[i].setEng(sc.nextInt());
			System.out.println("수학 점수 : ");
			scoArr[i].setMath(sc.nextInt());
		}
	}
	
	// 계산
	public static void cal(Score[] scoArr) {
		for (int i = 0; i < scoArr.length; i++) {
			scoArr[i].setTotal();
			scoArr[i].setAvg();
			scoArr[i].setGrade();
		
		}
	}
	
	// 출력
	public static void output(Score[] scoArr) {
		for (int i = 0; i < scoArr.length; i++) {
			System.out.printf("이름 : %s\n 국어 : %d\t영어 : %d\t수학 : %d\n" + "총점 : %d\t평균 : %.2f\t 학점 : %c", 
					scoArr[i].getName(), scoArr[i].getKor(), scoArr[i].getEng(), scoArr[i].getMath(), scoArr[i].getTotal(), scoArr[i].getAvg(), scoArr[i].getGrade());
			System.out.println();
		}
	}
	
	
}
