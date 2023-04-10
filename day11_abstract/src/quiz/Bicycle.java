package quiz;

public class Bicycle extends Trans{
	
	@Override
	public void start(int cost) {
		System.out.println(name("자전거")+"대여 비용은" + cost + "원입니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("내리신 후" + name("자전거") +"를 반납해주세요.");
	}

}
