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
		root.setSpacing(10); //버튼 사이 공백 채워주기 

		//---------------------------------------
		Button btn1 = new Button("버튼1");
		// 버튼이 클릭되면  handle()함수를 호출하세요
		btn1.setOnAction(new EventHandler<ActionEvent>() {
		
			@Override
			public void handle(ActionEvent arg0) {
//				System.out.println("호출!!!");
				btn1.setDisable(true);


			}
		});
		
		Button btn2 = new Button("버튼2");
		// 버튼이 클릭되면  handle()함수를 호출하세요
		btn2.setOnAction(new EventHandler<ActionEvent>() {
		
			@Override
			public void handle(ActionEvent arg0) {
				btn1.setDisable(false);


			}
		});
		
		TextArea textArea = new TextArea();
// 		입력창 만들기 
		TextField textfield = new TextField();
		textfield.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
//				System.out.println("앵무");
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
		ps.setTitle("호랑이 메신저");
		ps.setScene(scene); //공연내용 설정
		ps.show(); //최종공연을 한다. 	
	}

	public static void main(String[] args) {

		System.out.println(1);
		launch(); //블로킹 잡혀있다. 
		System.out.println(4);

	}

}

