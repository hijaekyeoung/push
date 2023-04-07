package ex05.Return;

class MainEntry {
	public static void main(String[] args) {
		int x = 100;
		System.out.println(x);
		
		x += 100;
		if(x == 200) return; // x = 200 일 때 제어권을 넘긴다.
		
		System.out.println(x);
	}
	
}
