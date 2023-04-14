package cote;

import java.util.Arrays;

public class Cote09 {
	public static String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        Arrays.sort(c); // 오름차순
        for (int i = c.length-1; i >= 0; i--) {
			answer += c[i];
		}
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("zbcdsdsd"));
	}
}

