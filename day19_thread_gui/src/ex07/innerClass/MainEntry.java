package ex07.innerClass;

class OuterClass { // 외부클래스
	static int no;
	String message = "Hello~~~~~";
	
	public void outerMethod() {
		System.out.println("outer method call~~~~");
	}
	
	class InnerClass { // 내부클래스
		int su = 99;
		public void show() {
			System.out.println(su);
			System.out.println(message);
		}
		public void disp() {
			outerMethod(); // 외부클래스 메소드 호출
		}
	}
}

public class MainEntry {
	public static void main(String[] args) {
		// 1.
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.disp();
		ic.show();
		System.out.println("========================");
		// 2.
		OuterClass.InnerClass inner = new OuterClass().new InnerClass();
		inner.show();
	}
}
