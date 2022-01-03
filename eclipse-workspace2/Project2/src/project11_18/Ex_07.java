package project11_18;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

class ConnectThread extends Thread{
	Ex_07 content; // Ex_07�� ������ ����ϱ� ���ؼ� content�� �������� ���̴�. 
	Button btn;
	
	ConnectThread() {}
	
	ConnectThread(Button btn) {
		this.btn = btn;
	}
	ConnectThread(Ex_07 content) {
		this.content = content;
	}
	public void run() {
//		Platform.runLater(()->{
//			
//			btn.setText("������");
//			
//		});
		
		Platform.runLater(()->{
			content.btn2.setText("�޹�����"+ "");
			
		});
		
	}
}
public class Ex_07 extends Application {
	
	Button btn1 = new Button("��ư1");
	Button btn2 = new Button("��ư2");

	@Override
	public void start(Stage ps) throws Exception {

		VBox root = new VBox();
		root.setPrefSize(400, 600);
		root.setSpacing(10); //��ư ���� ���� ä���ֱ� 
		
		
		// thread���� ��Ʈ���� �Ӽ��� ������ ��  ����
		// ������ �ϰ� �ʹٸ� runlater()�Լ��� �������  : ���� �浹���� �ʵ��� ���߿� thread ����
		//---------------------------------------
		
		
		// ��ư�� Ŭ���Ǹ�  handle()�Լ��� ȣ���ϼ���s
		btn1.setOnAction(new EventHandler<ActionEvent>() {
		
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("ȣ��!!!");
				new ConnectThread(Ex_07.this).start();	
			}
		});

		root.getChildren().addAll(btn1,btn2);

		//---------------------------------------

		Scene scene = new Scene(root);
		ps.setTitle("ȣ���� �޽���");
		ps.setScene(scene); //�������� ����
		ps.show(); //���������� �Ѵ�. 	
	}

	public static void main(String[] args) {

		System.out.println(1);
		launch(); //���ŷ �����ִ�. 
		System.out.println(4);

	}

}

