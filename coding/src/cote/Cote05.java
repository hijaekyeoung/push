package cote;

import java.util.Arrays;

public class Cote05 {
	public int[] solution(int n) {
        int[] answer = {};
        if(n%2 == 0) // 짝수
            n /= 2;
        else
            n = n/2+1;
        
        answer = new int[n];
        
        for(int i=1;i<answer.length-1;i++){
            answer[i] = i+2;
                
        }
        return answer;
    }
	public static void main(String[] args) {
		
	}
}
