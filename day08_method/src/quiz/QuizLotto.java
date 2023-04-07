package quiz;

import java.util.Arrays;

public class QuizLotto {

	public static void init() {
		int[] arr = new int[6];
		for (int i = 0; i < 6; i++) {
			arr[i] = (int)(Math.random()*45)+1; // 1~45까지의 난수 생성
			if (isCheck(arr, i)) {
				i--;
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		init(); // 숫자 중복시 로또 번호 초기화
	}
	
	// isCheck(int[] arr, int i) { } 같은지 아닌지 boolean 타입으로 구별
	public static boolean isCheck(int[] arr, int i) { // i : index
		boolean flag = false;
		
		for (int j = 0; j < i; j++) {
			if (arr[i] == arr[j]) {
				flag = true; // 숫자가 겹칠 때 true
			}

		}
		
		return flag;
	}
	
}

	