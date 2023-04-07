package homework;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sales s = new Sales(001, "김철수", "영업팀", "010-1234-5865", 200);
		Sales s2 = new Sales(003, "박형식", "개발팀", "010-1234-9292", 300);
		s.disp();
		s2.disp();
		Sales s3 = new Sales();
		s3.setName("다다다");
		s3.setEmp_num(006);
		s3.setDepartment("영업팀");
		s3.setPhone("010-3737-1212");
		s3.disp();
		System.out.println();
		PartTime pt = new PartTime(002, "김미영", "인사팀", "010-3939-8823", 10, 15000);
		PartTime pt2 = new PartTime(004, "진도준", "영업팀", "010-3939-8113", 20, 12000);

		pt.disp();
		pt2.disp();
	}
}
