package quizMap;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

public class VideoManager {
	
	static Scanner sc = new Scanner(System.in);
	
	public static String date() {
		Date date = new Date();
		SimpleDateFormat sDate = new SimpleDateFormat("yyyy/MM/dd");
		return sDate.format(date);
	}
	
	public static void removeVideo(Map<Integer, Video> map, Video v) {
		map.remove(sc.nextInt());
	}
	
	public static void addVideo(Map<Integer, Video> map, Video v) {
		System.out.print("비디오 번호 : ");
		v.v_num = sc.nextInt();
		System.out.print("제목 : ");
		v.title = sc.next();
		System.out.print("장르 : ");
		v.category = sc.next();
		System.out.print("이름 : ");
		v.lendName = sc.next();
		v.lendDate = date();
		v.lend = "대여중"; // 대여중
		map.put(v.v_num, v);
	}
	
	public static void line() {
		System.out.println("====================================");
	}
	
	public static void input() {
		System.out.println("1.video 추가");
		System.out.println("2.video 삭제");
		System.out.println("3.video 목록");
		System.out.println("4.video 수정");
		System.out.println("5.프로그램 종료");
		line();
		System.out.print("번호 입력 : ");
	}
}
