package cote;

import java.util.Scanner;

public class Cote0426 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int num = 1;
		
		while(true) {
			if(a%num == 0 && b%num == 0) {
				System.out.println(num + " " + (a/num) + " " + (b/num));
			}
			num++;
			if(num > 1000) {
				break;
			}
		}

	}
}
