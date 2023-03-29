package quiz;

import java.util.Scanner;

public class Quiz_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String str = sc.next();
		char ch = str.charAt(0);
		
		if(ch == '+') {
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		} else if(ch == '-') {
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		} else if(ch == '*') {
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		} else if(ch == '/') {
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		}
	}
}
