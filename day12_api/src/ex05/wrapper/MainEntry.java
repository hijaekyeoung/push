package ex05.wrapper;

class Point {
}

public class MainEntry {
	public static void main(String[] args) {
		Integer ia = new Integer(10); // deprecated지만 사용은 가능
		Integer ib = new Integer("10");
		String su = "30";
		Point pt = new Point();

		System.out.println(pt);
		System.out.println(pt.toString());
		// 객체가 생성되면 주소값을 가지게 되지만
		// wrapper 클래스는 값을 출력한다.
		System.out.println(ia); 
		System.out.println(ia.getClass().getName()+'@'
				+Integer.toHexString(ia.hashCode())); 
	
		int x = 77;
		double y = 5.6;
		System.out.println(x + ", " + y);
		//y = x; // 묵시적 형변환
		x = (int)y; // 명시적 형변환 
		System.out.println(x + ", " + y);
		
		//Boxing vs UnBoxing
		int c = ia.intValue(); // jdk 4.x 이전에 사용하던 메소드
		int d = ib; // jdk 5.x 버젼 이후 자동 boxing,unboxing 됨
		int num = Integer.parseInt(su);
		System.out.println(c + num);
		System.out.println(c + d);
		System.out.println(ia.MAX_VALUE);
		System.out.println(ia.MIN_VALUE);
		
		Double dd = new Double(12.34);
		System.out.println(dd);
		System.out.println(dd.MAX_VALUE);
		System.out.println(dd.MIN_VALUE);
		
		c = (int)dd.doubleValue();
		System.out.println("형변환 c의 값은?" + c);
		
		int e = Integer.parseInt("123");
		int f = Integer.parseInt("1111111",2);
		System.out.println(f);
		System.out.println(e + 20);
		
		int xx = 3; // stack memory
		Integer yy = new Integer(3); // heap memory
		
		xx = yy; // autoboxing / unboxing
		
	}

}






















