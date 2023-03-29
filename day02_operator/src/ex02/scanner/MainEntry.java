package ex02.scanner;

import java.util.Scanner;

public class MainEntry { // ex02.scanner.MainEntry
	public static void main(String[] args) {

		// 표준 입력 : System.in
		// ctrl + shift + o : 자동 임포트
		Scanner sc = new Scanner(System.in); // 객체생성, 메모리할당,생성자함수자동호출
		System.out.print("정수 데이터 입력 요망 : ");
		int su = sc.nextInt();
		
		System.out.println("\n\n입력 받은 수 : " + su);
		
		// ctrl + shift + / : 여러줄 주석
		// ctrl + shift + \ : 여러줄 주석해제
	}
}
