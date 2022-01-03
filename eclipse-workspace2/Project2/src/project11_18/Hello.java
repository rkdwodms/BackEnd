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
//	//�ݵ�� �������̵��� �־�� �ϴ� �Լ�
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
//	@Override //������̼� : 
//	//�������� �˻縦 ���� �Ѵ�. �θ��� �Լ��� �������̵� �� ���̴� �˷���
//	//���α׷����� �Ǽ��� �����ϱ� ���� �� / m2��� �߸����ΰ�� 
//	// �ٷ� ������ �˷���. 
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
				//��� �ڵ� ��� 
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
//				System.out.println("ȣ��");
//			}
//		});
		
		
		VBox root = new VBox();
		root.setPrefSize(400, 600);
		root.setSpacing(10); //��ư ���� ���� ä���ֱ� 
		
		//---------------------------------------
		Button btn1 = new Button("��ư1");
		// ��ư�� Ŭ���Ǹ�  handle()�Լ��� ȣ���ϼ���
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("ȣ��!!!");
				
				
			}
		});
		
		
		Button btn2 = new Button("��ư2");
		// ��ư�� Ŭ���Ǹ�  handle()�Լ��� ȣ���ϼ���
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("�ڳ���");

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


/*
// ex3)

public class Hello extends Application{
	@Override
	public void start(Stage ps) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 600);
		
		//---------------------------------------
		//���1 
//		Button btn1 = new Button("��ư1");
//		root.getChildren().add(btn1);
//		
//		Button btn2 = new Button("��ư2");
//		root.getChildren().add(btn2);
//		
		//���2
		
		
		Button btn1 = new Button("��ư1");
		Button btn2 = new Button("��ư2");
		
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
*/

//ex2)

/*
public class Hello extends Application{
	@Override
	public void start(Stage ps) throws Exception {
		VBox root = new VBox();
		
		root.setPrefSize(400, 600); //���� ����
		Scene scene = new Scene(root);
		
//		ps: ���� scene : ������ ����
		ps.setScene(scene); //�������� ����
		ps.show(); //���������� �Ѵ�. 
		
			}

	public static void main(String[] args) {
		
		System.out.println(1);
		launch(); //���ŷ �����ִ�. 
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
		ps.show(); //���̾�α�â ������
		System.out.println(3);
	}

	public static void main(String[] args) {
		
		System.out.println(1);
		launch(); //���ŷ �����ִ�. 
		System.out.println(4);
		
	}

}
*/
