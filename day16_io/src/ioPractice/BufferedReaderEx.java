package ioPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderEx {
	public static void main(String[] args) {
		File memoFile = new File("C:\\IDE\\daebo_th2.selection\\1_Java\\th2_java 일자별 정리.txt");
		try {
			if(!memoFile.exists()) {
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}
			FileReader fr = new FileReader(memoFile);
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line==null) break;
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
