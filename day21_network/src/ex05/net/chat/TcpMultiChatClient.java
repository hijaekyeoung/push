package ex05.net.chat;

import java.io.*;
import java.net.*;
import java.util.*;

public class TcpMultiChatClient {
	public static void main(String[] args) {
		if(args.length != 1) { // args안에 value값이 없는 경우
			System.out.println("USAGE : java TcpMultiChatClient nickname ? ");
			System.exit(0);
		}
		
		try {
			String ip = "192.168.0.39";
			Socket s = new Socket(ip,7777);
			System.out.println("서버에 연결되었습니다.");
			
			Thread sender = new Thread(new ClientSender(s, args[0])); // 값을 보내는 스레드(나의 채팅)
			Thread receiver = new Thread(new ClientReceiver(s)); // 값을 받는 스레드(다른 유저의 채팅)
			
			sender.start();		receiver.start(); // run() 메소드 유도
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	static class ClientSender extends Thread { // inner class
		Socket s;
		DataOutputStream dos;
		String name;
		
		public ClientSender(Socket s, String name) {
			this.s = s;
			try {
				dos = new DataOutputStream(s.getOutputStream());
				this.name = name;
			} catch (Exception e) {e.printStackTrace();}
		}

		@Override
		public void run() {
			Scanner sc = new Scanner(System.in); // 키보드로 부터 입력 받겠다.
			try {
				if(dos != null) dos.writeUTF(name);
				while(dos != null) dos.writeUTF("["+name+"] "+sc.nextLine());
			} catch (Exception e) { e.printStackTrace(); }
		} // end run()
		
	} // end class
	
	static class ClientReceiver extends Thread { // inner class
		Socket s;
		DataInputStream dis;
		
		public ClientReceiver(Socket s) {
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream());
			} catch (Exception e) { e.printStackTrace(); }
		}
		
		@Override
		public void run() {
			while(dis != null) {
				try {
					System.out.println(dis.readUTF());
				} catch (Exception e) { e.printStackTrace(); }
			}
		} // run() end
		
	} // end class
}
