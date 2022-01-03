package Pack;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
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
import javafx.stage.Stage;


public class Client extends Application {
	Socket socket;
	DataInputStream in = null;
	BufferedReader nick = null;
	DataOutputStream out = null;
	
	@Override
	public void start(Stage ps) throws Exception {
		// TODO Auto-generated method stub
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(5);
		
		
				//------------------------
		
		Button btn1 = new Button("접속");
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				socket = new Socket();
				
			//접속 시도를 하겠다. 
				
			try {
				socket.connect(new InetSocketAddress("localhost",5001));
			} catch (Exception e) {
				
			}
				
			}
		});
		
		Button btn2 = new Button("데이터 전송");
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			int count=0;
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					OutputStream os = socket.getOutputStream();
					byte[] sendData;
					String s = "apple" + count++;
					
					sendData = s.getBytes("utf-8");
					
					//보내보자
					os.write(sendData);
					
				} catch (Exception e) {
					// TODO: handle exception
					
					e.printStackTrace();
				}
			}
		});
		
		Button btn3 = new Button("클라이언트 종료");
		btn3.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				try {
					socket.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		});
		
//		in = new DataInputStream(socket.getInputStream());
//		nick = new BufferedReader(new InputStreamReader(System.in));
//		out = new DataOutputStream(socket.getOutputStream());
//		
//		System.out.print("유저 네임을 입력해주세요");
//		String userName = nick.readLine();
//		
//		out.writeUTF(userName);
//		Thread th = new Thread(new Send(out));
//		th.start();
//		
//		try {
//			while(true) {
//				String str2 = in.readUTF();
//				System.out.println(str2);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		
//	
		
		root.getChildren().addAll(btn1,btn2,btn3);
		//----------------------
		
		Scene scene = new Scene(root);
		ps.setTitle("클라이언트");
		ps.setScene(scene); //공연내용 설정
		ps.show(); //최종공연을 한다. 
		
	}
	

	public static void main(String[] args) {
		
		launch();
		
//		System.out.println("Client");
//
//		Socket socket = new Socket();
//		try {
//			socket.connect(new InetSocketAddress("localhost",5001));
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		// 종료 방지
//		System.out.println("숫자를 입력하면 클라이언트가 종료됩니다.");
//		new Scanner(System.in).nextInt(); // 잠시 블로킹 시키기 위한 것 
//		System.out.println("Client End");
//		
//		
		
		
		
	}

	}
