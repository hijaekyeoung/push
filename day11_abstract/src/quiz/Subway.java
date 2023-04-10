package quiz;

public class Subway extends Trans{

	@Override
	public void start(int cost) {
		System.out.println(name("지하철")+"이용 비용은" + cost + "원입니다.");		
	}

	@Override
	public void stop() {
		System.out.println("내리 실 경우 500원의 환급비용을 받아가세요.");		
		
	}

}
