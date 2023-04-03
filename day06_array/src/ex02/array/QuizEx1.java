package ex02.array;

import java.util.Arrays;
import java.util.Random;

public class QuizEx1 {
	public static void main(String[] args) {
		// 임의의 데이터 7개 입력 받고, 찾을 임의의 데이터도 입력 받거나 해서
		// 홀수 인덱스 위치 데이터만 출력
		int[] a = new int[] {3,55,6,3,45,32,321,52,65,77};
		
//		for (int i = a.length-1; i >= 0; i--) {
//			System.out.print(a[i] + "\t");
//			System.out.print("a["+i+"] = " + a[i] + "\n");
//			
//		}
		// 확장for문
		// for(자료형 변수명 : 컬렉션명 또는 배열명) {반복구문;}
//		int loop = 52;
//		
//		for(int item : a) {
//			if(loop == item) {
//				break;
//			}
//			System.out.println(item);
//		}
		
		// 2 . 홀수 인덱스 위치 데이터만 출력
		for (int i = 0; i < a.length; i++) {
			if(i%2 == 0) continue;
			System.out.print("a["+i+"] = " + a[i] + "\n");
		}
	}
}

/*
package ex02.array;

import java.util.Arrays;
import java.util.Random;

public class QuizEx1 {
	public static void main(String[] args) {
		// 임의의 데이터 7개 입력 받고, 찾을 임의의 데이터도 입력 받거나 해서
		// 개수 구하는 프로그램 작성
		Random rand = new Random();
		int[] a = new int[7];
		
		int cnt = 0;
		int seek = rand.nextInt(7)*1;
		
		// 임의의 난수 7개를 배열에 입력
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*7)+1;
		}
		
		// 임의의 난수 7개와 찾을 데이터 숫자와 같은 경우 cnt 1씩 증가
		for (int i = 0; i < a.length; i++) {
			if (a[i] == seek) {
				cnt++;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("찾는 숫자 : " + seek);
		System.out.println("찾는 숫자 개수 : " + cnt);
	}
}
*/

/*
package ex02.array;

public class QuizEx1 {
	public static void main(String[] args) {
		// 배열 여러 개 데이터 중에서 7의 개수를 찾기
		int[] a = new int[] {7,3,7,8,1,9,7,100,12,7,33,7};
		
		int seek = 7;
		int cnt = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == seek)
				cnt++;
		}
		
		System.out.println("7의 개수 : " + cnt);
	}
}
*/

/*
package ex02.array;

public class QuizEx1 {
	public static void main(String[] args) {
		// 배열 5개 데이터 선언하고, 합 구하기
		int[] a = new int[] {1,2,3,4,55};
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		System.out.println(sum);
		//System.out.println((double)sum/a.length);
	}
}
*/