package ex05.net.chat;

import java.io.*;
import java.net.*;
import java.util.*;

public class TcpMultiChatServer { // outer class
	
	HashMap clients; // key, value
	
	public TcpMultiChatServer() { // 생성자 함수 - 멤버변수 초기화 담당
		clients = new HashMap(); // HashMap 객체 생성
		Collections.synchronizedMap(clients); // 동기화
	}
	
	public void start() { // user method
		ServerSocket ss = null; // server 소켓
		Socket s = null; // 클라이언트 소켓
		
		try {
			ss = new ServerSocket(7777);
			System.out.println("서버 오픈!! 쳇 가능!!");
			while(true) {
				s = ss.accept(); // 응답대기, 클라이언트 소켓
				System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "]"
						+"에서 접속하셨습니다.");
				ServerReceiver thread = new ServerReceiver(s); // user class
				thread.start();
			}
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	class ServerReceiver extends Thread { // inner class
		Socket s; // 클라이언트 소켓
		DataInputStream dis; // readXXX() - XXX : 자료형
		DataOutputStream dos; // writeXXX() - XXX : 자료형
		
		public ServerReceiver(Socket s) { // 생성자 함수
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream()); // 네트워크 통해서 읽기
				dos = new DataOutputStream(s.getOutputStream()); // 네트워크 통해서 쓰기
			} catch (Exception e) { e.printStackTrace(); }
		}
		
		private void sendToAll(String msg) {
			Iterator it = clients.keySet().iterator(); // key값 출력
			
			while(it.hasNext()) { // 요소가 있다면
				try {
					// 해당 키 값으로 value값 출력
					DataOutputStream dos = (DataOutputStream)clients.get(it.next());
					//System.out.println("dos.toString() : " + dos.toString());
					dos.writeUTF(msg);
				} catch (Exception e) { e.printStackTrace(); }
			}
		}
		
		@Override
		public void run() { // 스레드 실행부(구현부)
			String name = "";
			try {
				name = dis.readUTF();
				sendToAll("#"+name+" 님이 입장하셨습니다.");
				
				clients.put(name, dos); // HashMap 넣기
				System.out.println("현재 서버 접속자 수는 : " + clients.size() + "명 입니다.");
				
				while(dis != null) {
					sendToAll(dis.readUTF());
				}
				
			} catch (Exception e) {e.printStackTrace();
			} finally {
				sendToAll("#"+name+" 님이 나가셨습니다.");
				clients.remove(name); // 접속자 수 제거
				System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "]"
						+"에서 접속을 종료하셨습니다.");
				System.out.println("현재 서버 접속자 수는 : " + clients.size() + "명 입니다.");
			} // try end
			
		} // end run() 

	}
	
	
	public static void main(String[] args) {
		new TcpMultiChatServer().start(); 
	}
} // outer class














