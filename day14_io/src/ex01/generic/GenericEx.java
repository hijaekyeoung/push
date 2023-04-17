package ex01.generic;

public class GenericEx<T> {
	
	T[] v; // 타입이 결정되지 않은 멤버변수
	
	public void set(T[] v) { // 멤버함수
		this.v = v;
	}
	
	public void print() {
		for(T item : v) {
			System.out.println(item);
		}
	}
}
