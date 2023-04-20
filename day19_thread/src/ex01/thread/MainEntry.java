package ex01.thread;

public class MainEntry {
	public static void main(String[] args) {
		//Thread t1 = new Thread("t1");
		UserThread t1 = new UserThread("t1");
		Thread t2 = new UserThread("t2");
		Thread t3 = new UserThread("t3");
		
		
		t1.setPriority(Thread.MIN_PRIORITY); // 1
		t2.setPriority(Thread.NORM_PRIORITY); // 5
		t3.setPriority(Thread.MAX_PRIORITY); // 10 숫자가 클 수록 우선순위가 높다.
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getState());
		
		//t1.run(); // x run 메소드를 명시적으로 호출 할 뿐 실제로 동작하지 않는다.
		t1.start(); // run() 메소드 유도
		t2.start(); // run() 메소드 유도
		t3.start(); // run() 메소드 유도
	}
}
