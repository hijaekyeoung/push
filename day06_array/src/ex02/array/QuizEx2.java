package ex02.array;

import java.util.Arrays;
import java.util.Scanner;

public class QuizEx2 {
	public static void main(String[] args) {
		int su = 30;
		int[] arr = new int[su];
		int sum = 0;
		double avg = 0;
		
		System.out.println("강수량 평균 구하기");
		for (int i = 0; i < su; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		
		for(int data : arr) {
			sum += data;
		}
		
		avg = (double)sum/su;
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.print("30일 기준 평균 강수량 : ");
		System.out.printf("%.2f",avg);
	}
}

// 문제> 30일 기준
// 비가 온 날에 대한 강수량 평균(double타입 소수점 2자리) 구하는 프로그램 작성
