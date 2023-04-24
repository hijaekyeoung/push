//package ex01.lambda;
//
//interface Message {
//	int something(int x); // int return type, parameter o
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something(30);
//		System.out.println("Message interface something ; " + su);
//	}
//}
//
//public class MainEntry3 {
//	public static void main(String[] args) {
//		// Lambda Expression, JDK 1.8 이상
//		Person p = new Person();
//		
//		p.greeting(new Message() {
//
//			@Override
//			public int something(int x) {
//				System.out.println("return type, parameter 0 안녕");
//				System.out.println("한주 열공 감사요!!");
//				return 50;
//			}
//		});
//		
//		System.out.println("====================");
//		//p.greeting(x -> { // 람다형태, 자료형 안써도 됨, 괄호도 안써도 됨
//		p.greeting((x) -> { // 람다형태, 자료형 안써도 됨, 괄호도 안써도 됨
//			System.out.println("lambda return type, parameter 0 안녕");
//			return 200;
//		});
//	}
//	
//}
