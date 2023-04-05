package quiz;

public class QuizEx1 {

	public static void add(int x, int y) {
		int add = x + y;
		System.out.println("더하기 : " + add);
	}

	public static void sub(int x, int y, int z) {
		int sub = x - y - z;
		System.out.println("빼기 : " + sub);
	}

	public static void message() {
		System.out.println("안녕하세요.");
		System.out.println("반가워요.");
	}

	public static void max(int x, int y) {
		if (x < y) System.out.println();
	}

	public static void main(String[] args) {
		add(1, 2);
		sub(2, 3, 5);
		message();
	}
}
// add(int, int)더하기 함수, sub(-): 뺴기 함수, message() : 인사말