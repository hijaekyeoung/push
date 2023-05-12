package ex01.thread;

public class Zoo {
	public static void main(String[] args) {
		Animals cat = new Animals("야옹");
		Animals dog = new Animals("멍멍");
		Animals tiger = new Animals("어흥");
		
		cat.start();
		dog.start();
		
		try {
			cat.join(); dog.join();
		} catch (Exception e) {
			;
		}
		tiger.start();
	}
	
	
}
