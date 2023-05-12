package ioPractice;

import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps;
		
		try {
			os.write(97);
			os.write(98);
			os.write(99);
			os.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
