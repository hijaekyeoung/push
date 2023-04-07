package cote;

import java.util.Arrays;

public class Cote04 {
	public static int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        
        for(int i = 0;i < array.length;i++) {
            for(int j =i+1;j < array.length;j++) {
                if(array[i] < array[j]) {
                    max = array[j];
                    answer[1] = j;
                    break;
                }     
            }
        }
        
        answer[0] = max;
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr = {9,10,11,8};
		int[] array = solution(arr);
		System.out.println(Arrays.toString(array));
	}
}
