package cote;

import java.util.Iterator;
import java.util.Scanner;

public class Cote01 {
	
	public static int solution(int[] sides) {
		int max = Math.abs(sides[0] + sides[1]);
        int min = Math.abs(sides[0] - sides[1]);
        int answer = max - min;
        return answer - 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sides = new int[2];
		for (int i = 0; i < sides.length; i++) {
			sides[i] = sc.nextInt();
			
		}
		System.out.println(solution(sides));
	}
}
