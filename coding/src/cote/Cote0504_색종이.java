package cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cote0504_색종이 {
	public static int[][] arr = new int[100][100];
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		int width = 0;
		int length = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			width = Integer.parseInt(st.nextToken());
			length = Integer.parseInt(st.nextToken());
			for (int j = width; j < width+10; j++) {
				for (int k = length; k < length+10; k++) {
					if(arr[j][k] != 1) {
						arr[j][k] = 1;
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
