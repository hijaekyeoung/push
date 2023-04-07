package quiz;

public class MainEntry {
	public static void main(String[] args) {
		Sawon sw = new Sawon(001, "가나다", "대리", 3000000 ,"인사팀", 
				"010-1234-5768");
		sw.disp();
		
		System.out.println();
		
		Sawon sw1 = new Sawon();
		sw1.setEmp_num(002);
		sw1.setName("생성자");
		sw1.setRank("사원");
		sw1.setDepartment("개발팀");
		sw1.setSalery(2500000);
		sw1.setPhone("010-7373-3838");
		sw1.disp();
		
		Sawon sw2 = new Sawon("dd", "dd", "010-1212-3232", 0);
		sw2.disp();
	}
}
