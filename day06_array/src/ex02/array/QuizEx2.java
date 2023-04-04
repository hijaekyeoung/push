package ex02.array;

import java.util.Arrays;
import java.util.Scanner;

public class QuizEx2 {
	public static void main(String[] args) {
		int su = 0; // 유지보수
		//int[] arr = new int[su];
		int sum = 0;
		double avg = 0;
		boolean flag;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("강수량 평균 구하기");
		System.out.print("원하는 달 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			su = 31;
			break;
		case 4 : case 6 : case 9 : case 11 :
			su = 30;
			break;
		case 2 :
			if (month == 2) {
				flag = false;
				System.out.print("연도입력 : ");
				int year = sc.nextInt();
				if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0) {
					flag = true;
				}
				if(flag) {
					su = 29;
				} else
					su = 28;
			}
			break;
			
		default :
			System.out.println("잘못된 월을 입력하셨습니다. 1~12 사이 숫자를 입력해주세요");
			break;
			
		} // switch end
		
		int[] arr = new int[su];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		
		for(int data : arr) {
			sum += data;
		}
		
		avg = (double)sum/su;
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); //오름차순
		System.out.println(Arrays.toString(arr));
		
		System.out.print(su + "일 기준 평균 강수량 : ");
		System.out.printf("%.2f",avg);
	}
}

// 문제> 30일 기준
// 비가 온 날에 대한 강수량 평균(double타입 소수점 2자리) 구하는 프로그램 작성
// 추가> 원하는 달(월)을 입력 받아서 일수를 결정한다.(switch, 윤년/평년)
