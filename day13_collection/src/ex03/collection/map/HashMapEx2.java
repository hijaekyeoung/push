package ex03.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("재진", 90);
		map.put("승현", 80);
		map.put("승원", 30);
		map.put("혁진", 50);
		map.put("지연", 88);
		
		Set set = map.entrySet();
//		System.out.println(set);
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("Name : " + e.getKey() + ", score : " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고점 : " + Collections.max(values));
		System.out.println("최하점 : " + Collections.min(values));
	}
}













