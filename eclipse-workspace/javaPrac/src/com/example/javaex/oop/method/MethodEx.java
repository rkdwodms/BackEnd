package com.example.javaex.oop.method;

public class MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMessage();
		double result = getSum(10,20);
		System.out.println(result);
		printDivide(10,2);
		printDivide(10,0);
		
		System.out.println(getSum(new double[] {
				1,2,3,4,5,6,7,8,9
		}));
		
		System.out.println(getSumVar(1,2,3,4,5,6,7,7,8,9));

	}
	
	private static double getSumVar(double ...values) {
//		//정해지지않는 갯수의 인자값이 들어오게 된다. 
//		double total =0;
//		
//		for (double value:values) {
//			total += value;
//		}
//		
//		return total;
		
		return getSum(values);
	}
	private static double getSum(double[] values) {
		double total = 0;
		
		for (double value:values) {
			total += value;
		}
		
		return total;
	}
	
	//매개변수 X and 리턴 X
	private static void printMessage() {
		System.out.println("hello method");
	}
	//매개변수 O and 리턴 O
	private static double getSum(double num1, double num2 ) {
		return num1 + num2;
		
	}
	
	//parameter O and return X
	private static void printDivide(int num1, int num2) {
		if (num2 == 0) {
			return; // 코드 실행 중단
			
		}
		System.out.println(num1 / num2);
	}

}
