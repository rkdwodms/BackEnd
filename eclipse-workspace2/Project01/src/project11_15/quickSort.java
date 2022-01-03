package project11_15;

import java.util.Iterator;

//재귀함수 + 퀵정렬 
public class quickSort {
	
//	static void m1() {
//		System.out.println(1);
//		m2();
//		
//		
//	}
//	
//	static void m2() {
//		m1(); //this 생략 //static은 전역변수로 나가기 때문에 객체가 생성되기 전에 
//		//this를 사용할 수 없기 때문에 
//		System.out.println(2);
//	}
//	//재귀호출(필요에 따라서 사용할 수 있다.)
//	static void m3() {
//		
//		System.out.println(3);
//		m3();
//	}
//	
//	static void m4(int num) {
//		if(num<0) {
//			return ;
//		}
//		System.out.println(num);
//		num--; //3 
//		m4(num); //num은 3이 전달되어 진다. 
//	}
//
//	static int m5(int num) {
//		if(num == 1)
//			return 1;
//		
//		return num * m5(num-1);
//	}
//	
//	static int m6(int num) {
//		if(num <1)
//			return 0;
//		return num + m6(num-1);
//	}

	static void show(int[] ar ) {
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%2d ", i);
			
		}System.out.println();
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%02d ", ar[i]);
			
		}System.out.println();
		System.out.println("-----------------------------");
		
	}
	
	public static void main(String[] args) {
			
		int[] ar= { 50, 70, 10, 
				90, 60, 20, 
				30, 40, 80};
		
		show(ar);
		int pivot = 60;
		int i =0;
		int j = ar.length-1;
		int temp;
		
		while(i <= j) { //4 5지점이 교차 지점이다. 
			//i는 증가, j는 감소니까 i가 j보다 크게 된다면 교차지점이다.
//			//while의 부등호가 바뀌게 된다면 
			//true이니까 if문장이 필요 없게 된다.
//			if(i > j) {
//				System.out.println("exit : " + i + " " + j);
//				break;
//			}
			
			while(ar[i] < pivot) i++;
			while(ar[j] > pivot) j--;

			temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;

			System.out.println(i + " " + j);
			show(ar);
			
			i++;
			j--;
			
			//i j가 교차하는 지점에서 멈출 것이다. 
		}
		
		
		
		/*
		int a=1, b=2;
		temp = a;
		a = b;
		b = a;
		*/
		
		//리팩토링 안된 코드 
		while(true) {
			if(ar[i] >= pivot) {
				break;
			}else {
				i++;
			}
		while(true) {
			if(ar[i] >= pivot) {
				break;
			}else {
				j--;
			}
		}
		}
		
		
	}

	}


		// TODO Auto-generated method stub
////		m1(); //죽는코드
////		m3(); //죽는코드
//		m4(2); //4가 전달이 된다. 
////		ex26) 퀵정렬
//		
//		int sum = m5(4);
//		System.out.println(sum);
//		System.out.println(m6(10));
		
