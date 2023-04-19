package ex07.io.data;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataOutputStreamEx {
	public static void main(String[] args) throws Exception{
		File file = new File("test.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(65); // ASCII : 'A'
		dos.writeShort(100);
		dos.writeInt(103230);
		dos.writeLong(1005555555);
		dos.writeFloat(12.34f);
		dos.writeDouble(8.8);
		dos.flush(); // buffer 비우기
		
		System.out.println("test.txt 파일에 " + dos.size() + "byte save");
		dos.close();
	}
}
