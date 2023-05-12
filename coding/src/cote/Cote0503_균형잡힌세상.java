package cote;

import java.util.Scanner;

public class Cote0503_균형잡힌세상 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		char[] charArr = N.toCharArray();
		int len = charArr.length;
		
		int nextAdd = 0;
		StringBuilder sb = new StringBuilder();
		
		for (int i = len-1; i >= 1; i--) {
			int num = (int)charArr[i] - '0';
			int nowNum = num + nextAdd;
			nextAdd = nowNum >= 5 ? 1:0;
			sb.append(0);
		}
	
		sb.insert(0, (int)(charArr[0]-'0') + nextAdd);
		System.out.println(sb.toString());
		
		
	}
}
