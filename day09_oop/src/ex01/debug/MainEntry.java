package ex01.debug;


// break point 를 지정하고(여러개 지정 가능) 디버깅 
// F5(단계별), F6(다음 breakpoint) 클릭
public class MainEntry {
	public static void main(String[] args) {
		int x = 5, y = 0;
		int i;
		
		for (i = 1; i < 6; i++) {
			y += x * i;
		}
		
		for (i = 1; i < 100; i++) {
			if(i == 30) break;
			System.out.println(i);
		}
		
		System.out.println(x + ", " + y + ", " + i);
	}
}
