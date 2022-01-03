package com.example.javac.basics;

public class EnumEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season today = Season.AUTUMN;
		
		System.out.printf("Today is %s(%d)%n", 
				today.name(), // 열거 상수 이름
				today.ordinal()); //열거 상수의 순번
		
		
		//문자열을 전달
		Season obj = Season.valueOf("WINTER");
		System.out.printf("Today is %s(%d)%n", 
				obj.name(), // 열거 상수 이름
				obj.ordinal()); //열거 상수의 순번

	}

}
