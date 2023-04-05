package ex02.method;

// Main method의 String[] args 인자 컴파일 가능
// Run configuration - arguments - 값입력
public class MainEntry {
	
	public static void main(String[] args) {
		
		if(args.length < 1) {
			System.out.println("using error ");
			return; // 제어권 넘김
		}
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		String s1 = args[0];
		String s2 = args[1];
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		System.out.println("=================");
		System.out.println(s1 + ", " + s2);
		System.out.println("plus = " + (num1+num2));
	}
}
