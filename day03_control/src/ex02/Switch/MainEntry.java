//*
package ex02.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.print("도시를 선택하세요(s,d,b,j) = ");
		Scanner sc = new Scanner(System.in);
		
//		String str = "korea";
//		char ch = str.charAt(4);
//		System.out.println(ch);
		char ch = sc.next().charAt(0);	// 문자열 입력받기 1번쨰 방법
		
		// 문자열 함수 중에 문자열에서 charAt(index) 인덱스번호 문자 가져오는 함수
		//String ch = sc.next();
		//char c = ch.charAt(0); 
		
		switch(ch) {
		case 's' : System.out.print("서울"); break;
		case 'd' : System.out.print("대구"); break;
		case 'b' : System.out.print("부산"); break;
		case 'j' : System.out.print("제주"); break;
		
		default :
			System.out.println("잘못 눌렀습니다. s,d,b,j중에 선택하세요.");
			System.exit(0); // 프로그램 강제종료
		} // switch end
		
		System.out.println("를(을) 선택하셨습니다.");
	}
}
//*/

/*
package ex02.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.print("도시를 선택하세요(s,d,b,j) = ");
		Scanner sc = new Scanner(System.in);
		String ch = sc.next();	// 문자열 입력받기
		
		switch(ch) {
		case "s" : System.out.print("서울"); break;
		case "d" : System.out.print("대구"); break;
		case "b" : System.out.print("부산"); break;
		case "j" : System.out.print("제주"); break;
		
		default :
			System.out.println("잘못 눌렀습니다. s,d,b,j중에 선택하세요.");
			System.exit(0); // 프로그램 강제종료
		} // switch end
		
		System.out.println("를(을) 선택하셨습니다.");
	}
}
*/

/*
package ex02.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("point = ?(1,2,3) ");
		int point = new Scanner(System.in).nextInt();

		switch (point) { // long형 제외한 정수형, 문자형이 올 수 있다.
			case 1: // 값 : 숫자 ,'문자', "문자열"
				System.out.println("포인트 1점");
				break;
	
			case 2:
				System.out.println("포인트 2점");
				break;
	
			case 3:
				System.out.println("포인트 3점");
				break;
	
			default: // 생략 가능함 - 에러처리 메시지
				System.out.println("없는 번호 입니다. 1,2,3중에 넣어주세요.");
		} // switch end
		
		System.out.println("main end!");
	}
}
*/