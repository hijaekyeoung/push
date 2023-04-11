package ex02.StaticMember;

class Atm {
	int count; // 인스턴스 멤버
	static int total; // 스테틱 멤버

	public Atm(int amount) { // 생성자
		count += amount;
		total += amount;
	}
	
	// static member에서 일반 멤버 변수는 사용할 수 없다.
	public static void view() {
		total = total + 100;
//		count = count + 100;
	}
	
	public static void show(int count, int total) {
		// this는 해당 변수의 시작주소값을 가지고 있기 때문에 
		//static에서 사용할 수 없다.
//		this.count = count; 
//		this.total = total;
	}
	
	public void disp() {
		count += 50;
		total += 30;
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
}

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Atm.total);
		Atm at = new Atm(1000);
		at.disp();
		System.out.println("================");
		Atm at2 = new Atm(1000);
		at2.disp();
		System.out.println("================");
		Atm at3 = new Atm(1000);
		at3.disp();
		
	}
}
