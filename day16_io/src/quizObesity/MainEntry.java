package quizObesity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainEntry {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BodyManager bm = new BodyManager();
		//ArrayList<Body> list = new ArrayList<>();
		
		while(true) {
			System.out.println("============비만도 측정 프로그램============");
			System.out.println("1. 추가\t2. 삭제\t3. 출력\t4. 수정\t5. 저장\t6. 종료");
			System.out.print("번호 : ");
			int choice = Integer.parseInt(br.readLine());
			
			switch(choice) {
			case 1: 
				bm.add();
				System.out.println("추가");
				break;
			case 2 : 
				System.out.println("삭제할 이름 : ");
				String name = br.readLine();
				bm.delete(name);
				System.out.println("삭제");
				break;
			case 3 :
				bm.print();
				break;
			case 4 : 
				System.out.println("수정하실 분의 번호와 이름을 적어주세요.");
				System.out.print("번호 : ");
				int i = Integer.parseInt(br.readLine());
				System.out.print("이름 : ");
				name = br.readLine();
				System.out.println("수정하실 분의 이름, 성별, 키, 몸무게 순으로 입력");
				Body b = new Body(br.readLine(), br.readLine().charAt(0), 
						Double.parseDouble(br.readLine()), Double.parseDouble(br.readLine()));
				bm.update(i,name,b);
				System.out.println("수정");
				break;
			case 5 :
				bm.save();
				System.out.println("저장");
				break;
			case 6 :
				System.out.println("프로그램을 종료");
				System.exit(0);
			}
			
		}
		
	}
}
