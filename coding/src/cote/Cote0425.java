package cote;

import java.util.Scanner;

public class Cote0425 {
	public static void main(String[] args) {
		// 대형 폭죽 1개, 1개불꽃 -> 중형 불꽃 k개 -> 소형 불꽃 k*k개 -> 불꽃 0
		// 총 불꽃 수 N = 1 + k + k*k
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 불꽃의 수

		System.out.println((int)Math.sqrt(N));
	}
}
