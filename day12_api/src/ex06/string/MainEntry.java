package ex06.string;

public class MainEntry {
	public static void main(String[] args) {
		int x = 999;
		String str = "Hello";
		System.out.println("str : " + str);
		
		char data[] = {'a','b','c'};
		str = new String(data);
		System.out.println("str : " + str);
		
		String msg = "cdefghi";
		System.out.println("Korea " + msg);
		System.out.println(msg);
	
		msg = msg.concat(" Korea"); // 문자열 결합
		System.out.println(msg);
	
		String str2 = "abcdef".substring(2);
		System.out.println("str2Index : " + str2);

		str2 = "abcdef123456789zxcv".substring(2,5); // 상한값 포함, 하한값미포함
		System.out.println("str2Index : " + str2);
	}
}