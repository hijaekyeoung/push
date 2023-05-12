package cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cote0510_바닥장식 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		char[][] room = new char[N][M];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine(); 
			for (int j = 0; j < M; j++) {
				room[i][j] = str.charAt(j);
			}
		}
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				// 세로가 '|'로 이어져있는 경우 1로 취급
				if(i!=0 && room[i][j] == '|' && room[i-1][j] == '|') {  
					continue;
				// 가로가 '-'로 이어져 있는 경우 1로 취급
				} else if (j !=0 && room[i][j] == '-' && room[i][j-1] == '-') {
					continue;
				}
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
