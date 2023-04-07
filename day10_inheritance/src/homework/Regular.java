package homework;

public class Regular extends Employee {
	private int sales;

//	public Regular(int sales, int emp_num, String name, String department, String phone) {
//		super(phone,name,department,emp_num);
//		this.sales = sales;
//	}
	
	public Regular(int sales, int emp_num, String name, String department, String phone) {
		super(phone,name,department,emp_num);
		switch(department) {
		case "영업팀" :
			this.sales = 200 + (int)(200 * 0.3); break;
		case "인사팀" : 
			this.sales = 250; break;
		case "개발팀" :
			this.sales = 300; break;
		}
	}
	
	public Regular() {
		// TODO Auto-generated constructor stub
	}
	
	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}
	
	
}
