package ex01.method;

public class MainEntry {

	// 2. 매개변수 있고, 리턴타입 없는 경우
	public static void plus(int x, int y) {
		int sum = x + y;
		System.out.println("sum = " + sum);
	}
	
	public static void abs(int x) {
		if (x < 0) x = -x;
		System.out.println("절대값 : " + x);
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		plus(1, 2);
		abs(-9);
		line();
		info(); // static method는 이탤릭체로 표시
		line();
		System.out.println("main end");
	}

	// 1. 매개변수 없고, 리턴타입 없는 경우
	public static void info() {
		System.out.println("나의 이름");
		System.out.println("나의 전화번호");
		System.out.println("나의 사는 곳");
	}

	public static void line() {
		System.out.println("===========================");
	}


}
