package ex06.filecopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {
	public static void main(String[] args) {
		File src = new File("C:\\Windows\\explorer.exe"); // 절대 경로
		File dist = new File("C:\\IDE\\daebo_th2.selection\\1_Java\\Data\\explorerCopy.dat");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
		
		try {
			fis = new FileInputStream(src); // 파일 입력 바이트 스트림 연결
			fos = new FileOutputStream(dist); // 파일 출력 바이트 스트림 연결
			bis = new BufferedInputStream(fis); // 버퍼 입력스트림 연결
			bos = new BufferedOutputStream(fos); // 버퍼 출력스트림 연결
			
			// 더 이상 읽어들일 값이 없을 경우에 -1을 리턴한다.
			while((c = bis.read()) != -1) { 
				bos.write((char)c);
			}
			
			System.out.println("파일 복사 성공!!!");
			
			bis.close();
			bos.close();
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			System.out.println("파일 복사 오류 발생");
		}
	}
}

















