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
	static ArrayList<Socket> list = new ArrayList<Socket>(); //���� Ȯ�� 
	Socket socket;
	public ClientThread(Socket socket) {
		this.socket = socket;
		list.add(socket);
		
	}
	public void run() {
		try {
			
//			//Ŭ���̾�Ʈ �޼��� �б� 
			InputStream is = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
//			
			//�޼��� ������ 
			OutputStream os = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(os, true);
			
			writer.println("���� �̸��� �Է����ּ��� ");
			
			String recv;
			String userName = null;
			boolean identify = false;
			
			
			while((recv = reader.readLine()) != null) {
				if(!identify) {
					userName = recv;
					identify = true;
					
					writer.println(userName + " �� ���� �Ϸ�");
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
		System.out.println("ä�� ���α׷��� ���� ���� ȯ���մϴ�.");
		//���� ������ �����Ѵ�. ������ �ʿ�!!!! �ϵ����� ��������!!
		ServerSocket serverSocket = null;
		try {
			while(true) {
				//1�� �̻� ���� �� �Ʒ��ڵ� ���⿡ �ֱ� 
				//			serverSocket = new ServerSocket();
				serverSocket.bind(new InetSocketAddress("localhost",5001));
				//				System.out.println("���ε� �Ϸ�");

				//���ŷ �Լ��̴�.
				// ������ �����͸� �ְ�޴� ��� ������ �ȴ�
				socket=serverSocket.accept();
				System.out.println(socket.getInetAddress() + "���� ������");
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

		Button btn1 = new Button("��������");
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
			
				new ConnectThread().start();

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

