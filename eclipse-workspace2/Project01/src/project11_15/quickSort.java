package project11_15;

import java.util.Iterator;

//����Լ� + ������ 
public class quickSort {
	
//	static void m1() {
//		System.out.println(1);
//		m2();
//		
//		
//	}
//	
//	static void m2() {
//		m1(); //this ���� //static�� ���������� ������ ������ ��ü�� �����Ǳ� ���� 
//		//this�� ����� �� ���� ������ 
//		System.out.println(2);
//	}
//	//���ȣ��(�ʿ信 ���� ����� �� �ִ�.)
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
//		m4(num); //num�� 3�� ���޵Ǿ� ����. 
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
		
		while(i <= j) { //4 5������ ���� �����̴�. 
			//i�� ����, j�� ���Ҵϱ� i�� j���� ũ�� �ȴٸ� ���������̴�.
//			//while�� �ε�ȣ�� �ٲ�� �ȴٸ� 
			//true�̴ϱ� if������ �ʿ� ���� �ȴ�.
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
			
			//i j�� �����ϴ� �������� ���� ���̴�. 
		}
		
		
		
		/*
		int a=1, b=2;
		temp = a;
		a = b;
		b = a;
		*/
		
		//�����丵 �ȵ� �ڵ� 
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
////		m1(); //�״��ڵ�
////		m3(); //�״��ڵ�
//		m4(2); //4�� ������ �ȴ�. 
////		ex26) ������
//		
//		int sum = m5(4);
//		System.out.println(sum);
//		System.out.println(m6(10));
		
