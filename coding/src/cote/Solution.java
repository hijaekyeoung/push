package cote;

import java.util.Scanner;

class Solution {
	static int AnswerN; // 결과값
	static int N;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		String[][] arr;
		int T = sc.nextInt();
		
		for (int i = 1; i <= T; i++) {
			N = sc.nextInt();
			arr = new String[N][N];

			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					arr[j][k] = sc.next();
				}
			}
			
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if(arr[j][k] == "X") {
						if(arr[j-1][k] == "H") {
							AnswerN += 1;
						} else if(arr[j+1][k] == "H") {
							AnswerN += 1;
						} else if(arr[j][k+1] == "H") {
							AnswerN += 1;
						} else if(arr[j][k-1] == "H") {
							AnswerN += 1;
						}
					}
				}
			}
			
			System.out.println("#"+i+" "+AnswerN);
		}

	}
}
