package ex04.For;

import java.util.Iterator;

// 전체 구구단 출력
public class QuizEx3 {
	public static void main(String[] args) {
		for(int i = 1;i <= 9;i++) {
			
			for(int j = 1;j <= 9;j++) {
				System.out.print(j + " * " + i + " = " + (i*j) + "\t");
			}

			System.out.println();
		}
	}
}
