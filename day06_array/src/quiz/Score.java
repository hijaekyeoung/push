package quiz;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Score {
	// 배열을 이용하여 7명의 성적 처리하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[7]; // 이름
		int[][] score; // 국,영,수,총합
		double[] avg; // 평균
		char[] grade; // 학점
		int[] rank; // 석차
		
		System.out.print("몇 명? : ");
		int n = sc.nextInt(); // 학생 수
		
		name = new String[n];
		score = new int[n][4];
		avg = new double[n];
		grade = new char[n];
		rank = new int[n];
		
		// 연산
		for(int i=0;i<n;i++) {
			System.out.println();
			System.out.print("이름 : ");
			name[i] = sc.next();
			for(int j=0;j<score[i].length-1;j++) {
				System.out.print("점수" + (j+1) + " : ");
				score[i][j] = sc.nextInt(); // 국,영,수 입력
				score[i][3] += score[i][j]; // 국영수 합계
			}
			avg[i] = score[i][3]/3.0;
			
			
			
			switch((int)avg[i]/10) {
			case 10 : case 9 :
				grade[i] = 'A'; break;
			case 8 : 
				grade[i] = 'B'; break;
			case 7 : 
				grade[i] = 'C'; break;
			case 6 : 
				grade[i] = 'D'; break;
			case 5 :
				grade[i] = 'E'; break;
				
			default : 
				grade[i] = 'F'; break;
			}
		}

		sc.close();
		
		double[] scorePan = Arrays.copyOf(avg, n); // avg배열 카피 후 새로운 double배열에 넣고
		Arrays.sort(scorePan); // 오름차순
		
		System.out.println();
		System.out.println("===========출력=============");
		//출력
		for(int i = 0;i<n;i++) {
			System.out.println("이름 : " + name[i]);
			System.out.println("국어 : " + score[i][0]);
			System.out.println("영어 : " + score[i][1]);
			System.out.println("수학 : " + score[i][2]);
			System.out.println("합계 : " + score[i][3]);
			System.out.printf("평균 : %.2f\n", avg[i]);
			System.out.println("학점 : " + grade[i]);
			
			for (int j = 0; j < scorePan.length; j++) {
			
				if (scorePan[j] == avg[i]) {
					System.out.printf("석차(등수) : %d\n", n-j); break;
				}
			}
			
			System.out.println();
		}
		
		
	}
}

// 출력 결과 + 석차(등수)

