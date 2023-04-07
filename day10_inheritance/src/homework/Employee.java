package homework;

public class Employee {
	private int emp_num;
	private String name, department, phone;
	
	public Employee(String phone, String name, String department, int emp_num) {
		this.emp_num = emp_num;
		this.name = name;
		this.department = department;
		this.phone = phone;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public int getEmp_num() {
		return emp_num;
	}

	public void setEmp_num(int emp_num) {
		this.emp_num = emp_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public void disp() {
		System.out.println("사번\t 이름\t 부서\t 번호\t ");
		System.out.printf("%d\t %s\t %s %s\t",
				getEmp_num(),getName(),getDepartment(),getPhone());
		//System.out.println();
	}
}
