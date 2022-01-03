package haxh;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		hashSetEx();
		hashSetCustomEx();	
		}
	private static void hashSetCustomEx() {
		HashSet<Student> hs = new HashSet<>();
		Student s1 = new Student(10, "길동이");
		Student s2 = new Student(20, "고길동이");
		Student s3 = new Student(30, "고길동이이");
		
		
	}
	private static void hashSetEx() {
		// 선언
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Java");
		
		//중복 허용하지 않고, 순서가 중요하지 않는다.
		System.out.println(hs);
		System.out.println("hs size=" + hs.size());
		

	}

}
