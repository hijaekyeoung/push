package ex01.generic;

import java.util.Date;

class Point { }

public class MainEntry {
	public static void main(String[] args) {
		GenericEx<String> t1 = new GenericEx<>();
		String[] str = {"abc","KBS","dirir"};
		t1.set(str); t1.print();
		System.out.println("=====================");

		GenericEx<Integer> t2 = new GenericEx<>();
		Integer[] num = {1,2,3,4,5,6,7,8};
		t2.set(num); t2.print();
		System.out.println("=====================");
		
		GenericEx<Double> t3 = new GenericEx<>();
		Double[] d = {12.34,323.4,312.1,31.0,122.7};
		t3.set(d); t3.print();
		System.out.println("=====================");
		
		GenericEx<Object> t4 = new GenericEx<>();
		Object[] obj = {"12.34",new Date(),11,'c',"text", new Point()};
		t4.set(obj); t4.print();
		System.out.println("=====================");
		
	}
}
