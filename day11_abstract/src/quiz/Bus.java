package quiz;

public class Bus extends Trans{
	
	@Override
	public void start(int cost) {
		System.out.println(name("버스") +"의 요금은" + cost + "원입니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("내릴 때 버스 카드를 찍어주세요.");
	}

}
