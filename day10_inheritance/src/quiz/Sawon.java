package quiz;

public class Sawon {
	// 사번, 이름, 직급, 부서, 급여, 연락처
	private int emp_num, salery;
	private String name, rank, department, phone;

	// 생성자 함수 3개 생성
	public Sawon(int emp_num, String name, String rank, int salery, String department, String phone) {
		super();
		this.emp_num = emp_num;
		this.name = name;
		this.rank = rank;
		this.department = department;
		this.phone = phone;
		this.salery = salery;
	}
	
	public Sawon() {
		super();
		this.emp_num = emp_num;
		this.name = name;
		this.rank = rank;
		this.department = department;
		this.phone = phone;
		this.salery = salery;
	}
	
	public Sawon(String rank, String department, String phone, int salery) {
		super();
		this.rank = rank;
		this.department = department;
		this.phone = phone;
		this.salery = salery;
	}

	// setter/getter
	public int getEmp_num() {
		return emp_num;
	}

	public void setEmp_num(int emp_num) {
		this.emp_num = emp_num;
	}

	public int getSalery() {
		return salery;
	}

	public void setSalery(int salery) {
		this.salery = salery;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// output
	public void disp() {
		System.out.println("사번\t 이름\t 직급\t 부서\t 급여\t\t 연락처");
		System.out.printf("%d\t %s\t %s\t %s\t %d\t %s", emp_num, name, rank, department, salery, phone);
		System.out.println();
	}
}
