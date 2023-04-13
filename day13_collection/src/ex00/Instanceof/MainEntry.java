package ex00.Instanceof;

class A {}

class B extends A{}

public class MainEntry {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
	
		System.out.println("a instanceof A " + (a instanceof A));
		System.out.println("b instanceof A " + (b instanceof A));
		System.out.println("b instanceof B " + (a instanceof B)); // 부모는 자식에 접근할 수 없다
		System.out.println("b instanceof B " + (b instanceof B));
	}
}
