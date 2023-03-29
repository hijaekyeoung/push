package quiz;

public class QuizEx01 {
	
	public static void main(String[] args) {
		// 1. 변수 선언
		int pay = 567890;
		int man, chun, back, sip; // 몫
		int man_na, chun_na, back_na; // 나머지
		
		// 2. 메세지 출력 및 입력받기
		// 3. 처리(계산)
		
		man = pay / 10000;
		man_na = pay % 10000;
		
		chun = man_na / 1000;
		chun_na = man_na % 1000;
		
		back = chun_na / 100;
		back_na = chun_na % 100;
		
		sip = back_na / 10;
		
		System.out.println("\n\n만원 : " + man
							+ "장\n천원 : " + chun
							+ "장\n백원 : " + back
							+ "장\n십원 : " + sip + "개"
				);
		System.out.println("==========================");
		
		// 4. 결과출력(화면)
//		System.out.println("만원 : " + pay/10000 + "장");
//		pay = pay % 10000;
//		System.out.println("천원 : " + pay/1000 + "장");
//		pay = pay % 1000;
//		System.out.println("백원 : " + pay/100 + "개");
//		pay = pay % 100;
//		System.out.println("십원 : " + pay/10 + "개");
		
	}
}

/*
 	문제1 월급을 단위로 계산하기
 	int pay = 567890;
 	result :
 	만원 : 56장
 	천원 : 7장
 	백원 : 8개
 	십원 : 9개
*/











