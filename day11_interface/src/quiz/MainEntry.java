package quiz;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Trans[] t = {new Bus(),new Plain(),new Subway(),new Bicycle()};
		Scanner sc = new Scanner(System.in);
		String[] name = {"지하철","버스","비행기","자전거"}; 
		try {
			int choice;
			do {
				System.out.println("1.지하철 2.버스 3.비행기 4.자전거 5.종료");
				choice = sc.nextInt();
				switch(choice) {
				case 1: t[0].show(name[0]); break;
				case 2: t[1].show(name[1]); break;
				case 3: t[2].show(name[2]); break;
				case 4: t[3].show(name[3]); break;
				case 5: System.out.println("시스템이 종료되었습니다."); break;
				}
			} while(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5);
			
		} catch(Exception e) {
			System.out.println("오류 발생 시스템을 종료합니다.");
			System.exit(0);
		}
		
	}
}
