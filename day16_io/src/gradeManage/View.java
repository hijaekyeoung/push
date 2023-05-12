package gradeManage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class View {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Controller con = new Controller();
		Student s = new Student();
		try {
			while(true) {
				con.start();
				
				int choice = Integer.parseInt(br.readLine());
				switch(choice) {
				case 1:
					System.out.println("학번,이름,성별,나이,학과,이수학점순으로 입력하세요.");
					st = new StringTokenizer(br.readLine());
					con.addList(new Student(Integer.parseInt(st.nextToken()), st.nextToken(), st.nextToken().charAt(0), Integer.parseInt(st.nextToken())
							, st.nextToken(), st.nextToken().charAt(0)));
					break;
				case 2: 
					System.out.println("============== 학생 정보 리스트 ===============");
					con.printList(s);
					break;
				case 3:
					con.printList(s);
					System.out.println("삭제할 학번을 입력하세요");
					st = new StringTokenizer(br.readLine());
					int sid = Integer.parseInt(st.nextToken());
					con.deleteList(sid,s);
					System.out.println("해당 정보가 삭제 되었습니다.");
					break;
				case 4:
					System.out.println("수정할 학생의 인덱스를 입력하세요.");
					int idx = Integer.parseInt(br.readLine());
					System.out.println("이름,성별,나이,학과,이수학점순으로 입력하세요.");
					st = new StringTokenizer(br.readLine());
					Student s2 = new Student(Integer.parseInt(st.nextToken()), st.nextToken(), st.nextToken().charAt(0), Integer.parseInt(st.nextToken())
							, st.nextToken(), st.nextToken().charAt(0));
					con.updateList(idx, s2);
					System.out.println("수정이 완료되었습니다.");
					break;
				case 5:
					System.out.println("프로그램이 종료됩니다.");
					System.exit(-1);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
