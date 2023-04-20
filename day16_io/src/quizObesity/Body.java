package quizObesity;

public class Body {
	private String name;
	private char gender;
	private double height, weight, bmi;
	private String obesity;
	
	public Body() {
		
	}
	
	public Body(String name, char gender, double height, double weight) {
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.bmi = weight / ((height/100.0) * (height/100.0));
		calObesity();
	}
	
	public void calObesity() {
		if(this.bmi < 18.5) {
			this.obesity = "저체중";
		} else if(this.bmi >= 18.5 && this.bmi < 23.0) {
			this.obesity = "정상";
		} else if(this.bmi >= 23.0 && this.bmi < 25.0) {
			this.obesity = "과체중";
		} else if(this.bmi >= 25.0) {
			this.obesity = "비만";
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}
	
//	public void setBmi(double height, double weight) {
//		if(gender == '남') {
//			this.bmi = weight / ((height-100.0)*0.9);
//		} else if(gender == '여') {
//			this.bmi = weight /((height-100.0)*0.85);
//		}
//	}
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	@Override
	public String toString() {
		return "BodyRecord [name=" + name + ", gender=" + gender + ", height=" + height + ", weight=" + weight
				+ ", bmi=" + String.format("%.2f", bmi) + " "+ obesity +"]\n";
	}
	
	
}
