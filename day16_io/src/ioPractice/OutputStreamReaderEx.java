package ioPractice;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class OutputStreamReaderEx {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		try {
			osw.write(44032);
			osw.write("지!!~");
			osw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
