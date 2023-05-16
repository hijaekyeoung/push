package cote;

import java.util.Arrays;
import java.util.Scanner;

public class Cote1417_국회의원선거 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 후보수
		int dasom = sc.nextInt(); // 다솜이를 뽑은 사람의 수
		int[] vote = new int[n-1];
		int min = 0; // 매수해야하는 사람의 수
		for (int i = 0; i < n-1; i++) {
			vote[i] = sc.nextInt();
		}
		
		if(n == 1) { // 다솜이 혼자 후보인 경우
			System.out.println("0");
			return;
		}
		
		while(true) {
			Arrays.sort(vote);
			boolean flag = true;
			int last = vote.length-1; // 가장 많은 득표를 받은 후보의 득표 수
			
			if(dasom <= vote[vote.length-1]) {
				dasom ++;	// 다솜이 투표 +1
				vote[last] --;	// 가장 높은 투표를 받는 후보 -1 
				min ++;		// 한명 매수
				flag = false;	// 다솜이가 당선이 되지 못했으므로 false로 설정
			}
			if(flag)	// 다솜이보다 높은 투표수가 없는경우
				break;
		}
		
		System.out.println(min);
		
	}
}
