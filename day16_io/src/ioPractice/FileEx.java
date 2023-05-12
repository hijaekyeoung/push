package ioPractice;

import java.io.File;

public class FileEx {
	public static void main(String[] args) {
		File cDrive = new File("c:/");
		File[] files = cDrive.listFiles();
		for(File tmp : files) {
			if(tmp.isDirectory()) {
				System.out.println("<DIR>\t" + tmp.getName());
			} else {
				System.out.println("     \t" + tmp.getName());
			}
		}
	}
}
