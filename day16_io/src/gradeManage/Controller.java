package gradeManage;

import java.util.ArrayList;
import java.util.List;

public class Controller {

	List<Student> student = new ArrayList<>();

	public void start() {
		System.out.println("학생 관리 프로그램");
		System.out.println("1. 학생 정보 입력	2. 정보 리스트 출력	3. 정보 삭제	4. 정보 수정	5. 종료");
	}

	public void addList(Student s) {
		student.add(s);
		System.out.println("정보 입력이 완료 되었습니다.");
	}

	public void printList(Student s) {
		if (student.size() == 0) {
			System.out.println("등록된 정보가 없습니다.");
		} else {
			for (int i = 0; i < student.size(); i++) {
				System.out.println(student.get(i));
			}
		}
		System.out.println();
	}

	public void deleteList(int sid, Student s) {
		student.remove(s.getSid());
	}

	public void updateList(int idx, Student s) {
		printList(s);
		student.set(idx, s);
	}

	public void exitProgram() {
		System.exit(0);
	}

}
