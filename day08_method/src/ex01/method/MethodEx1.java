package ex01.method;

import java.util.Scanner;

public class MethodEx1 {
	
	// 3. 매개변수 없고, 리턴타입 있는 경우
	public static int show() {
		return 100;
	}
	
	public static int max() {
		System.out.println("x, y = ");
		int x = new Scanner(System.in).nextInt();
		int y = new Scanner(System.in).nextInt();
		
		int max = (x > y) ? x : y;
		return max;
		//if(x > y) return x;
		//else return y;
	}
	
	public static void main(String[] args) {
		System.out.println(show());
		System.out.println(max());
	}
}
