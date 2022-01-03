package project11_15;

import java.util.Random;

public class quickReal {
	
	static void show(int[] ar ) {
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%2d ", i);
			
		}System.out.println();
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%02d ", ar[i]);
			
		}System.out.println();
		System.out.println("-----------------------------");
		
	}
	
	static void quick_sort(int[] ar, int left, int right) {
		int pivot = ar[(left + right) / 2];
		int i =left;
		int j = right;
		int temp;
		
		while(i <= j) {
		
			while(ar[i] < pivot) i++;
			while(ar[j] > pivot) j--;
			
			if(i <= j) {
				temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
				
				i++;
				j--;
			}
//			System.out.println(i + " " + j);
//			show(ar);	

		}
		if(left < j) {
			quick_sort(ar, left, j);
			
		if(i < right ) {
			quick_sort(ar, i, right);
		}
		}
		}
	
		public static void main(String[] args) {
				
			int[] ar= { 20, 9, 41, 64, 24, 40, 9, 4, 35};
			for (int i = 0; i < ar.length; i++) {
				ar[i] = new Random().nextInt(100);
			}
			show(ar);
			quick_sort(ar, 0, ar.length-1);
			show(ar);
			
}
}