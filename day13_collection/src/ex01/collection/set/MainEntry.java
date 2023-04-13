package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;

// Set : 순서 없고, 중복 허용x
public class MainEntry {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("키보드");
		hs.add("마우스");
		hs.add("컵");
		hs.add("볼펜");
		hs.add("키보드");
		
		System.out.println("요소 개수 : " + hs.size()); // 4(중복 허용x)
		System.out.println(hs); // [컵,볼펜,키보드,마우스](순서없음)
	
		HashSet<Integer> hs2 = new HashSet<>(); 
		hs2.add(100);
		hs2.add(3);
		hs2.add(1000);
		
		// 타입을 제한하지 않으면 다 받아준다.
		HashSet hs3 = new HashSet<>(); 
		hs3.add(10.0);
		hs3.add(3);
		hs3.add(1000);
		hs3.add("String");
		
		// for-each를 이용하여 출력
		for(int a : hs2) { 
			System.out.println(a);
		}
		System.out.println();
		
		// iterator, while문을 이용하여 출
		Iterator it = hs.iterator(); // iterator로 set의 값을 다 꺼내온다.
		
		while(it.hasNext()) { // 다음 요소가 있다면...
			System.out.println(it.next()); // 요소를 꺼내서 출력
		}
		System.out.println();
		
		it = hs3.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
