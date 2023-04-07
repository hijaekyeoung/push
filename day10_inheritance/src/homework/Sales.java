package homework;

public class Sales extends Regular {
	private double commission;
	
	public Sales(int emp_num, String name, String department, String phone,int sales) {
		super(sales, emp_num, name, department, phone);
		if(department == "영업팀")
			this.commission = sales * 0.3;
		else
			this.commission = commission;
	}
	public Sales() {
		// TODO Auto-generated constructor stub
	}
	public double getCommition() {
		return commission;
	}

	public void setCommition(int commission) {
		this.commission = commission;
	}
	
	public void disp() {
		//super.disp();
		System.out.println("사번\t 이름\t 부서\t 번호\t         급여\t      커미션\t");
		System.out.printf("%d\t %s\t %s %s\t %d\t      %.2f\t",
				getEmp_num(),getName(),getDepartment(),getPhone(),getSales(),commission);
		System.out.println();
	}
}
