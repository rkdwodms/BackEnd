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
		
		Button btn1 = new Button("����");
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				socket = new Socket();
				
			//���� �õ��� �ϰڴ�. 
				
			try {
				socket.connect(new InetSocketAddress("localhost",5001));
			} catch (Exception e) {
				
			}
				
			}
		});
		
		Button btn2 = new Button("������ ����");
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
					
					//��������
					os.write(sendData);
					
				} catch (Exception e) {
					// TODO: handle exception
					
					e.printStackTrace();
				}
			}
		});
		
		Button btn3 = new Button("Ŭ���̾�Ʈ ����");
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
//		System.out.print("���� ������ �Է����ּ���");
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
		ps.setTitle("Ŭ���̾�Ʈ");
		ps.setScene(scene); //�������� ����
		ps.show(); //���������� �Ѵ�. 
		
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
//		// ���� ����
//		System.out.println("���ڸ� �Է��ϸ� Ŭ���̾�Ʈ�� ����˴ϴ�.");
//		new Scanner(System.in).nextInt(); // ��� ���ŷ ��Ű�� ���� �� 
//		System.out.println("Client End");
//		
//		
		
		
		
	}

	}
