package project11_11;

import java.util.Random;

public class Hello2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ex16) 10���� 100 ������ ������ �޴´�. 10�� ������ ���� �ٿ��ش�.
		
		Random rn = new Random();
		for (int i = 0; i < 10; i++) {
			
			int score = (rn.nextInt(90) + 10); // ���ؼ� 100 �Դϴ�.
//			int score = 85;
			int star = score/10;
			int space = 10-star;
			
			System.out.print(score + " ");
			
			for (int j = 0; j < star; j++) {
				System.out.print("*");			
			}
			
			for (int j = 0; j < space; j++) {
				System.out.print(" ");	
			}
			
			switch(star) {
			case 9:
				System.out.println("��");
				break;
				
			case 8:
				System.out.println("��");
				break;
				
			case 7:
				System.out.println("��");
				break;
				
			case 6:
				System.out.println("��");
				break;
				
			default:
				System.out.println("��");
				break;
			}

//			if(star >= 9) {
//				System.out.println("��");
//			}else if(star >= 8) {
//				System.out.println("��");
//			}else if(star >= 7) {
//				System.out.println("��");
//			}else if(star >= 6) {
//				System.out.println("��");
//			}else {
//				System.out.println("��");
//			}
//			
		}
		

	}

}
