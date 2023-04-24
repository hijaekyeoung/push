package ex04.net.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;
		Socket s = null;
		
		try {
			s = new Socket("192.168.0.12",9999);
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			
			String OutputMessage;
			
			while(true) {
				System.out.println("message input : ");
				OutputMessage = stin.readLine();
				
				if(OutputMessage.equalsIgnoreCase("exit")) {
					bw.write(OutputMessage);
					bw.flush();
					break;
				}
				
				// 키보드에서 읽은 문자열 전송
				bw.write(s.getInetAddress() + " 클라이언트> " + OutputMessage + "\n");
				bw.flush();
				
				String inputMessage = br.readLine();
				System.out.println(inputMessage);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				s.close();
			} catch (Exception e2) {
				System.out.println("클라이언트와 채팅 중 오류 발생.....");
			}
			
		}
	}
}
