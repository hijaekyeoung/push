package quiz;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Score {
	private static String[] name; // 학생 이름
	private static int[][] score; // 국,영,수
	private static int[] sum; // 총점
	private static double[] avg; // 평균
	private static int[] rank; // 석차
	private static char[] grade; // 학점

	static Scanner sc = new Scanner(System.in);

	// 학생 수, 이름, 과목 점수 입력 함수
	public static void input(int n,String[] name,int[][] score) {
		for (int i = 0; i < score.length; i++) {
			System.out.print("이름 : ");
			name[i] = sc.next();
			for (int j = 0; j < score[i].length; j++) {
				System.out.print("점수 입력 : ");
				score[i][j] = sc.nextInt();
			}
		}
	}
	
	// 총점
	public static void total() {
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum[i] += score[i][j];
			}
		}
	}

	// 평균
	public static void avg() {
		for (int i = 0; i < avg.length; i++) {
			avg[i] = sum[i] / 3.0;
		}
	}

	// 학점
	public static void grade() {
		for (int i = 0; i < grade.length; i++) {
			switch ((int) avg[i] / 10) {
			case 10: case 9:
				grade[i] = 'A'; break;
			case 8:
				grade[i] = 'B'; break;
			case 7:
				grade[i] = 'C'; break;
			case 6:
				grade[i] = 'D'; break;
			case 5:
				grade[i] = 'E'; break;
			default:
				grade[i] = 'F'; break;
			}
		}
	}

	public static void sorted() {
		int[] sorted = Arrays.copyOf(sum, sum.length);
		Arrays.sort(sorted); // 오름차순
		for (int i = 0; i < sum.length; i++) { 
			for (int j = sum.length - 1; j >= 0; j--) { // 내림차순
				if (sum[i] == sorted[j]) {
					rank[i] = sum.length - j;
					break;
				}
			}
		}
	}

	public static void output() {
		for (int i = 0; i < name.length; i++) {
			System.out.printf("이름 : %s\n 국어 : %d\t영어 : %d\t수학 : %d\n" + "총점 : %d\t평균 : %.2f\t 학점 : %c\t 석차(등수) : %d등", name[i],
					score[i][0], score[i][1], score[i][2], sum[i], avg[i], grade[i], rank[i]);
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.println("===============성적 관리 프로그램================");
		System.out.print("학생 수 : ");
		int n = sc.nextInt(); // 학생 수
		
		name = new String[n]; // 학생 이름
		score = new int[n][3]; // 국,영,수
		sum = new int[n]; // 총점
		avg = new double[n]; // 평균
		rank = new int[n]; // 석차
		grade = new char[n]; // 학점
		
		input(n,name,score); // 이름, 국,영,수 점수 입력
		total(); // 총합
		avg(); // 평균
		grade(); // 학점
		sorted(); // 석차(등수)
		output(); // 출력

	}
}


/*
package quiz;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Score {
	private static int n = 3; // 학생수
	private static String[] name = new String[n]; // 학생 이름
	private static int[][] score = new int[n][3]; // 국,영,수
	private static int[] sum = new int[n]; // 총점
	private static double[] avg = new double[n]; // 평균
	private static int[] rank = new int[n]; // 석차
	private static char[] grade = new char[n]; // 학점

	static Scanner sc = new Scanner(System.in);

	// 학생 수, 이름, 과목 점수 입력 함수
	public static void input(int n) {
		for (int i = 0; i < score.length; i++) {
			System.out.print("이름 : ");
			name[i] = sc.next();
			for (int j = 0; j < score[i].length; j++) {
				System.out.print("점수 입력 : ");
				score[i][j] = sc.nextInt();
			}
		}
	}

	// 총점
	public static void total() {
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				sum[i] += score[i][j];
			}
		}
	}

	// 평균
	public static void avg() {
		for (int i = 0; i < avg.length; i++) {
			avg[i] = sum[i] / 3.0;
		}
	}

	// 학점
	public static void grade() {
		for (int i = 0; i < grade.length; i++) {
			switch ((int) avg[i] / 10) {
			case 10: case 9:
				grade[i] = 'A'; break;
			case 8:
				grade[i] = 'B'; break;
			case 7:
				grade[i] = 'C'; break;
			case 6:
				grade[i] = 'D'; break;
			case 5:
				grade[i] = 'E'; break;
			default:
				grade[i] = 'F'; break;
			}
		}
	}

	public static void sorted() {
		int[] sorted = Arrays.copyOf(sum, sum.length);
		Arrays.sort(sorted); // 오름차순
		for (int i = 0; i < rank.length; i++) {
			for (int j = n - 1; j >= 0; j--) { // 내림차순
				if (sum[i] == sorted[j]) {
					rank[i] = n - j;
					break;
				}
			}
		}
	}

	public static void output() {
		for (int i = 0; i < name.length; i++) {
			System.out.printf("이름 : %s\n 국어 : %d\t영어 : %d\t수학 : %d\n" + "총점 : %d\t평균 : %.2f\t 학점 : %c\t 석차(등수) : %d등", name[i],
					score[i][0], score[i][1], score[i][2], sum[i], avg[i], grade[i], rank[i]);
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.println("===============성적 관리 프로그램================");
		input(n); // 이름, 국,영,수 점수 입력
		total(); // 총합
		avg(); // 평균
		grade(); // 학점
		sorted(); // 석차(등수)
		output(); // 출력

	}
}
*/



