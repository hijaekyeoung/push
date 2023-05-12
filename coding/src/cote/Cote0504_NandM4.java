package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// 1~N까지 자연수중에서 중복없이 M개를 고른 수열
public class Cote0504_NandM4 {

	public static int[] arr;
	public static int N,M;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		dfs(1,0);
		System.out.println(sb);
	}
	
	public static void dfs(int at, int depth) {
		if(depth == M) {
			for(int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i = at; i <= N; i++) {
			arr[depth] = i;
			dfs(i,depth+1);
		}
	}
	
	
	
}
