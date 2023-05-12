package ex03.oop;

public class MainEntry {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
//		rect.setX1(2);
//		rect.setX2(4);
//		rect.setY1(6);
//		rect.setY2(8);
		
		
		rect.display();
		System.out.println();
		// rectangle class 생성 및 프린트
		Point pt = new Point();
		pt.setX(3);
		pt.setY(5);
		pt.display();
		
		//pt.setXY(3, 7);
		pt.display();
	}
	
}
