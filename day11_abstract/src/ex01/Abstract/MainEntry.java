package ex01.Abstract;

abstract class Shape {
	double result = 0;
	public abstract double calc(); // 추상 메서드
	public abstract void draw();
	
	public void show() {
		System.out.println("Super class Shape");
	}
}

class Circle extends Shape { // sub class
	
	double r = 5.0;
	
	// 추상 클래스를 상속 받기 위해서는 
	// 반드시 추상 메서드를 상속 받아야하는 강제성이 존재한다.
	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("원의 넓이 : " + result + "입니다.");
	}
	
}

class Rect extends Shape {
	
	int w = 3, h = 5;
	@Override
	public double calc() {
		result = w * h;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("사각형의 넓이 : " + result + "입니다.");
		
	}
	
}

class Triangle extends Shape {
	int w = 5, h = 3;
	
	@Override
	public double calc() {
		result = w * h * 0.5; 
		return result;
	}
	@Override
	public void draw() {
		calc();
		System.out.println("삼각형의 넓이 : " + result + "입니다.");
	}
}


public class MainEntry {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		
		Rect r = new Rect();
		r.draw();
		
		// 추상 클래스는 자체적으로 객체를 생성할 수 없다.
		// 단 상속받은 클래스로는 객체 생성 가능
	
//		Shape sh = new Shape(); // 불가능
//		Shape sh = new Circle(); // 가능
		
		Shape sh = new Triangle();
		sh.draw();
	}
}







