package ex03.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Map : key/value 한 쌍으로 처리 (set + list)
public class HashMapEx1 {
	public static void main(String[] args) {
		Map map = new HashMap<>();
		map.put("kosa", "1234"); // 키값이 같기 때문에 중복을 허용하지 않는다.
		map.put("daebo", "1004");
		map.put("jk", "7895");
		map.put("kosa", "1234");  // 키값이 같은 경우 가장 최근에 초기화 한것으로 대체됨
		
		System.out.println("요소 개수 : " + map.size());
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요. ");
			System.out.print("id :  ");
			String id = sc.nextLine().trim(); // 입력 및 공백 제거
			System.out.print("pw :  ");
			String pw = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) { // 입력한 키값이 존재합니까?
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력하세요.");
				continue;
			} else {
				if(!map.get(id).equals(pw)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
				} else {
					System.out.println("id와 pw가 일치 합니다.");
					break;
				}
			}
		}
	}
}
