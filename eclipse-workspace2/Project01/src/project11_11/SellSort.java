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
	
	//���� ������ ������Ų �˰��� 

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
//	        for(int h = N / 2; h > 0; h /= 2) {           //����
//	            for(int i = h; i < N; i++) {            //���� ������ �ϱ� ���� �κ� �迭�� �� ��° ���� ������ ���� ���Ѵ�.
//	                int j;
//	                int temp = arr[i];                    //ex ������ 4�̸� ó�� arr[i]�� 7�̴�. 7 ~ 5���� ���� ���� ����
//	                
//	                for(j = i - h; j >= 0 && arr[j] > temp; j -= h) {  //�κ� �迭���� �����ϵ��� j = i - h 
//	                    arr[j + h] = arr[j];                           //���� ������ ���� ��ĭ �� �̷��ش�.
//	                }
//	                arr[j + h] = temp;                                   //���ǹ��� �������� j�� �̹� j-h������ �������Ƿ� �ٽ� +h�� ���ش�.
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
//					aux -= 4; // ������ �ڸ� �̵��� �ϱ� ������ 
//				}
//				ar[aux+4] = temp;
//				System.out.print("�߰�: ");
//				showData(ar);
//				range--;
//						
//			}
//		}
//			
//			
//			
//		}
		
	
		
