package cote;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
    	Stack<Integer> stack = new Stack<>();
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int sum = 0;
    	for (int i = 0; i < a; i++) {
    		int num = sc.nextInt();
    		if(num == 0) {
    			stack.pop();
    		} else
    			stack.push(num);
    	}
    	for(int i : stack) {
    		sum += i;
    	}
    	System.out.println(sum);
    }
}