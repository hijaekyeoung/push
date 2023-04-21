package cote;

import java.util.Scanner;

public class Cote10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] milk = new int[N];
		int cnt = 0; // 마실수 있는 우유 수
		int next = 0; // 다음에 먹을 우유

		for (int i = 0; i < N; i++) {
			milk[i] = sc.nextInt();
		}

		for (int i = 0; i < milk.length; i++) {
			if (milk[i] == next && next == 0) {
				cnt++;
				next = 1;
			}
			if (milk[i] == next && next == 1) {
				cnt++;
				next = 2;
			}
			if (milk[i] == next && next == 2) {
				cnt++;
				next = 0;
			}
		}

		System.out.println(cnt);
	}
}

// 딸기 -> 초코 -> 바나나 012순
// 가게는 한 종류의 우유만 취급한다. 0 : 딸기우유가게, 1 : 초코우유가게, 2 : 바나나..
// 우유를 사마시거나 안사마시거나
// 가게를 한번 지나치면 다시 갈 수 없다.
// 영학이가 마실수 있는 우유의 최대 개수를 구해라