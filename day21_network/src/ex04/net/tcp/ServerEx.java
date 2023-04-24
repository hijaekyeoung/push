package ex04.net.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;
		ServerSocket ss = null;
		Socket s = null;
		System.out.println("연결됨.... 나는 서버야~~");
		
		try {
			ss = new ServerSocket(9999);
			s = ss.accept(); // 응답대기, 클라이언트 소켓
			 // 네트워크 통해서 데이터 읽어옴
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// 키보드로 부터 입력 스트림
			stin = new BufferedReader(new InputStreamReader(System.in));
			// 클라이언트로 부터의 출력 스트림
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			
			String inputMessage;
			
			while(true) {
				inputMessage = br.readLine(); // 클라이언트에서 한행의 문자열 읽음
				// 클라이언트가 "EXIT"을 보내면 연결 종료
				if(inputMessage.equalsIgnoreCase("exit")) break;
				
				System.out.println(inputMessage); // 클라이언트가 보낸 메시지 화면 출력
				
				String outputMessage = stin.readLine(); // 키보드에서 한 행의 문자열 읽음
				// 키보드에서 읽은 문자열 전송
				bw.write(s.getInetAddress() + " 서버> "+ outputMessage + "\n");
				bw.flush();
				
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		} finally {
			try {
				s.close(); // 클라이언트 소켓 종료
				//ss.close(); // 서버소켓 종료 시 다른 곳에서 접속하지 못함
			} catch (Exception e) {
				System.out.println("클라이언트와 채팅 중 오류 발생.....");
			}
		}
	}
}
