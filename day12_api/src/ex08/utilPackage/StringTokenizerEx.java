package ex08.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		StringTokenizer st = 
				new StringTokenizer("사과=10|초콜릿=3|삼폐인=1","=|",true);
		
		while(st.hasMoreTokens()) { // 다음 요소가 있어?
			//System.out.println(st.nextToken()); 		
			String str = st.nextToken();
			if(str.equals("=")) System.out.print("\t");
			else if(str.equals("|")) System.out.print("\n");
			else System.out.println(str);
		}
	}
}

/*
package ex08.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("박정희/노태우/전두환/김영삼","/");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken()); // st.nextToken은 공백이 디폴트
		}
		
	}
}
*/