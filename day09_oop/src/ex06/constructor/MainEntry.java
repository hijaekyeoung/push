package ex06.constructor;

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		Point pt1 = new Point(1);
		Point pt2 = new Point(1, 2);
		
		pt.output();
		pt1.output();
		pt2.output();
		
	}
}
