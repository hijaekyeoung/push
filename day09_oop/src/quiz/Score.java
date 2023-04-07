package quiz;

public class Score {
	private String name;
	private int kor, eng, math, total;
	private double avg;
	private char grade;
	
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = this.kor + this.eng + this.math;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = total/3.0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade() {
		switch((int)this.avg/10) {
		case 10: case 9: this.grade = 'A'; break;
		case 8: this.grade = 'B'; break;
		case 7: this.grade = 'C'; break;
		case 6: this.grade = 'D'; break;
		case 5: this.grade = 'E'; break;
		default:this.grade = 'F'; break;
		}
	}
	
	public void calTotal() {
		this.total = this.kor + this.eng + this.math;
	}
	
	public void calAvg() {
		this.avg = this.total / 3.0;
	}
	
	public void calGrade() {
		
	}

}




