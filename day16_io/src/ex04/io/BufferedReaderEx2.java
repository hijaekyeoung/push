package ex04.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//System.out.println("input : ");
		int a = Integer.parseInt(br.readLine());
		//System.out.println("input : ");
		int b = Integer.parseInt(br.readLine());
	
		System.out.println(a + b);
	}
}
