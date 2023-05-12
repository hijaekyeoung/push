package ex01.thread;

public class Animals extends Thread{
	private String sounds;

	public Animals(String sounds) {
		this.sounds = sounds;
	}

	@Override
	public void run() {
		printSound(500);
	}
	
	public void printSound(long millis) {
		for (int i = 0; i < 10; i++) {
			System.out.println(sounds);
			try {
				Thread.sleep(millis);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
