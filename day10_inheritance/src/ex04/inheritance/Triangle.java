package ex04.inheritance;

import java.util.Scanner;

public class Triangle extends Shape { // sub class
	public Triangle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("너비 값 :");
		this.w = sc.nextInt();
		System.out.print("높이 값 :");
		this.h = sc.nextInt();
	}
	
	public double calc() {
		result = w * h * 0.5;
		return result;
	}
	
	public void show() {
		System.out.println("결과 : " + calc());
	}
}
