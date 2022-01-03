package com.example.javac.basics;

public class StringEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		stringBasic();
		stringFormat();

	}
	
	private static void stringFormat() {
		// o개의 o중에서 o개를 먹었다. 
		String fruit = "사과";
		int total = 10;
		int eat = 3;
		
		System.out.println(total + "개의 " + fruit + "중에서 "+eat +"먹었다.");
		System.out.printf("%d 개의 %s 중에서 %d 개를 먹었다. %n" , total, fruit, eat);
		System.out.printf(total + "개의 " + fruit + "중에서 "+eat +"먹었다.");
		
	}
	
	private static  void stringBasic() {
		String str; //선언 -> 할당을 하지 않았으니 null 상태임
		str = "Java";
		String str2 = "Java";
		String str3 = new String("Java"); //새 객체
		
		System.out.println("str == str2? " + (str == str2));
		System.out.println("str == str3? " + (str == str3));
		
		//참조 타입의 경우 값의 비교를 위해서 equals 메소드를 이용해서 사용한다.
		
		System.out.println("str, str3 값이 같은가? " + (str.equals(str3)));
		
		//equals는 모든 경우에 가능하다.
		
		
	}

}
