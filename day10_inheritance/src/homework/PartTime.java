package homework;

public class PartTime extends Employee {
	private int w_day, pay;

	public PartTime(int emp_num,String name, String department, String phone,int w_day, int pay) {
		super(phone,name,department,emp_num);
		this.w_day = w_day;
		this.pay = pay;
	}

	public int getW_day() {
		return w_day;
	}

	public void setW_day(int w_day) {
		this.w_day = w_day;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	@Override
	public void disp() {
		super.disp();
		System.out.printf("근무일수 : %d 일당 : %d 급여: %d",w_day,pay,w_day*pay);
		System.out.println();
	}
}
