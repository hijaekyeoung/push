package cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Cote0501_나이순정렬 {
	public static class Person{
		private int age;
		private String name;
		
		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}
		
		@Override
		public String toString() {
			return age + " " + name + "\n";
		}
		
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		
		Person[] p = new Person[num];
		
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			p[i] = new Person(age, name);
		}
		
		Arrays.sort(p, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.age - o2.age;
			}
			
		});
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < num; i++) {
			sb.append(p[i]);
		}
		System.out.println(sb);
	}
}
