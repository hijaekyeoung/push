package ex04.apiObject;

class Circle {
	int x = 5, y = 5;
}

public class EqualsMain {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		// heap 영역에 존재하기 때문에 == 기호가 아닌 equals()로 값을 비교할 수 있다.
		if (c1 == c2) 
			System.out.println("같다.");
		else
			System.out.println("다르다.");
		int x = 3, y = 3;
		System.out.println("기본 자료형 비교");
		if (x == y) // stack 영역에서는 ==기호로 비교가 가능하다.
			System.out.println("same");
		else
			System.out.println("not same");
		System.out.println("==================================");
		System.out.println("참조 자료형 비교");
		String str1 = new String("korea");
		String str2 = new String("korea");
		System.out.println("***** equals() method *****");
		if (str1.equals(str2)) 
			System.out.println("same");
		else
			System.out.println("not same");
		System.out.println("==================================");
		
		String str3 = new String("korea");
		String str4 = new String("Korea");
		System.out.println("***** equals() method *****");
		if (str3.equalsIgnoreCase(str4)) // 대소문자 구분 안하고 비교
			System.out.println("same2222");
		else
			System.out.println("not same2222");
	}
}
