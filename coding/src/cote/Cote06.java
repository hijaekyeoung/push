package cote;

public class Cote06 {
	public static int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        int min = 0; // max 다음으로 큰 값
        
        for(int i=0;i<numbers.length;i++){
            if(max < numbers[i] && numbers[i] < min) {
                min = max;
                max = numbers[i];
            }          
        }
        answer = max * min;
        return answer;
    }
	
	public static void main(String[] args) {
		int[] numbers = {0, 31, 24, 10, 1, 9};
		System.out.println(solution(numbers));
	}
}
