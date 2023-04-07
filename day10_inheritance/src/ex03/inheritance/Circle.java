package ex03.inheritance;

public class Circle extends Point { // sub class, 또는 자식 클래스
	private int r;
	
	public Circle() {
		this.r = 5;
		System.out.println("Circle default constructor");
	}
	
	public Circle(int x, int y) {
		super(x,y); // 부모의 생성자 함수
		this.r = 55;
	}

	// 부모클래스로 부터 받은 출력함수, 단 생성자는 상속이 불가능하다!!!
	// output
	public void disp() {
		super.disp(); // 부모 클래스의 멤버에 접근 할 수 있는 인스턴스
		System.out.println(", " + r);
	}
}
