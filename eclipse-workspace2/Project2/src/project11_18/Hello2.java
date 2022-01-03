package project11_18;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//ex5)
public class Hello2 extends Application {

	@Override
	public void start(Stage ps) throws Exception {


		VBox root = new VBox();
		root.setPrefSize(400, 600);
		root.setSpacing(10); //��ư ���� ���� ä���ֱ� 

		//---------------------------------------
		Button btn1 = new Button("��ư1");
		// ��ư�� Ŭ���Ǹ�  handle()�Լ��� ȣ���ϼ���
		btn1.setOnAction(new EventHandler<ActionEvent>() {
		
			@Override
			public void handle(ActionEvent arg0) {
//				System.out.println("ȣ��!!!");
				btn1.setDisable(true);


			}
		});
		
		Button btn2 = new Button("��ư2");
		// ��ư�� Ŭ���Ǹ�  handle()�Լ��� ȣ���ϼ���
		btn2.setOnAction(new EventHandler<ActionEvent>() {
		
			@Override
			public void handle(ActionEvent arg0) {
				btn1.setDisable(false);


			}
		});
		
		TextArea textArea = new TextArea();
// 		�Է�â ����� 
		TextField textfield = new TextField();
		textfield.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
//				System.out.println("�޹�");
				String s = textfield.getText();
				System.out.println(s);
//				textArea.setText(s);
				textArea.appendText(s + "\n");
				textfield.setText("");
			}
		});


		root.getChildren().addAll(btn1,btn2, textfield, textArea);

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

