package ex02.Abstract;

public abstract class Shape { // super class
	protected double result = 0;
	
	public abstract double calc(double x); // 추상 메서드
	public abstract void show(String name); // 추상 메서드
	public void view() { // 일반 메서드
		System.out.println("Super class Shape");
	}
}
