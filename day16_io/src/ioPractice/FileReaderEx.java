package ioPractice;

import java.io.File;
import java.io.FileReader;

public class FileReaderEx {
	public static void main(String[] args) {
		File memoFile = new File("C:\\IDE\\daebo_th2.selection\\1_Java\\memo.txt");
		try {
			if(!memoFile.exists()) {
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}
			FileReader fr = new FileReader(memoFile);
			while(true) {
				int code = fr.read();
				if(code==-1) break;
				char ch = (char) code;
				System.out.print(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
