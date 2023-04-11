package quiz2;

public class Bus implements Transport {
	private double speed = 0;
	
	@Override
	public void move() {
		while(speed < 5) {
			speed += (accelerator*5);
			System.out.println("Accel....." + speed);
			
			try {
				Thread.sleep(2000); // 1초 대기
			}catch(Exception e) {
				
			}
		}
	}

	@Override
	public void stop() {
		System.out.println("엔진 다운....");
	}
	
}
