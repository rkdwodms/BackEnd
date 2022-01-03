package project11_11;
/*
public class Hello {
	public static void main(String[] args) {
		Random rn = new Random();
		int zeroMax = 0, oneMax = 0;
		int zeroCnt = 0, oneCnt = 0;
		
		for(int i=0; i<10;i++) {
			int r = rn.nextInt(2);	// O -> 0 , X -> 1 이라고 가정		
			System.out.print(r + " ");
			
			if(r == 0) { //짝수
				oneCnt = 0; // 홀수카운팅 리셋
				zeroCnt++;
				zeroMax = Math.max(zeroMax, zeroCnt);
			}else {
				zeroCnt = 0;
				oneCnt++;
				oneMax = Math.max(oneMax, oneCnt);
			}
		}
		System.out.println();
		System.out.printf("O: %d%nX: %d%n", zeroMax, oneMax);

	}
}

*/
public class Hello11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strOX = "XXOOXXXXXXOOOOOOOOOO";
		int size = strOX.length();
		
		
		char current = strOX.charAt(0);
		int Count = 0;
		
		for (int i = 0; i < size; i++) {
			if(current == strOX.charAt(i)) {
				Count++;
				
				
			}else {
				System.out.println(current); 
				System.out.println(Count);
				
//				current = strOX.charAt(i+1);
				
				if(i+1 > size) {
					current = strOX.charAt(i);
				}else {
					current = strOX.charAt(i + 1);
				}
				
				Count = 1;
				
			}
			
		}
			

	}

}
