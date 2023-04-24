package ex03.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest {
	public static void main(String[] args) {
		// socket(ip,port) 하나 생성 - IO객체
		// write 객체 생성
		// server로부터 받아올 경우 read 객체 생성
		// close
		Socket s = null;
		try {
			s = new Socket("127.0.0.1", 9000); // server ip & port

			InputStream is = s.getInputStream(); // read
			OutputStream os = s.getOutputStream(); // write

			String str = "안녕하세요. server!!";
			os.write(str.getBytes());
			
			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
