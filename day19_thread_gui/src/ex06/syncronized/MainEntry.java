package ex06.syncronized;

class Atm {
	private int money;

	public Atm(int money) { // 생성자 함수
		this.money = money;
	}

	// 입금 함수
	public synchronized void deposit(int amount, String name) {
		money += amount;
		System.out.println(name + " : 입금금액 " + amount);
	}

	// 출금 함수
	public void withdraw(int amount, String name) {
		synchronized (this) {
			if ((money - amount) > 0) {
				
				Thread.yield();
				
				money -= amount;
				System.out.println(name + " : 출금금액 " + amount);
			} else
				System.out.println(name + "님 잔액이 부족합니다. ");
		}
	}

	// 잔고 확인 함수
	public void getMoney() {
		System.out.println("                 잔액은 " + money);
	}
}

class UserAtm extends Thread {
	Atm obj;
	boolean flag = false;
	
	public UserAtm(Atm obj, String name) {
		//new Thread(name);
		super(name); // 부모생성자 Thread(name)
		this.obj = obj;
	}

	@Override
	public void run() { // 스레드 실행부(구현부)
		
		for (int i = 0; i < 2; i++) {
			try {
				sleep(50); // 예외처리
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(flag) {
				obj.deposit((int)(Math.random()*10+2) * 100, getName());
			} else {
				obj.withdraw((int)(Math.random()*10+2) * 100, getName());
			}
			
			flag = true;
			obj.getMoney();
		}
	}
}

public class MainEntry {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		UserAtm user1 = new UserAtm(at, "박정히");
		UserAtm user2 = new UserAtm(at, "박그네");
		UserAtm user3 = new UserAtm(at, "박준형");
	
		user1.start();
		user2.start();
		user3.start();
	}
}


























