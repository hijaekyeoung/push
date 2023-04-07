package ex02.oop;


class Point { // 좌표를 찍는 클래스 Alt + Shift + S -> R -> Alt + A -> Alt + S -> Enter
	private int x, y; // 멤버 변수 - 접근지정자 : private < default < protected < public

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x; // this는 생성된 객체의 시작 주소값을 가진다.
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
	//멤버 함수
	// setter : 값을 변경한다. getter : 값을 꺼내준다.
	
}

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println();
	}
}
