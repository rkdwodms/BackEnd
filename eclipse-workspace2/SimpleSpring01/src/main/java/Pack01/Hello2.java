//package Pack01;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.support.GenericXmlApplicationContext;
//
//
//class Animal {
//	Animal() {
//		System.out.println("������ ��");
//		
//	}
//	public void f1() {
//		System.out.println("�Լ� ��");
//	}
//}
////
////class Apple{
////	public void apple
////	
////}
//
////�ʱ� ���� Ŭ������� ���� �������� �˸��� ���Ͽ�
//@Configuration
//class AppConfig{
//	
//	//��ü�� ������ �ȴ�.
//	//�������� ��ü ������ �ع�����.
//	
//	
////	Animal innerObject = new Animal();
//	
//	//�Լ� �̸��� id�� ����� ������. 
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
