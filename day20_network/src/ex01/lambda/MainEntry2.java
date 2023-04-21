//package ex01.lambda;
//
//interface Message {
//	int something();
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something();
//		System.out.println("Message interface something ; " + su);
//	}
//}
//
//public class MainEntry2 {
//	public static void main(String[] args) {
//		// Lambda Expression, JDK 1.8 이상
//		Person p = new Person();
//		
//		p.greeting(new Message() {
//
//			@Override
//			public int something() {
//				System.out.println("return type 안녕");
//				System.out.println("한주 열공 감사요!!");
//				return 0;
//			}
//		});
//		
//		System.out.println("====================");
//		p.greeting(() -> {
//			System.out.println("lambda return type 안녕");
//			return 200;
//		});
//	}
//	
//}
