package cote;

public class Cote07 {
	public static String solution(int n) {
		String answer = "";
		for (int i = 0; i < n; i++) {
			if(i%2 == 0)
				answer += "수";
			else
				answer += "박";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int n = 4;
		System.out.println(solution(n));
	}
}
