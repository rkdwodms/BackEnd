package expection;
import java.util.Scanner;

public class ExceptionEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arithExceptionEX();

	}
	
	//ArithmeticException
	private static void arithExceptionEX() {
		//스캐너에서 정수를 입력 
		// 100을 입력 받은 정수로 나눈다.
		
		double result = 0;
		int num = 0;
		
		Scanner = scanner = new Scanner(system.in);
		
		System.out.print("정수 입력하세요:");
		
		num = scanner.nextInt();
		result =100/num;
		
		System.out.println("결과 : " + result);
		scanner.close();
	}

}
