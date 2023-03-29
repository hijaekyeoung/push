//*
package ex01.operator;

//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//산술연산자 : +,-,*,/,%,^,........
		int x = 10, y = 20;
		int gob = x * y;
		
		System.out.println(gob);
		System.out.println("x * y :" + (x*y));
		System.out.println(x + " * " + y + " = " + (x*y));
		System.out.println("=====================");
		
		System.out.println("3+4*5 = " + (3+4*5));
		System.out.println("(3+4)*5 = " + ((3+4)*5));
		
		// 정수 (+,-,*,/,%,^.......) 정수 = 정수
		System.out.println("\n\n7/3 = " + (7 / 3)); // 몫
		System.out.println("7%3 = " + (7 % 3)); // 나머지
		
		// 정수 (+,-,*,/,%,^.......) 정수 = 정수
		System.out.println("\n 7 / 3 = " + (7 / 3)); // 2
		System.out.println("7/3.0 = " + (7 / 3.0)); // 2
		System.out.println("7/3 = " + (7 / 3.0)); // 몫
	}
}
//*/

/*
package ex01.operator;

//최단산쉬관논삼대콤
public class MainEntry { 
	public static void main(String[] args) {
		//단항 연산자 : 증감 ==> ++, --, ~,...
		int x = 10, y;
		
		y = ~x; // 비트부정 : -(원래값 + 1) ==> 출력 결과
		
		System.out.println("x = " + x + "\ty= " + y); // x=10, y=-11
	}
}
*/

/*
package ex01.operator;

//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//단항 연산자 : 증감 ==> ++, --, ~,...
		int x = 10, y;
		//y = x++; // 후위 연산 : 대입먼저, 연산은 나중에
		//y = ++x; // 전위 연산 : 연산먼저, 대입은 나중
		//y = x--;
		
		x++;
		y = x;
		
		System.out.println("x = " + x + "\ty= " + y);
	}
}
*/