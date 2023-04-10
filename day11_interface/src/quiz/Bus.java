package quiz;

public class Bus implements Trans{

	@Override
	public void start(String name) {
		System.out.println(name + "출발");
	}

	@Override
	public void stop(String name) {
		System.out.println(name + "도착");
	}

	@Override
	public void show(String name) {
		start(name);
		stop(name);
	}
		
	
}
