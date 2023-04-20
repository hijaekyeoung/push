package ex02.runnable;

public class UserRunnable implements Runnable {
	String name;

	public UserRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {

			if (i == 3) {
				try { // interruptedException 예외처리
					Thread.sleep(3000); // 1초 지연
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}
			System.out.println(i);
		}
	}

}
