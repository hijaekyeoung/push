package cote;

import java.util.Arrays;

public class Cote03 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		solution(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(solution(arr)));
	}
	public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i = 0;i < num_list.length;i++) {
            
            answer[i] = num_list[num_list.length-1-i];
            
        }
        return answer;
    }
}