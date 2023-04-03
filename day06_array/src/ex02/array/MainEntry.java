package ex02.array;

public class MainEntry {
	public static void main(String[] args) {
		//1. 
		char[] ch; // 배열 선언
		ch = new char[4]; // 배열 생성, 메모리에 할당
		
		// 2.
		char[] ch2 = new char[4]; // 배열 선언 및 생성
		// 배열 초기화
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		// 3.
		char[] ch3 = {'J','A','V','A','a','c','e'}; // 배열 선언과 동시에 초기화
		
		// 배열의 길이(크기)
		System.out.println("배열의 길이 : " + ch2.length);
		
		// 배열의 내용 출력
		System.out.println("ch[2] : " + ch[2]);
		System.out.println("--------------------------");
		for (int i = 0; i < 4; i++) {
			System.out.println("ch2["+ i + "] : " + ch2[i]);
		}
		
		System.out.println("--------------------------");
		for (int i = 0; i < ch3.length; i++) { // 배열의 길이를 구하는 필드 length 
			System.out.println("ch3["+ i + "] : " + ch3[i]);
		}
	}
}









