package quiz;

public class MainEntry {
	public static void main(String[] args) {
		Trans[] t = new Trans[4];
//		t[0] = new Bus();
//		t[1] = new Bicycle();
//		t[2] = new Subway();
//		t[3] = new Plain();
		
		Object[] ob = {new Bus(), new Bicycle(), new Subway(), new Plain()};
		
		int[] cost = {1250,1000,2000,100000};
		
		for (int i = 0; i < t.length; i++) {
			t[i].start(cost[i]);
			t[i].stop();
			System.out.println("==================");
		}
	}
}
