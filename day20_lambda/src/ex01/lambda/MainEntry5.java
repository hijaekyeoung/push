package ex01.lambda;

// 타입을 써야할 상황이 있다.
@FunctionalInterface
interface Message {
	void something(int x, int y); // parameter o
	//int good(int x);
}
@FunctionalInterface
interface Talk {
	void something(String x, String y);
}

class Person {
	public void greeting(Message msg) {
		msg.something(3,5);
	}
	
	public void greeting(Talk msg) {
		msg.something("Hello","DeaBo!!");
	}
}

public class MainEntry5 {
	public static void main(String[] args) {
		// Lambda Expression, JDK 1.8 이상
		Person p = new Person();
		
		p.greeting(new Message() {

			@Override
			public void something(int x, int y) {
				System.out.println("x = " + x + " y = " + y);
			}
		});
		
		System.out.println("====================");
		
		char ch ='K';
		
		// p.greeting( (x,y) -> { // 에러발생, 타입에 대해서 애매해서 타입을 정확히 써야함
		//p.greeting((int x, int y) -> { 
		p.greeting((String x, String y) -> { // 람다형태, 자료형 안써도 됨
			System.out.println("x = " + x + " y = " + y);
			//ch = 'P'; // 값 변경할 수 없다.
			System.out.println(ch);
			
			//num = 500; // static 변수값은 변경 가능
			//System.out.println(num);
		});
	}
	
}
