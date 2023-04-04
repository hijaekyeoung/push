package ex05.sort;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSortTest {
	public static void main(String[] args) {
		
		int[] a = {7,3,5,2,8};
		System.out.println("sort 전 출력 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		Arrays.sort(a); // 오름차순
		
		System.out.println("\n\nsort 후 오름 출력 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println("\n\nsort 후 내림 출력 : ");
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i] + "\t");
		}
		
	}
}
