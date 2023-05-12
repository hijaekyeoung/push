package projectCode;

public class Regex {
	public static void main(String[] args) {
		String txt = "123456";
		boolean result1 = txt.matches("[0-9]+"); // matches() : 일치여부 판단(boolean return 값)
		System.out.println(result1);
		
		// replaceAll() : 정규표현식과 일치하는 모든 값 치환
		String txt2 = "power987*-;";
		// 영문자와 숫자를 제외한 문자를 모두 0으로 치환
		String result2 = txt2.replaceAll("[^a-z0-9]", "0");
		System.out.println(result2);
		
		// split(String regex) : 정규표현식과 일치하는 값 기준으로 나누기
		String txt3 = "pow1er9*-;";
		String[] txts = txt3.split("[0-9+]"); // 숫자부분을 기준으로 분할
		System.out.println(txts[0]);
		System.out.println(txts[1]);
	}
}
