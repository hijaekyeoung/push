package ex05.constructor;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("TV 색상을 선택해주세요.");
		System.out.println("(red, orange, yellow, green, blue, black, white)");
		TV tv = new TV();
		tv.output();
//		tv.setColor(sc.next());
		System.out.println("1~10번의 채널 중 하나를 입력해주세요.");
//		tv.setChannel(sc.nextInt());
		TV tv2 = new TV(25);
		tv2.output();
		
		TV tv3 = new TV("green");
		tv3.output();
		
		TV tv4 = new TV("green",99);
		tv4.output();
		
	}
}

/*
 생성자 함수 : 멤버변수의 초기화가 목적이다.
	- 클래스명과 동일하다.
	- 리턴 타입 없음 (void조차 사용하지 않음)
	- 중복정의가 가능하다 (overload 가능)
Default constructor 갖고 있음. 
( 단, 사용자가 생성자 함수를 재정의 하면 디폴트 생성자 함수 기능 상실함 )
 */
