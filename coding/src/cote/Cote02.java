package cote;

import java.util.Scanner;

// 순서쌍의 개수
public class Cote02 {
	
    public static int solution(int n) { 
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
            if(n%i == 0) {
                answer++;
            }
        }
        return answer;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(solution(n));
	}
}
