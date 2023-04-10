package ex01_Interface;

interface A { // 인터페이스 - abstract method, final field만 갖는다.
	int x = 90; // final static int x = 90; 와 동일
	final int y = 7777;
	char ch = 'A';
	
	// 추상메소드
	public void show(); // public abstract void show();
	public abstract void disp();
}

interface B {
	void view(); // 추상메서드
}

interface C {
	String name = "happy";
	public void draw(); // 추상
}

interface D extends B { // 인터페이스간의 상속이 가능하다.
	void dview();
}
////////////////////////////////////////////////////////////////
class Rect implements D {

	@Override
	public void view() { // B interface에서 상속받은 메소드
		// TODO Auto-generated method stub
	}
	@Override
	public void dview() { // D interface에서 상속받은 메소드
		// TODO Auto-generated method stub
	}
	
	public int plus(int x,int y) {
		return x + y;
	}
	
}
////////////////////////////////////////////////////////////////
class Shape {
	
}

class Circle implements C {

	@Override
	public void draw() {
		System.out.println(name + "입니다.");
	}
	
}

class Multi extends Shape implements B,C,A {
//	x = 100; // final 이기때문에 변경 불가
	
	@Override
	public void show() { //A
	}
	@Override
	public void disp() { //A
	}
	@Override
	public void draw() { //C
	}
	@Override
	public void view() { //B
	}
}

public class MainEntry {
	public static void main(String[] args) {
//		A a = new A(); // 인터페이스는 객체 생성 할 수 없다.
		Circle c = new Circle();
		c.draw();
	}
}
