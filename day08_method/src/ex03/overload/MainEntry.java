package ex03.overload;

public class MainEntry {
	
	public static void line() {
		System.out.println("-------------------");
	}
	// array : length 필드 <-- 배열의 크기,
	// String : length() 문자열의 길이를 구하는 함수
	public static void line(String str) { 
		System.out.println(str);
	}
	
	public static void line(int n, String str) { 
		for (int i = 1; i < n; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		line("*");
		line("$$$");
		line(10, "$");
		line(20, "A");
		
		line();
		plus(20);
		plus(12.34);
		plus("Leo");
	}

	public static void plus(int x) {
		System.out.println(x + 100);
	}

	public static void plus(int x, int y) {
		System.out.println(x + y);
	}

	public static void plus(double x) {
		System.out.println(x + 100);
	}

	public static void plus(String x) {
		System.out.println(x + 100);
	}
}
