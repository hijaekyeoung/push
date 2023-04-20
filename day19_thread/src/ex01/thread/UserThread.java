package ex01.thread;

public class UserThread extends Thread {
	
	String name;
	
	public UserThread(String name) {
		this.name = name;
		//System.out.println("UserThread Constructor " + name);
	}

	@Override
	public void run() { // 스레드 실행부(구현부)
		for (int i = 1; i <= 10; i++) {
			
			if(i == 3) {
				try { // interruptedException 예외처리
					sleep(1000); // 1초 지연
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}
			System.out.println(i);
		}
	}
	
	
}
