package ex01.method;

public class MethodEx2 {
	
	// 4. 매개변수 있고, 리턴타입이 있는 경우
	public static String name(int x, String irum) {
		System.out.println("x = " + x);
		return irum;
	}
	
	public static String display(int x , String name) {
		for (int i = 0; i <= x; i++) {
			System.out.print(name + "\t");
		}
		return name;
	}
	public static void main(String[] args) {
		MainEntry me = new MainEntry();
		
		System.out.println(display(10, "&"));
		String star = display(20, "*");
		System.out.println(star);
		me.line();
		
		String str = name(10, "jk");
		System.out.println(str);
		me.line();
		
		System.out.println("name() call : " + name(99, "kiki"));
	}
}
