package project11_11;

public class Hello5 {
	
	for(int i=0; i<7; i++) {
		for(int k =0; j <7-i; j++) {
			boolean isExchange = False;
			if(ar[j] > ar[j+1]) {
				swqp(ar,j,j+1)
				isExchange = true;
			}
		}
		if(isExchange == false) {
			break;
		}
		System.out.println(i+":"); showData();
	}
	showData(ar);
	
}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i <5; i++) {
			for (int j = 0; j <5-i; j++) {
				System.out.printf("[%d %d]",j,j+1);
			}
		System.out.println();
		}	
	}
	
	int[] ar = {6,9,3,7,0,3,8,6};
	showData(ar)
	
	
	
	
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



//for (int i = 0; i < 5; i++) {
//	for (int j = 0 ; j < 5-i; j++) {
//		System.out.printf("[%d %d]", i, j+1);
//	}
//}System.out.println();