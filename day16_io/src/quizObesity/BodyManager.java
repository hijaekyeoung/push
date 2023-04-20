package quizObesity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BodyManager {

	Scanner sc = new Scanner(System.in);
	ArrayList<Body> list = new ArrayList<>();
	
	public void add() throws IOException {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("성별 : ");
		char gen = sc.next().charAt(0);
		System.out.print("신장 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();
		list.add(new Body(name, gen, height, weight));
	}
	
	public void delete(String name) {
		int[] cnt = new int[list.size()];
		
		// 동명이인 인덱스를 cnt 배열에 담기
		for (int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).getName())) {
				cnt[i] = i;
				//list.remove(i);
			}
		}
		// 동명이인 리스트 출력
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(i+1 +"  "+ list.get(cnt[i]));
		}
		
		System.out.println("어떤" + name + "를 삭제할 지 번호를 입력하세요.");
		System.out.print("번호 : ");
		int num = sc.nextInt();
		list.remove(cnt[num-1]);
	}
	public void print() {
		System.out.println(list);
	}
	
	public void update(int i, String name, Body b) throws IOException {
		list.set(i, b);
	}
			
	public void save() throws IOException {
		File file = new File("C:\\IDE\\daebo_th2.selection\\1_Java\\workspace\\day16_io\\src\\quizObesity\\bmi.txt");
		FileWriter fw = new FileWriter(file, true);
		for(Body b : list) {
			fw.write(b.getName() + "\n");
			fw.write(b.getGender() + "\n");
			fw.write(b.getHeight() + "\n");
			fw.write(b.getWeight() + "\n");
			fw.write(String.format("%.2f", b.getBmi()) + "\n");
			fw.write("-----------------------------\r\n");
		}
		fw.flush();
		fw.close();
	}

	
	
}
