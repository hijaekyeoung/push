package cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cote0424 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int cnt_a = 0; // 찬성 수
		int cnt_r = 0; // 반대 수
		int cnt_i = 0; // 기권 수

		for (int i = 0; i < N; i++) {
			int result = Integer.parseInt(st.nextToken());
			if (result == 1) {
				cnt_a++;
			} else if(result == -1) {
				cnt_r++;
			} else {
				cnt_i++;
			}
		}
		int M = 0;
		if(N%2 != 0) {
			M = N/2 + 1;
		} else
			M = N/2;
		if (cnt_i >= M) {
			System.out.println("INVALID");
			return;
		}
		if (cnt_a > cnt_r) {
			System.out.println("APPROVED");
		} else if (cnt_a <= cnt_r)
			System.out.println("REJECTED");
	}
}
