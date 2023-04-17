package quizMap;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.sound.sampled.Line;


public class MainEntry extends Video{
	
	public static void main(String[] args) {
		Map<Integer, Video> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		try {
			while(true) {
				Video v;
				VideoManager.input();
				int num = sc.nextInt();
				switch(num) {
				case 1 :
					v = new Video();
					VideoManager.addVideo(map, v);
					System.out.println("입력이 완료 되었습니다.");
					VideoManager.line();
					break;
				case 2 : 
					v = new Video();
					System.out.println("삭제하실 비디오 번호를 입력하세요.");
					//map.remove(sc.nextInt());
					VideoManager.removeVideo(map, v);
					System.out.println("삭제가 완료되었습니다.");
					VideoManager.line();
					break;
				case 3 : 
					System.out.println("비디오 목록");
					if(map.size() == 0) {
						VideoManager.line();
						System.out.println("목록이 비어있습니다.");
					} else {
						VideoManager.line();	
						Set set = map.keySet();
						Iterator it = set.iterator();
						while(it.hasNext()) {
							v = map.get(it.next());
							//System.out.println(v.toString());
							System.out.println("비디오 번호 : " + v.getV_num() + ", 제목 : " + v.getTitle());
							System.out.println("장르 : " + v.getCategory() + ", 대여여부 : " + v.lend);
							System.out.println("대여자 : " + v.getLendName() + ", 대여일자 : " + v.getLendDate());
							System.out.println();
						}
					}
					VideoManager.line();
					break;
				case 4 :
					v = new Video();
					System.out.println("수정하실 비디오 번호를 입력하세요.");
					System.out.print("비디오 번호 : ");
					v.v_num = sc.nextInt();
					System.out.print("제목 : ");
					v.title = sc.next();
					System.out.print("장르 : ");
					v.category = sc.next();
					System.out.print("이름 : ");
					v.lendName = sc.next();
					v.lendDate = VideoManager.date();
					v.lend = "대여중"; // 대여중
					map.put(v.v_num, v);
					System.out.println("수정이 완료 되었습니다.");
					
					VideoManager.line();
					break;
				case 5 : 
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
			}
			
		} catch(Exception e) {
			System.out.println("에러가 발생하였습니다.");
		}
		
		
	}
}
