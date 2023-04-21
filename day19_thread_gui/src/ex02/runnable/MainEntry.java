package ex02.runnable;

public class MainEntry {
	public static void main(String[] args) {
		
		// run()을 유도하는 start()는 Thread가 가지고 있기 때문에 
		new Thread(new UserRunnable("u1")).start();
		new Thread(new UserRunnable("u2")).start();
		new Thread(new UserRunnable("u3")).start();
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				for (int i = 1; i <= 10; i++) {
//
//					if (i == 3) {
//						try { // interruptedException 예외처리
//							Thread.sleep(3000); // 1초 지연
//						} catch (Exception e) {
//							e.printStackTrace();
//						}
//						System.out.println(name);
//					}
//					System.out.println(i);
//				}
//			}
//		});
		
		
//		UserRunnable u1 = new UserRunnable("u1");
//		Thread t1 = new Thread(u1);
//		t1.start(); // run() 메소드 유도
	}
}
