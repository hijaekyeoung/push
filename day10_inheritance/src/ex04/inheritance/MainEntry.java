package ex04.inheritance;

public class MainEntry {
	public static void main(String[] args) {
//		Shape sh = new Shape();
//		sh.show();
		
		Shape sh = new Circle(); // 다형성
		sh.show();
		
		sh = new Triangle(); // 다형성
		sh.show();
		
//		Circle c = new Circle();
//		System.out.println(c);
//		c.show();
//		
//		System.out.println("=========");
//		Triangle t = new Triangle();
//		t.show();
//		
//		t.setH(20);
//		t.setW(30);
//		t.show();
	}
}
