package project11_18;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//interface A{
//	void m1();
//}
//
//class B implements A{
//	//반드시 오버라이딩이 있어야 하는 함수
//	public void m1() {
//		
//	}
//}

//
//class A{
//	void m1() {
//		
//	}
//	
//}
//
//class B extends A{
//	@Override //어노테이션 : 
//	//문법적인 검사를 먼저 한다. 부모의 함수를 오버라이딩 한 것이다 알려줌
//	//프로그래머의 실수를 방지하기 위한 것 / m2라고 잘못붙인경우 
//	// 바로 에러를 알려줌. 
//	void m1() {
//		
//	}
//	
//}

interface A{
	void m1();
}

class B {
	// A a = new A() {}
	void m2(A a) {
		a.m1();
		
	}
}

//ex4)



public class Hello extends Application{
	@Override
	public void start(Stage ps) throws Exception {
		
		A a = new A() {
			@Override
			public void m1() {
				//출력 코드 사용 
			}
		};
		
		B b = new B();
		b.m2(new A() {
			@Override
			public void m1() {
				
			}
		});
//		A a = new A() {
//			public void m1() {
//				
//			}
//		};
//		a.m1();
//		
//		
//		B b = new B();
//		b.m2(new A() {
//			@Override
//			public void m1() {
//				System.out.println("호출");
//			}
//		});
		
		
		VBox root = new VBox();
		root.setPrefSize(400, 600);
		root.setSpacing(10); //버튼 사이 공백 채워주기 
		
		//---------------------------------------
		Button btn1 = new Button("버튼1");
		// 버튼이 클릭되면  handle()함수를 호출하세요
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("호출!!!");
				
				
			}
		});
		
		
		Button btn2 = new Button("버튼2");
		// 버튼이 클릭되면  handle()함수를 호출하세요
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("코끼리");

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


/*
// ex3)

public class Hello extends Application{
	@Override
	public void start(Stage ps) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 600);
		
		//---------------------------------------
		//방법1 
//		Button btn1 = new Button("버튼1");
//		root.getChildren().add(btn1);
//		
//		Button btn2 = new Button("버튼2");
//		root.getChildren().add(btn2);
//		
		//방법2
		
		
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		
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
*/

//ex2)

/*
public class Hello extends Application{
	@Override
	public void start(Stage ps) throws Exception {
		VBox root = new VBox();
		
		root.setPrefSize(400, 600); //가로 세로
		Scene scene = new Scene(root);
		
//		ps: 무대 scene : 공연할 내용
		ps.setScene(scene); //공연내용 설정
		ps.show(); //최종공연을 한다. 
		
			}

	public static void main(String[] args) {
		
		System.out.println(1);
		launch(); //블로킹 잡혀있다. 
		System.out.println(4);
		
	}

}
*/

//ex1) 

/*
public class Hello extends Application{
	@Override
	public void start(Stage ps) throws Exception {
		System.out.println(2);
		ps.show(); //다이얼로그창 보여줌
		System.out.println(3);
	}

	public static void main(String[] args) {
		
		System.out.println(1);
		launch(); //블로킹 잡혀있다. 
		System.out.println(4);
		
	}

}
*/
