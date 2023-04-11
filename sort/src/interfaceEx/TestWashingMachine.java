package interfaceEx;

public class TestWashingMachine {
	public static void main(String[] args) {
		LGWashingMachine lwm = new LGWashingMachine();
		lwm.startButtonPressed();
		System.out.println("세탁기 속도 " + lwm.changeSpeed(2) + "으로 변경");
		lwm.stopButtonPressed();
		lwm.dry();
	}
}
