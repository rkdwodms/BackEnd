package project11_11;

public class SellSort {
	static void showData(int[] ar) {
		for (int i : ar) {
			System.out.print(i + " ");
		}System.out.println();
	}
	static void showData1(int[] ar) {
		for(int i=0, k=0; i<5; i++) {
			System.out.printf("%2d", ar[k]);
		}System.out.println();
	}
	
	//삽입 정렬을 개선시킨 알고리즘 

	public static void main(String[] args) {
		
		int[] ar = { 
				3, 66, 30, 96,   // 0
				48, 58, 01, 8,    // 4
				27, 84, 66, 13,   // 8
				30, 13, 61, 79,   // 12
				1, 16, 04, 38 }; // 16
		
		
		for(int k = 0 ; k < 3 ; k++) {
			int way = (int) Math.pow(2, 2 - k);
			int wayLength = ar.length/way;
			
			System.out.printf("%d Way InsertionSort\n", way);
			showData(ar);
			
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
			showData(ar);
			System.out.println();
			
		}
	}

}
//		
//		int[] arr = { 
//				3, 66, 30, 96,   // 0
//				48, 58, 01, 8,    // 4
//				27, 84, 66, 13,   // 8
//				30, 13, 61, 79,   // 12
//				1, 16, 04, 38 }; // 16
//		
//	       
//	        int N = arr.length;
//	        
//	        for(int h = N / 2; h > 0; h /= 2) {           //간격
//	            for(int i = h; i < N; i++) {            //삽입 정렬을 하기 위해 부분 배열의 두 번째 값을 가지고 값을 비교한다.
//	                int j;
//	                int temp = arr[i];                    //ex 간격이 4이면 처음 arr[i]는 7이다. 7 ~ 5까지 삽입 정렬 시작
//	                
//	                for(j = i - h; j >= 0 && arr[j] > temp; j -= h) {  //부분 배열끼리 연산하도록 j = i - h 
//	                    arr[j + h] = arr[j];                           //삽입 정렬을 위해 한칸 씩 미뤄준다.
//	                }
//	                arr[j + h] = temp;                                   //조건문을 빠져나온 j는 이미 j-h연산이 끝났으므로 다시 +h를 해준다.
//	            }
//	        }
//	        
//	        for(int a : arr) {
//	            System.out.print(a +" ");
//	        }
//	    }
//

		
//		int[] ar = { 
//				3, 66, 30, 96,   // 0
//				48, 58, 01, 8,    // 4
//				27, 84, 66, 13,   // 8
//				30, 13, 61, 79,   // 12
//				1, 16, 04, 38 }; // 16
//		int range = ar.length;
//		
//		for (int k = 0; k < 4; k++) {
//			for (int i = k+4; i < ar.length; i += 4) {
//				int aux = i-4;
//				int temp = ar[i];
//				
//				while(aux >=0 && ar[aux] > temp) {
//					ar[aux+4] = ar[aux];
//					aux -= 4; // 앞으로 자리 이동을 하기 때문에 
//				}
//				ar[aux+4] = temp;
//				System.out.print("중간: ");
//				showData(ar);
//				range--;
//						
//			}
//		}
//			
//			
//			
//		}
		
	
		
