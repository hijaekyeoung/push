package ex03.inheritance;

public class Point { // super class
	protected int x, y;

	// 생성자 함수
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("x, y constructor");
	}
	
	public Point() {
		x = y = 10;
		System.out.println("default constructor");
	}
	
	public Point(int x) {
		//this(x, 9);
		System.out.println("x constructor");
	}

	// setter/getter
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
	// output
	public void disp() {
		System.out.print(x + ", " + y);
	}
}

//class Circle extends Point {
//	
//}

