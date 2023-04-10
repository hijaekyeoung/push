package quiz;

public abstract class Trans {
	
	public abstract void start(int cost);
	public abstract void stop();
	
	public String name(String name) {
		return name;
	}
}
