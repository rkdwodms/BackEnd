package Pack;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.*;

class Send implements Runnable{
	
	DataOutputStream out;
	                                                          
	BufferedReader nick = new BufferedReader(new InputStreamReader(System.in));
	
	public Send(DataOutputStream out) {
		this.out = out;
	}
	
	public void run() {
		while(true) {
			try {
				String message = nick.readLine();
				out.writeUTF(message);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
class ClientThread extends Thread{
	Socket socket;
	public ClientThread(Socket socket) {
		this.socket = socket;
	}
	public void run() {
		try {
			
			InputStream is = socket.getInputStream();
			byte[] recvData = new byte[4096];
			
			while(true) {
				int size = is.read(recvData);
				
				if(size == -1) {
					System.out.println("채팅프로그램이 종료됩니다.");
					break;
					
				}
					
				
				//0 1 2 3
				//1,2,3,4
				//분해된 데이터를 조립해야한다. 
				String s = new String(recvData, 0, size, "utf-8");
				System.out.println(s);
				
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
//			while(true) {
			//1명 이상 받을 때 아래코드 여기에 넣기 
//				
//			}
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost",5001));
			System.out.println("바인드 완료");

			//블로킹 함수이다.
			// 소켓은 데이터를 주고받는 통신 수단이 된다
			socket=serverSocket.accept();
			System.out.println("누군가 접속함");
			new ClientThread(socket).start();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
public class Server extends Application {
	
	

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

				// 접속 소켓을 생성한다. 쓰레드 필요!!!! 니도돌고 나도돌고!!
//				ServerSocket serverSocket = null;
//				try {
//					serverSocket = new ServerSocket();
//					serverSocket.bind(new InetSocketAddress("localhost",5001));
//					System.out.println("바인드 완료");
//
//					//블로킹 함수이다.
//					// 소켓은 데이터를 주고받는 통신 수단이 된다
//					Socket socket=serverSocket.accept();
//					System.out.println("누군가 접속함");
//
//				}catch (Exception e) {
//					e.printStackTrace();
//				}
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
		// TODO Auto-generated method stub
//		System.out.println("Server");
//
//		// 접속 소켓을 생성한다.
//		ServerSocket serverSocket = null;
//		try {
//			serverSocket = new ServerSocket();
//			serverSocket.bind(new InetSocketAddress("localhost",5001));
//			System.out.println("바인드 완료");
//
//			//블로킹 함수이다.
//			// 소켓은 데이터를 주고받는 통신 수단이 된다
//			Socket socket=serverSocket.accept();
//			System.out.println("누군가 접속함");
//
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//
//
//		// 프로그램이 종료되는것을 막기 위한 블로킹
//		new Scanner(System.in).nextInt(); // 잠시 블로킹 시키기 위한 것 
//		System.out.println("Server End");
//	}





//
//	
//
//
//
//public class Server extends Application {
//	
//	public void start(Stage ps) throws Exception {
//		// TODO Auto-generated method stub
//		VBox root = new VBox();
//		root.setPrefSize(400, 300);
//		root.setSpacing(5);
//
//		//------------------------
//
//		Button btn1 = new Button("접속");
//		btn1.setOnAction(new EventHandler<ActionEvent>() {
//			
//			@Override
//			public void handle(ActionEvent arg0) {
//
//				//접속 시도를 하겠다. 
//
//				Socket socket = new Socket();
//				try {
//					socket.connect(new InetSocketAddress("localhost",500));
//				} catch (Exception e) {
//
//				}
//
//			}
//		});
//
//		root.getChildren().addAll(btn1);
//		//----------------------
//
//		Scene scene = new Scene(root);
//		ps.setTitle("서버");
//		ps.setScene(scene); //공연내용 설정
//		ps.show(); //최종공연을 한다. 
//
//	}
//
//
//
//	public static void main(String[] args) {
//		System.out.println("Server");
//
//		ServerSocket serversocket = null;
//
//		try {
//			serversocket = new ServerSocket();
//			// 바인딩
//			serversocket.bind(new InetSocketAddress("localhost",5001));
//			System.out.println("Completed Binding!");
//
//			//블로킹 함수이다. 
//			//soocket은 데이터를 주고 받는 통신 소켓이 된다. 
//			Socket socket = serversocket.accept();
//			System.out.println("누가 접속함");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//
//		// 프로프램이 종료되는 것을 막기 위한 블로킹
//		new Scanner(System.in).nextInt();
//		System.out.println("server end");
//
//	}
//
//}
