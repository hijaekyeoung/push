/*
package ex04.array;

public class MainEntry {
	public static void main(String[] args) {
		int[] arr = new int[100];
		
		for (int i = 0; i < arr.length; i++) {
			//arr[i] = i + 1;
			arr[i] = (int)(Math.random()*100)+2;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
			if ((i+1)%10 == 0) {
				System.out.println();
			}
		}
	}
}
*/
// 3
package ex04.array;

import java.util.Iterator;
import java.util.Scanner;

// 3차원 배열 !!
public class MainEntry {
	public static void main(String[] args) {
		int[] a = new int[30];
		int[][] a2 = new int[2][3]; // 초기화 도이어 있지 않을 때는 행,열 크기 생략x
		int[][] a3 = new int[][] {{1,2,3},{4,5,6}};
		int[][] a4 = {{1,2,3},{4,5,6}};
		//int[][] a5 = {1,2,3,4,5,6}; // error
		//int[][] a6 = new int[2][] {{1,2,3},{4,5,6}}; // error
		int[][] a7 = {{0,},{0,}}; // 0으로 다 초기화 가능
		
		// 배열 길이(크기)
//		System.out.println("1차원 배열 길이 : " + a.length); // 
//		System.out.println("2차원 배열 행길이 : " + a2.length);
//		System.out.println("2차원 배열 열길이 : " + a2[0].length);
//		System.out.println();
//		System.out.println("3차원 배열 면길이 : " + a8.length);
//		System.out.println("3차원 배열 행길이 : " + a8[0].length);
//		System.out.println("3차원 배열 열길이 : " + a8[0][0].length);
	
		//임의적인 데이터 입력 받아서 배열 데이터값 출력하는 프로그램 작성(3차원)
		Scanner sc = new Scanner(System.in);
		System.out.println("면,행,열 순으로 숫자를 입력해주세요.");
		int num1 =sc.nextInt(); int num2 =sc.nextInt(); int num3 =sc.nextInt();
		int[][][] a8 = new int[num1][num2][num3]; // [면][행][열]
		
		
		for (int i = 0; i < a8.length; i++) { // 면
			for (int j = 0; j < a8[0].length; j++) { // 행
				for (int k = 0; k < a8[0][0].length; k++) { // 열
					a8[i][j][k] = sc.nextInt();
				}
			}
		}
		
		for (int i = 0; i < a8.length; i++) {
			for (int j = 0; j < a8[0].length; j++) {
				for (int k = 0; k < a8[0][0].length; k++) {
					System.out.print("  a8["+i+"]["+j+"]["+k+"] = " + a8[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
























