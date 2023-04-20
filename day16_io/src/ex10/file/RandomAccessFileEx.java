package ex10.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		RandomAccessFile raf = new RandomAccessFile("sawon.txt", "rw");
		//RandomAccessFile raf = new RandomAccessFile("C:\\IDE\\daebo_th2.selection\\1_Java\\th2_java 일자별 정리.txt", "rw");
		
		for (int i = 0; i <= 10; i++) {
			raf.seek(i * 100);
//			raf.writeInt(i);
			String str = "Hello";
			raf.writeUTF(str);
//			raf.writeByte(i);
//			raf.writeBoolean(true);
//			raf.writeChars("car");
			//raf.writeBytes("domanga"); 큰 차이 없음
			//raf.writeUTF("domanga"); 큰 차이없음
		}
		
		for (int i = 0; i <= 10; i++) {
			raf.seek(i * 100);
			//System.out.println(raf.readInt());
			System.out.println(raf.readUTF());
		}
		
		System.out.println("string print success!!");
		raf.close();
	}
}
