package ThreadClass;

import java.util.Scanner;

class Lion extends Thread{
	public void run() {
		System.err.println("���ڽ���");
		Scanner sc= new Scanner(System.in);
		sc.nextInt();
		System.err.println("��������");
	}
}
class Tiger3 extends Thread{
	public void run() {
		System.err.println("ȣ���̽���");
		Thread t= new Lion();
		t.start();
		
		Scanner sc= new Scanner(System.in);
		sc.nextInt();
		System.err.println("ȣ��������");
	}
}
public class Thread {
	public static void main(String[] args) {
		System.err.println("���ν���");
		Thread t = new Tiger3();
		t.start();
		Scanner sc= new Scanner(System.in);
		sc.nextInt();
		System.err.println("��������");
	}
}
//class Tiger extends Thread{
//	public void run() {
//		System.out.println("������ ����");
//		System.out.println("run call");
//		System.out.println("������ ����");
//	}
//}
//
//public class Thread {
//	public static void main(String[] args) {
//		System.out.println("���ν���");
//		Thread t = new Tiger();
//		t.start();
//		try {
//			Thread.sleep(1000);
//		}catch(Exception e) {
//			
//		}
//		System.out.println("��������");
//	}
//}