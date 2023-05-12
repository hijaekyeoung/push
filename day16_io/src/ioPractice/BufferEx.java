package ioPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferEx {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C:\\Users\\KOSA\\Pictures\\Screenshots\\스크린샷 2023-04-24 122547.png");
			fos = new FileOutputStream("C:\\Users\\KOSA\\Pictures\\Screenshots\\스크린샷 2023-04-24 122000.png");
			byte[] buffer = new byte[1024];
			while(true) {
				int readedByte = fis.read(buffer);
				if(readedByte == -1) break;
				fos.write(buffer, 0, readedByte);
			}
			System.out.println("파일을 복사했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
	}
}
