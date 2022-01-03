package project11_18;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex_06 extends Application {

	@Override
	public void start(Stage ps) throws Exception {


		VBox root = new VBox();
		root.setPrefSize(400, 600);
		root.setSpacing(10); //��ư ���� ���� ä���ֱ� 
		
		
		// thread���� ��Ʈ���� �Ӽ��� ������ ��  ����
		// ������ �ϰ� �ʹٸ� runlater()�Լ��� �������  : ���� �浹���� �ʵ��� ���߿� thread ����
		//---------------------------------------
		Button btn1 = new Button("��ư1");
		Button btn2 = new Button("��ư2");
		
		// ��ư�� Ŭ���Ǹ�  handle()�Լ��� ȣ���ϼ���s
		btn1.setOnAction(new EventHandler<ActionEvent>() {
		
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("ȣ��!!!");
				new Thread() {
					public void run() {
						System.out.println("thread call!!!");
						//while(true) {}
						//�ܵ����� ����ϸ� �״´�. 
//						btn2.setText("������");
						
						Platform.runLater( ()->{
							btn2.setText("������");	
						});
					}
				}.start();

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

