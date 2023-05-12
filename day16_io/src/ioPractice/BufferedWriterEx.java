package ioPractice;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class BufferedWriterEx {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		try {
			bw.write("하나\n");
			bw.write("둘\n");
			bw.newLine();
			bw.write("셋\n");
			bw.flush(); // 버퍼에 잔류하는 모든 바이트를 출력하는 메소드
			bw.close(); // 사용한 시스템 자원을 반납하고 출력 스트림을 닫는 메소드
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
