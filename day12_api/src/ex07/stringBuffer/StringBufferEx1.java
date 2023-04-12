package ex07.stringBuffer;

public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.hashCode());
		
		System.out.println("length         /       capacity");
		int len = sb.length();
		int size = sb.capacity();
		System.out.println(len + "     /      " + size);
		
		sb.append("daebo");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "     /      " + size);
		
		sb.append("happyvirus");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "     /      " + size);

		sb.append("12345 67890");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "     /      " + size);
	
		sb.append("12345 67890");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "     /      " + size);
		System.out.println(sb.hashCode()); // 똑같은 주소를 같다. 메모리 낭비를 줄인다.
		System.out.println(sb);
		
		sb.trimToSize(); // 용량크기 조절
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "     /      " + size);
	}
}
