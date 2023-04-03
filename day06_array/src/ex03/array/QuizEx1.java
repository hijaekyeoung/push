package ex03.array;

import java.util.Arrays;
import java.util.Scanner;

public class QuizEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[2][3];
		
		// input
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(j == a[i].length-1) {
					a[i][2] = a[i][1] * a[i][0];
				} else
					a[i][j] = sc.nextInt();
				
			}
		}
		
		// output
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}


/*
package ex03.array;

import java.util.Arrays;
import java.util.Scanner;

public class QuizEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = {{1,2,0},{5,7,0}};
		
		// input
		for (int i = 0; i < a.length; i++) {
			a[i][2] = a[i][0] * a[i][1];
		}
		
		// output
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
				
			}
			System.out.println();
		}
	}
}
*/

/*
package ex03.array;

import java.util.Arrays;
import java.util.Scanner;

public class QuizEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = {{3,10,2,8},{7,15,5,3},{0,0,0,0}};
		
		// input
		for (int i = 0; i < a[0].length; i++) {
			a[2][i] = a[1][i] + a[0][i];
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
				
			}
			System.out.println();
		}
	}
}
*/