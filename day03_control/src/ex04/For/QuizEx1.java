//*
package ex04.For;

public class QuizEx1 {
	public static void main(String[] args) {
		// 문제1 > 1~100 까지 3의 배수의 합과 개수를 구하는 프로그램 작성

		int sum_t = 0;
		int cnt = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum_t += i;
				cnt++;
			}
		}

		System.out.println("3의 배수의 합 : " + sum_t + "\t" + "개수 : " + cnt);
	}
}
//*/

/*
 * package ex04.For;
 * 
 * public class QuizEx1 { public static void main(String[] args) { // 문제1 >
 * 1~100 까지 합을 구하는 프로그램 작성
 * 
 * int sum = 0;
 * 
 * for (int i = 1; i <= 100; i++) { sum += i; }
 * 
 * System.out.println("1~100까지의 합 : " + sum);
 * 
 * sum = 0; // 누적할 변수 초기화
 * 
 * for (int i = 1; i <= 100; i++) { sum += i; }
 * 
 * System.out.println("1~100까지의 합 : " + sum); } }
 */