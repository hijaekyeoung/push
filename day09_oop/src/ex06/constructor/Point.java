package ex06.constructor;

public class Point {
	private int x, y;

	// 생성자 함수 3개
	public Point() {
		this(101,100);
		//this.x = 100;
		//this.y = 100;
	}
	
	public Point(int x) {
		super(); // 부모클래스의 생성자 함수
		this.x = x;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void output() {
		System.out.println(x + ", " + y);
	}
}
