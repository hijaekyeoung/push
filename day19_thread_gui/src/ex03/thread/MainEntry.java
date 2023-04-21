package ex03.thread;

public class MainEntry {
	public static void main(String[] args) throws InterruptedException {
		
		long id = Thread.currentThread().getId(); // jvm이 정한 아이디
		String name = Thread.currentThread().getName(); // jvm이 정한 이름
		
//		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Thread.State state = Thread.currentThread().getState(); // 상태
		
//		if(id) {
		Thread.sleep(1000); // 예외 처리
		Thread.currentThread();
//		}

		int priority = Thread.currentThread().getPriority();

		System.out.println(id + " " + name);
		System.out.println("현재 스레드 Priority : " + priority);
		System.out.println("현재 스레드 state : " + state);
	}
}
