package ex06.instance_static;

// 객체 생성 없이 바로 사용 가능함

class A {
	int x, y;
	
	// static method
	public static void setData(int xx, int yy) {
		System.out.println(xx + ", " + yy);
	}
	
} // A class


public class StaticMethod {
	
	public static void main(String[] args) {
		A a = new A(); // 객체생성, 메모리할당,생성자함수 호출
		a.x = 999;
		A.setData(20, 33);
	}
}
