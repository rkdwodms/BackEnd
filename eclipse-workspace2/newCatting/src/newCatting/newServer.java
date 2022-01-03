package newCatting;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.*;


class ClientThread extends Thread{
	static ArrayList<Socket> list = new ArrayList<Socket>(); //유저 확인 
	Socket socket;
	public ClientThread(Socket socket) {
		this.socket = socket;
		list.add(socket);
		
	}
	public void run() {
		try {
			
//			//클라이언트 메세지 읽기 
			InputStream is = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
//			
			//메세지 보내기 
			OutputStream os = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(os, true);
			
			writer.println("유저 이름을 입력해주세요 ");
			
			String recv;
			String userName = null;
			boolean identify = false;
			
			
			while((recv = reader.readLine()) != null) {
				if(!identify) {
					userName = recv;
					identify = true;
					
					writer.println(userName + " 님 접속 완료");
					continue;
				}
				
				for (int i = 0; i < list.size(); i++) {
					os = list.get(i).getOutputStream();
					writer = new PrintWriter(os, true);
					
					writer.println(userName + " : " + recv );
					
				}
			}
	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
}


class ConnectThread extends Thread{
	Socket socket;
	public void run() {
		System.out.println("채팅 프로그램에 오신 것을 환영합니다.");
		//접속 소켓을 생성한다. 쓰레드 필요!!!! 니도돌고 나도돌고!!
		ServerSocket serverSocket = null;
		try {
			while(true) {
				//1명 이상 받을 때 아래코드 여기에 넣기 
				//			serverSocket = new ServerSocket();
				serverSocket.bind(new InetSocketAddress("localhost",5001));
				//				System.out.println("바인드 완료");

				//블로킹 함수이다.
				// 소켓은 데이터를 주고받는 통신 수단이 된다
				socket=serverSocket.accept();
				System.out.println(socket.getInetAddress() + "에서 접속함");
				new ClientThread(socket).start();	
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
public class newServer extends Application {
	

	public void start(Stage ps) throws Exception {
		// TODO Auto-generated method stub
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(5);

		//------------------------

		Button btn1 = new Button("서버오픈");
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
			
				new ConnectThread().start();

			}
		});

		root.getChildren().addAll(btn1);
		//----------------------

		Scene scene = new Scene(root);
		ps.setTitle("서버");
		ps.setScene(scene); //공연내용 설정
		ps.show(); //최종공연을 한다. 
	}
	
	public static void main(String[] args) {
		launch();
	}
		
}

