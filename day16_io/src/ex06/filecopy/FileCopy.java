//*
package ex06.filecopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		// 읽기 객체 - FileInputStream 
		//InputStream is = new FileInputStream("siba.png"); // 상대 경로
		InputStream is = new FileInputStream("C:\\Users\\KOSA\\Pictures\\Screenshots\\스크린샷 2023-04-18 170657.png"); // 절대 경로
		
		// 쓰기 객체 - FileOutputStream
		OutputStream os = new FileOutputStream("coding2.jpeg");
		
		byte[] buffer = new byte[1024 * 8]; // 8바이트 (휠씬 속도가 빠름)
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int inputData = is.read(buffer); // buffer 크기만큼 읽어드림
			if(inputData == -1) break;
			os.write(buffer, 0, inputData);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start); // 복사(작업)에 걸린 시간
	
		is.close();
		os.close();
		System.out.println("copy success!!!");
	}
}
//*/

/*
package ex06.filecopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		// 읽기 객체 - FileInputStream 
		//InputStream is = new FileInputStream("siba.png"); // 상대 경로
		InputStream is = new FileInputStream("C:\\Users\\KOSA\\Pictures\\Screenshots\\스크린샷 2023-04-18 170657.png"); // 절대 경로
		
		// 쓰기 객체 - FileOutputStream
		OutputStream os = new FileOutputStream("coding.jpeg");
	
		long start = System.currentTimeMillis();
		
		while(true) {
			int inputData = is.read();
			if(inputData == -1) break;
			os.write(inputData);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start); // 복사(작업)에 걸린 시간
	
		is.close();
		os.close();
		System.out.println("copy success!!!");
	}
}
*/












