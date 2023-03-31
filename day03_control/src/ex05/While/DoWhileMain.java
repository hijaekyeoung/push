package ex05.While;

public class DoWhileMain {
	public static void main(String[] args) {
		
		int a = 1, b = 1; // 변수 초기화
		
		// 일단 선 실행 후 조건을 만족하지 못하면 실행하지 않는
		do {
			
			b = 1;
			do {
				
				System.out.print(a + " * " + b + " = " + (a*b));
				b++; // 증감식
				System.out.println();
				
			} while(b <= 9);
			
			System.out.println();
			a++;
			
		} while(a <= 9); // 문장 종결 기호
		
	}
}

/*
package ex05.While;

public class DoWhileMain {
	public static void main(String[] args) {
		
		int a = 1, b = 1; // 변수 초기화
		
		// 일단 선 실행 후 조건을 만족하지 못하면 실행하지 않는
		do {
			b = 1; // 다중 while, do~while문에서는 안쪽에 있는 변수 초기화
			do {
				
				System.out.println(b);
				b++; // 증감식
				
			} while(b <= 3);
			
			a++; // 증감식
			System.out.println();
			
		} while(a <= 2); // 문장 종결 기호
		
	}
}
*/


/*
package ex05.While;

public class DoWhileMain {
	public static void main(String[] args) {
		
		int a = 1;
		
		// 일단 선 실행 후 조건을 만족하지 못하면 실행하지 않는
		do {
			System.out.println(a);
			a++;
		} while(a < 11); // 문장 종결 기호
		
	}
}
*/
