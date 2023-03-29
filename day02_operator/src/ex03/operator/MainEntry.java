//*
package ex03.operator;

import java.util.Scanner;

//최단산쉬관논삼대콤
public class MainEntry {
	
	public static void main(String[] args) {
		// 삼항(조건)연산자 : (조건) ? 참 : 거짓;
		
		int x, y, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("integer data 2 input = ");
		
		x = sc.nextInt(); y = sc.nextInt(); 
		
//		if(x > y) result = x;
//		else result = y;
		
		result = (x > y) ? x : y;
		
		System.out.println("max = " + result);
	
		String str = null;
		System.out.println("year = ");
		int year = sc.nextInt();
		
		// if 판정 ?
		
		str = (year == 2000) ? "맞다" : "틀리다";
		System.out.println(year + "년도 : " + str);
	}
}
//*/

/*
package ex03.operator;
//최단산쉬관논삼대콤

public class MainEntry {
	
	public static void main(String[] args) {
		// 논리연산자 : &,&&(and), |,||(or), ^(xor), !
		int A = 1;
		int B = 2;
		
		// 2진 논리는 결과를 값으로 출력
		System.out.println(A&B); // 0001 & 0010 : 0000 -> 0
		System.out.println(A|B); // 0001 | 0010 : 0011 -> 3
		System.out.println(A^B); // 0001 ^ 0010 : 0011 -> 3
		
		//10진 논리는 결과를 true,false로 출력
		int x = 10, y = 20, z = 30;
		boolean flag = false;
		
		//flag = (x < y) && (y < z);
		flag = (x > y) && (y > z); // '&&'연산일 때 앞의 값이 거짓이면 뒤는 수행하지 않는다.
		System.out.println(flag);
		
		flag = (x < y) || (y < z); // '||'연산일 떄 앞의 값이 참이면 뒤는 수행하지 않는다.
		//flag = (x > y) || (y > z);
		System.out.println(flag);
	}
}
*/