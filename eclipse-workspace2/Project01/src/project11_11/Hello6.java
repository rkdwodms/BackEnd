package project11_11;

import java.util.Iterator;

//ex19) insertion sort 

public class Hello6 {
	static void showData(int[] ar) {
		for(int i: ar) {
			System.out.print(i + " ");
		
		}System.out.println();
	}
	public static void main(String[] args) {
		
		int[] ar = {2, 3, 6, 7, 8, 4, 5, 6};
		showData(ar);
//		int temp = ar[5];
		
//		ar[5] = ar[4];
//		ar[4] = ar[3];
//		ar[3] = ar[2];
//		ar[2] = temp;
//		
//		for (int i = 0; i < 5-2; i++) { // �̵���Ű�� �ݺ�Ƚ��
//			ar[5-i] = ar[5-i-1];
//			
//		}
//		ar[2] = temp;
////		
//		showData(ar);
		
		for (int i = 1; i < ar.length; i++) {
			int aux = i-1;
			int temp = ar[i];
			
			while(aux >=0 && ar[aux] > temp) {
				ar[aux+1] = ar[aux];
				aux--; // ������ �ڸ� �̵��� �ϱ� ������ 
			}
			ar[aux+1] = temp;
			System.out.print("�߰�:");
			showData(ar);
		}
		System.out.println("----------------------------------");
		
		showData(ar);
	}
}
		
		
//		
//		for (int i = 1; i < ar.length; i++) {
//			
//			int target = ar[i];
//			int j = i-1;
//			
//			
//			while(j >= 0 && target < ar[j]) {
//				ar[j+1] = ar[j];
//				j--;
//			}
//			
//			ar[j+1] = target;
//			
//		}
//		
//		
//	}
//
//}
