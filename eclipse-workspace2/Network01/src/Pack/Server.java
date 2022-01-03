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
					System.out.println("ä�����α׷��� ����˴ϴ�.");
					break;
					
				}
					
				
				//0 1 2 3
				//1,2,3,4
				//���ص� �����͸� �����ؾ��Ѵ�. 
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
		System.out.println("ä�� ���α׷��� ���� ���� ȯ���մϴ�.");
		//���� ������ �����Ѵ�. ������ �ʿ�!!!! �ϵ����� ��������!!
		ServerSocket serverSocket = null;
		try {
//			while(true) {
			//1�� �̻� ���� �� �Ʒ��ڵ� ���⿡ �ֱ� 
//				
//			}
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost",5001));
			System.out.println("���ε� �Ϸ�");

			//���ŷ �Լ��̴�.
			// ������ �����͸� �ְ�޴� ��� ������ �ȴ�
			socket=serverSocket.accept();
			System.out.println("������ ������");
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

		Button btn1 = new Button("��������");
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
			
				new ConnectThread().start();

				// ���� ������ �����Ѵ�. ������ �ʿ�!!!! �ϵ����� ��������!!
//				ServerSocket serverSocket = null;
//				try {
//					serverSocket = new ServerSocket();
//					serverSocket.bind(new InetSocketAddress("localhost",5001));
//					System.out.println("���ε� �Ϸ�");
//
//					//���ŷ �Լ��̴�.
//					// ������ �����͸� �ְ�޴� ��� ������ �ȴ�
//					Socket socket=serverSocket.accept();
//					System.out.println("������ ������");
//
//				}catch (Exception e) {
//					e.printStackTrace();
//				}
			}
		});

		root.getChildren().addAll(btn1);
		//----------------------

		Scene scene = new Scene(root);
		ps.setTitle("����");
		ps.setScene(scene); //�������� ����
		ps.show(); //���������� �Ѵ�. 
	}
	
	public static void main(String[] args) {
		launch();
	}
		
}
		// TODO Auto-generated method stub
//		System.out.println("Server");
//
//		// ���� ������ �����Ѵ�.
//		ServerSocket serverSocket = null;
//		try {
//			serverSocket = new ServerSocket();
//			serverSocket.bind(new InetSocketAddress("localhost",5001));
//			System.out.println("���ε� �Ϸ�");
//
//			//���ŷ �Լ��̴�.
//			// ������ �����͸� �ְ�޴� ��� ������ �ȴ�
//			Socket socket=serverSocket.accept();
//			System.out.println("������ ������");
//
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//
//
//		// ���α׷��� ����Ǵ°��� ���� ���� ���ŷ
//		new Scanner(System.in).nextInt(); // ��� ���ŷ ��Ű�� ���� �� 
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
//		Button btn1 = new Button("����");
//		btn1.setOnAction(new EventHandler<ActionEvent>() {
//			
//			@Override
//			public void handle(ActionEvent arg0) {
//
//				//���� �õ��� �ϰڴ�. 
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
//		ps.setTitle("����");
//		ps.setScene(scene); //�������� ����
//		ps.show(); //���������� �Ѵ�. 
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
//			// ���ε�
//			serversocket.bind(new InetSocketAddress("localhost",5001));
//			System.out.println("Completed Binding!");
//
//			//���ŷ �Լ��̴�. 
//			//soocket�� �����͸� �ְ� �޴� ��� ������ �ȴ�. 
//			Socket socket = serversocket.accept();
//			System.out.println("���� ������");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//
//		// ���������� ����Ǵ� ���� ���� ���� ���ŷ
//		new Scanner(System.in).nextInt();
//		System.out.println("server end");
//
//	}
//
//}
