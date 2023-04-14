package cote;

public class Cote08 {
	public static int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
			answer += a[i]*b[i];
		}
        return answer;
    }
	
	public static void main(String[] args) {
		int n = 3;
		int[] a = {-1,0,1};
		int[] b = {1,0,-1};
		System.out.println(solution(a, b));
	}
}

