package project11_11;

import java.util.Random;

public class Hello2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ex16) 10부터 100 사이의 점수를 받는다. 10점 단위로 별을 붙여준다.
		
		Random rn = new Random();
		for (int i = 0; i < 10; i++) {
			
			int score = (rn.nextInt(90) + 10); // 더해서 100 입니다.
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
				System.out.println("수");
				break;
				
			case 8:
				System.out.println("우");
				break;
				
			case 7:
				System.out.println("미");
				break;
				
			case 6:
				System.out.println("양");
				break;
				
			default:
				System.out.println("가");
				break;
			}

//			if(star >= 9) {
//				System.out.println("수");
//			}else if(star >= 8) {
//				System.out.println("우");
//			}else if(star >= 7) {
//				System.out.println("미");
//			}else if(star >= 6) {
//				System.out.println("양");
//			}else {
//				System.out.println("가");
//			}
//			
		}
		

	}

}
