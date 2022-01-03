//package Pack01;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.support.GenericXmlApplicationContext;
//
//
//class Animal {
//	Animal() {
//		System.out.println("생성자 콜");
//		
//	}
//	public void f1() {
//		System.out.println("함수 콜");
//	}
//}
////
////class Apple{
////	public void apple
////	
////}
//
////초기 설정 클래스라는 것을 스프링에 알리기 위하여
//@Configuration
//class AppConfig{
//	
//	//객체가 생성이 된다.
//	//스프링이 객체 생성을 해버린다.
//	
//	
////	Animal innerObject = new Animal();
//	
//	//함수 이름을 id로 사용해 버린다. 
//	@Bean
//	public Animal animal() {
//		return new Animal();
//	}
//	
////	public Apple apple() {
////		return new Apple();
////	}
//}
//
//public class Hello2 {
//
//	public static void main(String[] args) {
////		GenericXmlApplicationContext ctx = 
////				new GenericXmlApplicationContext(
////						"classpath:Context.xml");
////		
////		
////		Animal animal = ctx.getBean("animal",Animal.class);
////		animal.f1();
////		
////		ctx.close();
//		
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
//				AppConfig.class);
//		
//		Animal t = ctx.getBean("animal", Animal.class);
//		t.f1();
//		
//		Apple t1 = ctx.getBean("apple", Apple.class);
//		t.f1();
//		ctx.close();
//		
//		
//
//	}
//
//}
