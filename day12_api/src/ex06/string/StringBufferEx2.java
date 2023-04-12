package ex06.string;

public class StringBufferEx2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil");
		System.out.println(sb);
		
//		System.out.println(sb.reverse());
		System.out.println("---------------------");
		
		sb.insert(7, " my");
		System.out.println(sb);
		
		sb.replace(8, 10, "your"); // 문자열 변경
		System.out.println(sb);
		System.out.println(sb.capacity());
	
		sb.delete(0, 5);
		System.out.println(sb);
		
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.setLength(20); 
		System.out.println(sb);
		
	}
}
