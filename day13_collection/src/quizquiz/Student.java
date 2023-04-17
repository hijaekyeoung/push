package quizquiz;

public class Student implements Person{
	protected int stu_num, age;
	protected String name, school;
	
	public Student() {
		
	}
	
	public Student(int stu_num2,String name2,int age2,String school2 ) {
		this.stu_num = stu_num2;
		this.name = name2;
		this.age = age2;
		this.school = school2;
	}

	@Override
	public void work(int money) {
		System.out.println("아직 학생이라 돈을 벌지 못해");
	}

	@Override
	public void eat() {
		System.out.println("한 창 먹을 시기라 하루 5끼를 먹는다.");
	}

	@Override
	public void sleep() {
		System.out.println("야자까지 하느라 잠을 5시간까지 자지 못해");
	}

	public int getStu_num() {
		return stu_num;
	}

	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	
	
	
}
