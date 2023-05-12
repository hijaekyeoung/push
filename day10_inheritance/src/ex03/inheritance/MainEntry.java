package ex03.inheritance;

public class MainEntry {
	public static void main(String[] args) {
		Rect r = new Rect(30, 30);
		r.disp();
		Circle c = new Circle();
		c.disp();
		
		Point pt = new Point();
		pt.disp();
	
		Point pt2 = new Point(100,300);
		pt2.disp();
	}
}
