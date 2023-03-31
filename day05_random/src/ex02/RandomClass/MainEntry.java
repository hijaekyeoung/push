package ex02.RandomClass;

import java.util.Random;

public class MainEntry {
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println(rand.nextDouble());
		
		int num = rand.nextInt();
		System.out.println(num);
		System.out.println("-----------------------");
		// rand.nextInt(n); // 0 ~ n-1값 추출
		
		System.out.println(rand.nextInt(5)); // 0 ~ 4
		System.out.println(rand.nextInt(5)+1); // 1 ~ 5
	}
}
