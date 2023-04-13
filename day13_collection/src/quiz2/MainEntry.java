package quiz2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainEntry {
	public static void main(String[] args) throws Exception{
		ArrayList<Customer> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Customer c = new Customer();
		while(true) {
			System.out.println("고객 관리 프로그램");
			System.out.println("1. 입력 2. 삭제 3. 수정 4. 출력 5. 종료");
			int num = Integer.parseInt(br.readLine());
			
			switch(num) {
			case 1 : 
				System.out.println("고객의 이름, 주소, 연락처 순으로 입력하세요.");
				st = new StringTokenizer(br.readLine());
				list.add(new Customer(st.nextToken(), st.nextToken(), st.nextToken()));
				break;
			case 2 : 
				System.out.println("삭제할 고객의 이름을 입력하세요.");
				st = new StringTokenizer(br.readLine());
				for (int i = 0; i < list.size(); i++) {
					if(list.get(i).getName().equals(st.nextToken())) {
						list.remove(i);
					}
				}
				System.out.println("삭제가 완료 되었습니다.");
				break;
			case 3 :
				System.out.println("수정할 고객의 인덱스를 입력하세요.");
				int index = Integer.parseInt(br.readLine());
				System.out.println("수정할 정보를 이름,주소,연락처 순으로 입력하세요.");
				st = new StringTokenizer(br.readLine());
				list.set(index, new Customer(st.nextToken(), st.nextToken(), st.nextToken()));
				System.out.println("수정이 완료 되었습니다.");
				break;
			case 4 : 
				if(list.size() == 0) {
					System.out.println("등록된 리스트가 없습니다.");
				} else {
					System.out.println("고객 정보 리스트");
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i));
					}
				}
				break;
			case 5 : 
				System.out.println("종료 되었습니다.");
				System.exit(0);
				break;
			}
		}
		
	}
}
