package quiz;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int result = rand.nextInt(100) + 1; // 난수(1~100)
		System.out.println("===== 난수 맞추기 =====");
		
		for(int i = 0;i < 5;i++) {
			
			if(result > 0 && result <= 100) {
			
			System.out.print("dan = ");
			int input = sc.nextInt();	
				
			if(input == result) {
				System.out.println("정답입니다. 난수는 " + result + "였습니다." );
			} else {
				if(input > result)
					System.out.println("DOWN");
				else
					System.out.println("UP");
				}
			}
			
		}
		
		//System.out.println(result);
		System.out.println("틀렸습니다.");
		System.out.println("난수는" + result + "입니다.");
	}
}

// 문제 업다운 1~100사이 난수 출력 dan = 난수값
// 사용자로 부터 5번의 기회
