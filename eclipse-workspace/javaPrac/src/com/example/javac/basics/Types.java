package com.example.javac.basics;
import java.util.Scanner;
import java.util.ArrayList;

public class Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		intEx();
//		floatEX();
//		promotionEX();
//		castingEX();
		stringEX();
	}
	
	private static void stringEX() {
		String strr = "ABCDEFGH";
		ArrayList arraylist = new ArrayList();
		arraylist.add(strr);
		System.out.println(arraylist.get(1));
		

		
	}
	private static void castingEX() {
		//표현 범위가 넓은 자료 -> 좁은 자료형
		//자료의 유실이 일어날 수 있음 -> 강제로 타입을 변환해줘야 함.
		
		float f = 12345677890.123456789f;
		System.out.println(f); //4바이트의 실수형
		
		long l = (long)f; //4바이트 실수형 -> 8 바이트 정수형
		System.out.println(l);
		
		int i = (int)l;
		System.out.println(i);
		System.out.println(Integer.toBinaryString(i));
		
		
	}
		//표현 범위 좁은 자료 -> 넓은 자료
		// 자바가 임의로 변환
	private static void promotionEX() {
		
		byte b = 25;
		System.out.println(b);
		
		short s = b; //1 바이트에서 2바이트로 할당
		
		System.out.println(s);
		
		int i = s;
		
		System.out.println(i);
		
		long l = i;
		System.out.println(l);
		
		float f = l; //8바이트 정수형 -> 4바이트 실수형
		
		//표현 범위가 크다.
		
		System.out.println(f);
		
	}
	private static void floatEX() {
		// 실수형
		//float(4) < double(8)
		
		float floatVar = 3.12159F;
		double doubleVar = 3.14159;
		
		int intVar = 30000000;
		floatVar = 3E6f; // 3*10 ^ 6
		doubleVar = 3e6;
		
		//부동소수점 계산의 유의점
		//float double 정밀도 표기, 표현 범위를 넓인 자료형
		// -> 정밀한 실수 계산을 위해 다른 방식을 사용
		
		System.out.println(0.1 * 3);
	}
	private static void intEx() {
		// 정수 타입 
		// byte(1) < short(2) < int(4) < long(8)
		
		int intVar; //선언 stack에 메모리 생성 
		intVar = 2021; // 초기화
		
		System.out.println(intVar);
//		intVar = 1234567890123; // 범위 초과
		
		long longVar;
		longVar = 2021;
		longVar = 12345667781234L; //L or l
		
		int bin, oct, hex;
		bin = 0b1100; //2진수 
		oct = 072; //8진수
		hex = 0xFF; // 16진수
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		int age = scanner.nextInt();
		System.out.print("전화번호를 입력하세요 : ");
		int agee = scanner.nextInt();
		System.out.println("전화번호는 " + agee);
		
	}
}