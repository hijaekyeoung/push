package ex06.string;

public class StringMethod {
	public static void main(String[] args) {
		String s1 = "happyjk";
		String s2 = "SEOUL";
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.replace("EO","korea"));
		System.out.println(s2);
		s2 = s2.replace("EO", "korea");
		System.out.println("-----------------------");
		s1 = s1 + s2;
//		s1 = s1.concat(s2); // 문자열 결합
		System.out.println(s1);
		System.out.println("-----------------------");
		
		String s3 = new String("     ab     cd     ");
		System.out.println(s3);
		System.out.println(s3.length()); // 문자열 길이
		s3 = s3.trim();
		System.out.println(s3);
		System.out.println(s3.length());
		System.out.println("-----------------------");

		//String s4 = new String("ab defgh 345545 kwkerq 930293");
		String s4 = new String("ab/defgh/345545/kwkerq/930293");
		String[] s5 = s4.split("/"); // 공백이 구분자 역할
		for (int i = 0; i < s5.length; i++) {
			System.out.println("분리된 " + i + "번 문자열 : " + s5[i]);
		}
		System.out.println("-----------------------");
		
		String s6 = "123-4567-8900";
		String[] s7 = s6.split("-");
		for (int i = 0; i < s7.length; i++) {
			System.out.println(s7[i]);
		}
		System.out.println("-----------------------");

		String s8 = "132126371264ahfh fjwhuwhruqw  dhjhqwewq1213 3132hj4";
		char ch = s8.charAt(12);
		System.out.println(ch);
		
		s8 = s8.substring(5,7); // 5,6번째 인덱스만 뽑힌다.
		System.out.println(s8);
		
		System.out.println("-----------------------");
		System.out.println("소문자로 출력 toLowerCase() : " + s2.toLowerCase());
		System.out.println("소문자로 출력 toUpperCase() : " + s1.toUpperCase());
		System.out.println(s2);
		
		char[] ch2 = s1.toCharArray();
		//for (int i = 0; i < ch2.length; i++) { // 배열은 변수로 표현
		for (int i = 0; i < s1.length(); i++) { // 문자열은 길이를 구하는 함수로
			System.out.print(ch2[i] + "  ");
		}
	}
}



















