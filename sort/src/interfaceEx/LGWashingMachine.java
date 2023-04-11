package interfaceEx;

public class LGWashingMachine implements WashingMachine, dryCouse {

	@Override
	public void startButtonPressed() {
		System.out.println("세탁기 빨래를 시작!!!!");
	}

	@Override
	public void pauseButtonPressed() {
		System.out.println("세탁기 빨래를 일시중지!!!!");
	}

	@Override
	public void stopButtonPressed() {
		System.out.println("세탁기 빨래를 중지!!!!");
	}

	@Override
	public int changeSpeed(int speed) {
		int rtnSpeed = 0;
		switch(speed) {
		case 1: rtnSpeed = 20; break;
		case 2: rtnSpeed = 50; break;
		case 3: rtnSpeed = 100; break;
		}
		return rtnSpeed;
	}
	
	@Override
	public void dry() {
		System.out.println("빨래가 건조 되었습니다.");
	}
}
