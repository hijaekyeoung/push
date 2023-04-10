package quiz;

public class Plain extends Trans{

	@Override
	public void start(int cost) {
		System.out.println(name("비행기")+ "이용비용은" + cost + "원입니다.");		
	}

	@Override
	public void stop() {
		System.out.println("비행기 마일리지를 모아보세요.");		
	}

}
