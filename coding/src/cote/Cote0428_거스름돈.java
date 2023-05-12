package cote;

import java.util.Scanner;

public class Cote0428_거스름돈 {
	public static void main(String[] args) {
		// 거스름돈은 오직 2원, 5원
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int cnt = 0;
		
		while(money > 0) {
			if(money%5 == 0) {
				cnt = money/5 + cnt;
				break;
			}
			
			money -= 2;
			cnt++;
		}
		
		if(money < 0) {
			System.out.println(-1);
		} else
			System.out.println(cnt);
		
	}
}
