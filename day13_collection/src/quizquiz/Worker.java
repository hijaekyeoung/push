package quizquiz;

public class Worker implements Person{
	protected int money;
	protected int age;
	protected char sex;
	
	public Worker() {

	}

	public Worker(int money, int age, char sex) {
		super();
		this.money = money;
		this.age = age;
		this.sex = sex;
	}

	@Override
	public void work(int money) {
		System.out.println("한 달 동안 일을 해서 월급을" + money + "원을 벌었다.");
	}

	@Override
	public void eat() {
		System.out.println("사람은 밥을 먹어야 산다.");
	}

	@Override
	public void sleep() {
		System.out.println("일을 해서 너무 졸립다.");
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	
	
}
