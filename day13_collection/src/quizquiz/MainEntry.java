package quizquiz;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Worker> w_list = new ArrayList<>(); // worker
		ArrayList<Student> s_list = new ArrayList<>(); // student
		Worker w = null;
		Student s = null;

		while (true) {
			if (w == new Worker()) {
				if (w_list.size() != 0) {
					for (int i = 0; i < w_list.size(); i++) {
						if (w.sex == 'M')
							w_list.add(i, new Worker(sc.nextInt(), sc.nextInt(), 'M'));
						else if (w.sex == 'W') {
							w_list.add(i, new Worker(sc.nextInt(), sc.nextInt(), 'W'));
						}
					}
				}
			}
			else if (s == new Student()) {
				if (s_list.size() != 0) {
					for (int i = 0; i < s_list.size(); i++) {
						if (s.getSchool() == "중학교") {
							System.out.println("");
							s_list.add(i, new Student(sc.nextInt(),sc.next(),sc.nextInt(),"중학교"));
						}							
					}
				}
			}
		}

	}
}
