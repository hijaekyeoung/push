package quiz;

import java.util.Scanner;

//문제> 이름, 주소, 연락처 입력 받아서 출력하기(Scanner)
public class QuizEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("주소 : ");
		String address = sc.next();
		
		System.out.print("연락처 : ");
		String phoneNumber = sc.next();
		
		sc.close();
		
		System.out.println("저의 이름은 " + name + "이며");
		System.out.println("주소지는 " + address + "입니다.");
		System.out.println("연락처는 " + phoneNumber + "입니다.");
	}	
}
