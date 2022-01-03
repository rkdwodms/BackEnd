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
	Ex_07 content; // Ex_07의 변수를 사용하기 위해서 content를 선언해준 것이다. 
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
//			btn.setText("독수리");
//			
//		});
		
		Platform.runLater(()->{
			content.btn2.setText("앵무무무"+ "");
			
		});
		
	}
}
public class Ex_07 extends Application {
	
	Button btn1 = new Button("버튼1");
	Button btn2 = new Button("버튼2");

	@Override
	public void start(Stage ps) throws Exception {

		VBox root = new VBox();
		root.setPrefSize(400, 600);
		root.setSpacing(10); //버튼 사이 공백 채워주기 
		
		
		// thread에서 컨트롤의 속성을 변경할 수  없다
		// 변경을 하고 싶다면 runlater()함수를 기억하자  : 둘이 충돌하지 않도록 나중에 thread 설정
		//---------------------------------------
		
		
		// 버튼이 클릭되면  handle()함수를 호출하세요s
		btn1.setOnAction(new EventHandler<ActionEvent>() {
		
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("호출!!!");
				new ConnectThread(Ex_07.this).start();	
			}
		});

		root.getChildren().addAll(btn1,btn2);

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

