package ThreadClass;

import java.util.Scanner;

class Lion extends Thread{
	public void run() {
		System.err.println("사자시작");
		Scanner sc= new Scanner(System.in);
		sc.nextInt();
		System.err.println("사자종료");
	}
}
class Tiger3 extends Thread{
	public void run() {
		System.err.println("호랑이시작");
		Thread t= new Lion();
		t.start();
		
		Scanner sc= new Scanner(System.in);
		sc.nextInt();
		System.err.println("호랑이종료");
	}
}
public class Thread {
	public static void main(String[] args) {
		System.err.println("메인시작");
		Thread t = new Tiger3();
		t.start();
		Scanner sc= new Scanner(System.in);
		sc.nextInt();
		System.err.println("메인종료");
	}
}
//class Tiger extends Thread{
//	public void run() {
//		System.out.println("스레드 시작");
//		System.out.println("run call");
//		System.out.println("스레드 종료");
//	}
//}
//
//public class Thread {
//	public static void main(String[] args) {
//		System.out.println("메인시작");
//		Thread t = new Tiger();
//		t.start();
//		try {
//			Thread.sleep(1000);
//		}catch(Exception e) {
//			
//		}
//		System.out.println("메인종료");
//	}
//}