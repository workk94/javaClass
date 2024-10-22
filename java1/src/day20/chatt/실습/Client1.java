package day20.chatt.실습;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
	
	Socket socket;	// 두 개의 기반스트림, 입력, 출력
	
	// 보조스트림 
	DataInputStream is;
	DataOutputStream os;
	
	public Client1() {
		try {
			socket = new Socket("localhost", 5600); // 접속할 서버주소, 포트번호 
			
			// 기반 스트림연결 
			is = new DataInputStream(socket.getInputStream());
			os = new DataOutputStream(socket.getOutputStream());
			
			//
			dataSend();
			dataRecv();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	
	private void dataRecv() {
		
		try {
			String msg =is.readUTF();
			System.out.println(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	private void dataSend() {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("메시지 작성 : ");
			String msg = sc.nextLine();
			os.writeUTF(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public static void main(String[] args) {
		Client1 client1 = new Client1();
	}
}
