package ex03.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
	public static void main(String[] args) {
		// server socket 생성
		// accept(client쪽 소켓)
		// read 객체 생성
		// client에 보낼 경우 write 객체 생성
		ServerSocket ss = null;
		Socket s = null;
		System.out.println("Server Start~~~");
		
		try {
			ss = new ServerSocket(9000); // 0 ~ 1024를 뺸 번호
			s = ss.accept(); // client socket
			// IO 객체
			InputStream is = s.getInputStream(); // read
			OutputStream os = s.getOutputStream();
			
			byte[] arr = new byte[100];
			is.read(arr);
			System.out.println(new String(arr));
			
			String message = "안녕 Client";
			os.write(message.getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				s.close();
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
