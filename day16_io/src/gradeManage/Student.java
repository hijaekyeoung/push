package gradeManage;

public class Student {
	// 학번, 이름, 성별, 나이, 학과, 이수학점 
	private int sid;
	private String name;
	private char sex;
	private int age;
	private String department;
	private char grade;
	
	public Student() {	}
	
	public Student(int sid, String name, char sex, int age, String department, char grade) {
		this.sid = sid;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.department = department;
		this.grade = grade;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		if(sex == '남' || sex == '여') {
			this.sex = sex;
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 20) {
			this.age = age;
		} else {
			System.out.println("대학생이 아닙니다.");
		}
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", sex=" + sex + ", age=" + age + ", department=" + department
				+ ", grade=" + grade + "]";
	}
	
	
}
