package cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Cote0510_30 {
	public static void main(String[] args) throws Exception{
		//양수 N, 30의 배수가 되는 가장 큰 수를 만든다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int sum = 0;
		
		// 해당 숫자 재배치
		char[] charArr = N.toCharArray();
		Arrays.sort(charArr);
		int len = charArr.length;
		
		StringBuilder sb = new StringBuilder();
		for (int i = len-1; i >= 0; i--) {
			int num = charArr[i] - '0';
			sum += num;
			sb.append(num);
		}
		
		if(charArr[0] != '0' || sum%3 != 0) {
			System.out.println(-1);
			return;
		}
		
		System.out.println(sb.toString());
	}
}
