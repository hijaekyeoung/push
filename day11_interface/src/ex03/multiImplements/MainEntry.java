package ex03.multiImplements;

import ex02.Abstract.Shape;
import ex02_Interface.IDraw;

public class MainEntry {
	public static void main(String[] args) {
		// 1. 자기자신
		MultiClass mc = new MultiClass();
		mc.disp();
		
		// 2. 부모로 객체 생성 단 다른 부모의 것은 가져올 수 없음.
		Shape s = new MultiClass();
		s.show("도형이야");
		s.view();
		
		Test t = new MultiClass();
		t.testView();
		System.out.println(t.str);
		
		IDraw d = new MultiClass();
		d.draw();
		System.out.println(d.su);
	}
	
}
