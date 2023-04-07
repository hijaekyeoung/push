package ex02.oop;

class Circle {
	private int x ,y, r;
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
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

	public void display() {
		System.out.println(x+", " + y +", " + r);
	}
}

public class CircleMain {
	public static void main(String[] args) {
		Circle c = new Circle(); 
		c.setR(10);
		System.out.println(c.getR());
		c.display();
	}
	
}
