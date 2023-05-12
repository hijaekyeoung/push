package cote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cote0427_사과담기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 스크린칸
		int m = sc.nextInt(); // 바구니칸
		int j = sc.nextInt(); // 사과 개수
		int result = 0; // 바구니의 이동거리의 최솟값
		int left = 1; // 바구니 왼쪽
		int right = m; // 바구니 오른쪽
		for (int i = 0; i < j; i++) {
			int location = sc.nextInt(); // 사과가 떨어지는 위치
			if(left <= location && location <= right) {
				continue;
			}
			if(left > location) {
				result += (left - location);
				right -= (left - location);
				left = location;
			} else {
				result += (location - right);
				left += (location - right);
				right = location;
			}
		}
		System.out.println(result);
	}
}
