package ex02.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>(10);
		list.add(new Integer(5));
		list.add(0);
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(3);
		list.add(6);
		
		ArrayList list2 = new ArrayList<>(list.subList(1, 4)); // 4번째 인덱스는 미포함
		print(list, list2);
	
		Collections.sort(list);
		Collections.sort(list2);
		print(list, list2);
		
		System.out.println("list.containsAll(list2) : " + list.containsAll(list2));
	
		for (int i = list2.size()-1; i >= 0; i--) {
			if(list.contains(list2.get(i))) // list에 포함되는 list2의 값이 있다면
				list2.remove(i); //해당 인덱스를 지운다.
		}
		print(list, list2);
	}
	
	private static void print(ArrayList list, ArrayList list2) {
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}
