package ioPractice;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx {
	public static void main(String[] args) {
		File memoFile = new File("C:\\IDE\\daebo_th2.selection\\1_Java\\memo.txt");
		
		try {
			boolean isExist = memoFile.exists();
			if(!isExist) {
				memoFile.createNewFile();
				System.out.println("memo.txt 파일을 만들었습니다.");
			}
			FileWriter fw = new FileWriter(memoFile);
			fw.write("이00\n");
			fw.write("\t김00\n");
			fw.write("\t\t박00\n");
			fw.flush();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
