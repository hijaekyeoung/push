package quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainEntry {
	public static void main(String[] args) throws Exception{
		ArrayList<Customer> list = new ArrayList<>(10);
		Customer c = new Customer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		System.out.println("+++++++ 고객 관리 프로그램 +++++++");
		System.out.print("고객수 : ");
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				System.out.println("이름, 주소, 번호순으로 입력");
			}
			st = new StringTokenizer(br.readLine());
			list.add(new Customer(st.nextToken(), st.nextToken(), st.nextToken()));
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("----------------------");
		
		System.out.print("수정할 인덱스 선택 : ");
		int index = Integer.parseInt(br.readLine());
		System.out.println("이름,주소,번호순으로 입력");
		
		st = new StringTokenizer(br.readLine());
		list.set(index, new Customer(st.nextToken(), st.nextToken(), st.nextToken()));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------------");
		
		System.out.print("삭제 할 인덱스 선택 : ");
		n = Integer.parseInt(br.readLine());
		list.remove(n);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
