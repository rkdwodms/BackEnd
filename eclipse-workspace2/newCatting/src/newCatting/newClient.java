package newCatting;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
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

class SendThead extends Thread {
	Socket socket = null;
	Scanner sc = new Scanner(System.in);
	
	public SendThead(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			OutputStream os = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(os, true);
			
			while(true) {
				writer.println(sc.nextLine());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class RecvThread extends Thread {
	Socket socket = null; 
	
	public RecvThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			InputStream input = socket.getInputStream();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			while(true) {
				System.out.println(reader.readLine());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
public class newClient extends Application {
	Socket socket;
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
					SendThead st = new SendThead(socket);
					st.start();
					
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
		
		root.getChildren().addAll(btn1,btn2,btn3);
		//----------------------
		
		Scene scene = new Scene(root);
		ps.setTitle("클라이언트");
		ps.setScene(scene); //공연내용 설정
		ps.show(); //최종공연을 한다. 
		
	}
	

	public static void main(String[] args) {
		launch();
		
		
		
	}

	}
