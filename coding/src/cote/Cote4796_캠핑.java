package cote;

import java.util.Scanner;

public class Cote4796_캠핑 {
	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		while(true) {
			int L = sc.nextInt();
			int P = sc.nextInt();
			int V = sc.nextInt();
//			int L = Integer.parseInt(st.nextToken());
//			int P = Integer.parseInt(st.nextToken());
//			int V = Integer.parseInt(st.nextToken());

			if(L == 0 && P == 0 && V == 0) break;
			//System.out.printf("Case %d: %d", cnt, L*(V/P)+Math.min(L, V%P));
			System.out.println("Case "+cnt+": "+(L*(V/P)+Math.min(L, V%P)));
			cnt++;
		}
	}
}
