package cote;

import java.util.Scanner;

public class Cote05009_아리의샌드위치 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int m = sc.nextInt();
		if(s<1024) {
			System.out.println("No thanks");
		}else {
			int remain = s-1023;
			int borrow = m;
			if((remain&borrow) == remain) { // and 연산자
				System.out.println("Thanks");
			}else{
				System.out.println("Impossible");
			}
			
		}
		
	}
}
