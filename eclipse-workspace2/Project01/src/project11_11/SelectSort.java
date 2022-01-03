package project11_11;
//ex17) 
public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {6,9,3,7,0,3,8,6};
		
		showData(ar);
		for (int i = 0; i < 8-1; i++) {
			int m = i;
			for (int j = i; j < 8; j++) {
				if(ar[m] > ar[j]) {
					m = j;
				}	
			}
				int t = ar[i];
				ar[i] = ar[m];
				ar[m] = t;
//			swap(ar, i, m);
		}
		showData(ar);
//		
//		for (int i=0; i<10000; i++) {
//			for (int j=0; j<3; j++) {
//			ar[j] = j;
//		}
//		}
//		for (int i = 0; i < 10000; i++) {
//			ar[i*3 + 0] = 1;
//			ar[i*3 + 1] = 1;
//			ar[i*3 + 0] = 1; //위 for문과 동일하다고 하면 위 처럼 for문으로 쓸 것이다. 
//			//2-3줄 정도의 코드 같은 경우 풀어서 쓰는 것이 좋다.
//			
//		}
	}
	
	
	static void swap(int[] ar, int a, int b) {
		int t = ar[a];
		ar[a] = ar[b];
		ar[b] = t;
	}
	static void showData(int[] ar) {
		for (int i : ar) {
			System.out.print(i + " ");
		}System.out.println();
	}
}


// SelectSort
//int[] ar = {6,9,3,7,0,3,8,6};
//showData(ar);
//for (int i = 0; i < ar.length-1; i++) {
//	int m = i ;
//}
//	for (int j = i+1; j < ar.length; j++) {
//		if(ar[m]>ar[j]) {
//			m=j;
//		}
//}
//	int t = ar[i];
//	ar[i] = ar[m];
//	ar[m] = t;
//}
//showData(ar);
//}
//
//}
//
//
//static void showData(int[] ar) {
//for (int i :ar ) {
//	System.out.print(i + " ");
//	
//}System.out.println();	
//}
////int a = 3, b = 4, t;
//}
