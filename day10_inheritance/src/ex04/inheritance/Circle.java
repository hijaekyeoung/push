package ex04.inheritance;

import java.util.Scanner;

public class Circle extends Shape { // sub class
	
	public Circle() {
		super(2,3); // 반드시 첫줄에 와야함
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 값 = ");
		this.w = sc.nextInt();
	
	}
	
	public double calc() {
		this.result = (w * w * Math.PI);
		return result;
	}
	
	public void show() {
		System.out.println("반지름 = " + w + ", 원의 넓이 = " + calc());
	}
}
