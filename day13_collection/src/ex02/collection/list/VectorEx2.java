package ex02.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector<>(3, 5);

		v.addElement("자바"); // string
		v.addElement(10.2); // double
		v.addElement(date); // object

		System.out.println("---------------3개 객체 추가-------------");
		System.out.println("size : " + v.size() + "  /  " + "capacity : " + v.capacity());

		for (i = 0; i < 10; i++) {
			v.addElement(new Integer(i));
		}

		System.out.println("---------------10개 객체 추가-------------");
		System.out.println("size : " + v.size() + "  /  " + "capacity : " + v.capacity());

		System.out.println("---------------Vector 내용 출력-------------");
		Enumeration enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + "  ");
		}
		System.out.println();
		System.out.println("---------------객체 내용 포함 확인-------------");
		if (v.contains("자바212"))
			System.out.println("자바 문자열 포함");
		else
			System.out.println("자바 미포함");

		System.out.println("10.2 객체 위치는? " + v.indexOf(new Double(10.2)));
		System.out.println("입력 시간 : " + date);
		System.out.println(v.get(v.indexOf(date)));
		
		// delete object delete
		v.removeElementAt(v.lastIndexOf(date));
		System.out.println("*******************");
		System.out.println("size : " + v.size() + "  /  " + "capacity : " + v.capacity());
		System.out.println(v);
		
		for (i = 0; i < v.size(); i++) {
			v.removeElementAt(i);
		}
		System.out.println("*******************");
		System.out.println("size : " + v.size() + "  /  " + "capacity : " + v.capacity());
		System.out.println(v);
		v.add(1, "epeo");
		System.out.println(v);
		System.out.println(v.indexOf("epeo"));
		
		for (i = 0; i < v.size(); i++) {
			//v.remove(i); // 인덱스 번호로 지우기
			v.remove(10.2); // 값으로 지우기
			//v.removeAllElements();
		}
		System.out.println(v);
		
		for (i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + ", ");
		}
		
		System.out.println();
		System.out.println("==============================");
		v.setElementAt("java", 2); // "java"를 2번째 인덱스 위치에 문자열 추가
		
		enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + ", ");
		}
		System.out.println();
		v.trimToSize();
		System.out.println("size : " + v.size() + "  /  " + "capacity : " + v.capacity());
		
		v.setSize(2); // 크기를 강제 2로 조정
		enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + ", ");
		}
		
		
	}
}
// trimToSize() : 크기만큼 크기 조절
// set(), setElementAt() : 값 인덱스 사이에 추가
// add(), addElement() : 값 넣기
//removeAllElements() : 전체 삭제
// remove(index, object), removeElement(index or object) : 값이나 인덱스로 삭제
// indexOf(Object) : 해당 오브젝트의 인덱스 번호 호출
// contains(Object) : 해당 오브젝트의 값 여부 확인 boolean값으로 리턴
// get(index) : vector에서 해당 인덱스의 값을 꺼내줌





















