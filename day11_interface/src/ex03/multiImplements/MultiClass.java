package ex03.multiImplements;

import ex02.Abstract.Shape;
import ex02_Interface.IDraw;

public class MultiClass extends Shape implements Test, IDraw { // 클래스 인터페이스순으로
	
	private int num;
	
	public void disp() {
		System.out.println("MultiClass method");
	}
	
	@Override
	public double calc(double x) { // Shape
		System.out.println("Shape abstract class");
		return 0;
	}

	@Override
	public void show(String name) { // Shape
		System.out.println("Shape abstract class");
	}

	@Override
	public void draw() { // IDraw
		num = 888;
		System.out.println("IDraw interface" + num);
	}

	@Override
	public void testView() { // Test
		System.out.println("Test interface");
		
	}

}
