package project11_12;

import java.util.Random;

public class Exceptions {	
	static void BubbleSort(int[] ar) {
		int n = ar.length-1;
		while(true) {
			int last =0;
			for (int i = 0; i < n; i++) {
				if(ar[i]>ar[i+1]) {
					
					int t = ar[i];
					ar[i] = ar[i+1];
					ar[i+1] = t;

//					swap(ar,i,i+1);
					last=i;
				}
			}
			if(last==0)
				break;
		}
	}
	
	static void InsertSort(int[] ar) {
		for (int i = 1; i < ar.length; i++) {
			int aux = i-1;
			int temp = ar[i];
			
			while(aux >=0 && ar[aux] > temp) {
				ar[aux+1] = ar[aux];
				aux--; // 앞으로 자리 이동을 하기 때문에 
			}
			ar[aux+1] = temp;
		}
		System.out.println("----------------------------------");
		
	}
	static void ShellSort(int[] ar) {
		for(int k = 0 ; k < 3 ; k++) {
			int way = (int) Math.pow(2, 2 - k);
			int wayLength = ar.length/way;
			
			System.out.printf("%d Way InsertionSort\n", way);
		
			for(int j = 0 ; j < ar.length/wayLength ; j++) {
				for(int i = 1 ; i < wayLength ; i++) {
					int temp = ar[i*way+j];
					int aux = (i-1)*way+j;
					
					while(aux >= 0 && ar[aux] > temp) {
						ar[aux+way] = ar[aux];
						aux -= way;
					}
					
					ar[aux+way] = temp;
				}
			}
			
			System.out.println("-----------------------------");
		
			System.out.println();
			
		}
	}
	static void SelectSort(int[] ar) {
		
		
		
		for (int i = 0; i < ar.length-1; i++) {
		int m = i ;
	
		for (int j = i+1; j < ar.length; j++) {
			if(ar[m]>ar[j]) {
				m=j;
			}
	}
		int t = ar[i];
		ar[i] = ar[m];
		ar[m] = t;
		
	}
}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	int num = 100000;
	int[] ar = new int[num];
	Random rn = new Random();
	
	for (int i = 0; i < num; i++) {
		ar[i] = rn.nextInt(); //쁠마 20억을 랜덤으로 받을 수 있음
		
	}
	
	long start = System.currentTimeMillis();
	
	//출력코드는 정렬코드안에서 사용하지 마세요.
	//선택 정렬
	
	SelectSort(ar);
	
	
	
	//버블 정렬
//	BubbleSort(ar);
	
	//삽입 정렬
	
//	InsertSort(ar);
	
	//셀 정렬
	
//	ShellSort(ar);
		
	
	long end = System.currentTimeMillis();
//	System.out.println(end-start);
//	
//	start = System.currentTimeMillis();
	System.out.println("측정시간:" + (end-start));
	
	
	for (int i = 0; i < 10; i++) {
		System.out.println(ar[i] + " ");
	}System.out.println();

	
	
	
	
//	class Tiger{
//		void m1() {
//			System.out.println(1);
//			
//			try {
//				throw new Exception();
//			}catch (Exception e) {
//				
//			}
//				
//			}
//		void m2() {
//		}
//	}

	
	
	
//ex22)
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		long start = System.currentTimeMillis();
//		
//		try { Thread.sleep(1000);} catch (Exception e) {}
//		
//		long end = System.currentTimeMillis();
//		System.out.println(end-start);
//		
			
		
		
//	ex1)
		//ArithmeticException
		//ArrayIndexOutOfBoundsExcepiton
		//NullPointerException
//		
//		System.out.println(1);
//		int num = 0;
//		
//		try {
////			int[] ar = new int[10];
////			ar[10] = 1000; //error
//			
//			String s = null;
//			s = new String("호랑이");
//			
//		} catch (Exception e) {
//		
//			// TODO: handle exception
//			System.out.println(10000);
//			e.printStackTrace(); // 예외가 무엇인지 알려주는 코드
//			
//		}
//		
//		System.out.println(2);

	}

}
