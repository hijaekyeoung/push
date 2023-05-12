package cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cote0504_다리놓기 {
	
	static int[][] dp = new int[30][30];
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int n = Integer.parseInt(st.nextToken()); // 서쪽
			int m = Integer.parseInt(st.nextToken()); // 동쪽
		
			sb.append(combi(m,n)).append("\n");
		}
		System.out.println(sb);
	}
	
	public static int combi(int m, int n) {
		if(dp[m][n] > 0) {
			return dp[m][n];
		}
		
		if(m == n || n == 0) {
			return dp[m][n] = 1;
		}
		
		return dp[m][n] = combi(m-1,n-1) + combi(m-1,n);
	}
}
