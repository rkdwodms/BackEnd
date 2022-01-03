package Pack01;

import javax.swing.SwingContainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;



class Apple{
	Apple() {}
	void f1() {System.out.println(1);}
}

@Configuration
class AppConfig {
	@Bean
	@Scope("prototype")
	Apple apple() {
		return new Apple();
	}
}

public class Hello3{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Apple a1 = ctx.getBean("apple",Apple.class);
		Apple a2 = ctx.getBean("apple",Apple.class);
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		ctx.close();
	}
}



/*

//Ŭ���� �������� ū ���
//�ʴ� ����� ��ü 1�� �̻� �� �����. => �̱��� ���� 
class Tiger{
	static Tiger t = null; //��� ��ü�� ����� ������. 
	private Tiger(){ //���ο� ��ü ������ �ȵȴ�. 
		
	}
	
	static Tiger getInstance() {
		//��ü ���������ִ� �Լ� 
		if(t == null) {
			t = new Tiger();
		}
		return t;
	}
	
}

public class Hello3 {
	public static void main(String[] args) {
//		Tiger t1 = new Tiger();
		Tiger t1 = Tiger.getInstance();
		System.out.println(t1.hashCode());
		Tiger t2 = Tiger.getInstance();
		System.out.println(t2.hashCode());
		
//		Tiger.getInstance();
		
		
	}
}


/*


class Apple{
	Apple() {}
	void f1() {System.out.println(1);
	}
}

class Orange{
	Orange() {}
	void f3() {System.out.println(3);}
	}

class Banana{
	
	@Autowired //�ڵ����� �����Ű�ڴ�.  
	@Qualifier("apple1")
	Apple apple;
	@Autowired
	Orange orange;
//	Banana(Apple apple, Banana banana){
//		this.apple = apple;
//		this.orange = orange;
//	}
	
	

	void f2() {
		apple.f1();
		orange.f3();
		System.out.println(2);
		
	}
}

@Configuration
class AppConfig {
	@Bean // ��ü�� ���������ִ� �Լ��̴�. 
	Apple apple() {
		return new Apple();
	}
	@Bean // ��ü�� ���������ִ� �Լ��̴�. 
	Orange orange() {
		return new Orange();
	}
	@Bean // ��ü�� ���������ִ� �Լ��̴�. 
	Banana banana() {
		return new Banana();
	}
}

// Configuration ~ ������� ����ε� �ڵ��� 



public class Hello3 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);


		//		Apple apple = ctx.getBean("apple", Apple.class);
		Banana banana = ctx.getBean("banana",Banana.class);
		banana.f2();
		

		//		apple.show();
		//		System.out.println(apple);
		ctx.close();

	}

}




/*
class Apple{
	Apple() {}
	void f1() {System.out.println(1);
	}
}

class Banana{
	//������� ���� Autowired�� �ɾ���. 
	//�����ڸ� ����� ������. (�Ʒ� �ڵ带 �����)
//	Banana(Apple apple) {
//		this.apple = apple;
//	}
//	
	// ��򰡿� apple ��ü�� ������ �Ǿ� �־�� �Ѵ�. 
	@Autowired //�ڵ����� �����Ű�ڴ�.  
	Apple apple;
	
//	
//	//�� �ڵ带 �����. �Ʒ� banana�ڵ�
//
//	Banana(Apple apple){
//		this.apple = apple;
//	}
//	
	
	
	
	void f2() {
		apple.f1();
		System.out.println(2);
	}
}

@Configuration
class AppConfig {
	@Bean // ��ü�� ���������ִ� �Լ��̴�. 
	Apple apple() {
		return new Apple();
	}
	@Bean // ��ü�� ���������ִ� �Լ��̴�. 
	Banana banana() {
		//return new Banana(new Apple());
//		return new Banana(apple());
		
//		Banana banana = new Banana(apple());
//		return banana;
		// �� �Ʒ� ���� �ڵ� 
		return new Banana();
	}
}

// Configuration ~ ������� ����ε� �ڵ��� 



public class Hello3 {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);


		//		Apple apple = ctx.getBean("apple", Apple.class);
		Banana banana = ctx.getBean("banana",Banana.class);
		banana.f2();

		//		apple.show();
		//		System.out.println(apple);
		ctx.close();

	}

}






/*
//ex 03

class Apple{
	Apple() {}
	void f1() {System.out.println(1);
	}
}

class Banana{
	Apple apple;
	void setApple(Apple apple) {
		this.apple = apple;
	}
	Banana(Apple apple){
		this.apple = apple;
		System.out.println("Banana ������ ��");
	}
	void f2() {
		apple.f1();
	}
}

@Configuration
class AppConfig {
	@Bean // ��ü�� ���������ִ� �Լ��̴�. 
	Apple apple() {
		return new Apple();
	}
	@Bean // ��ü�� ���������ִ� �Լ��̴�. 
	Banana banana() {
		//return new Banana(new Apple());
//		return new Banana(apple());
		
		Banana banana = new Banana();
		banana.setApple(apple());
		return banana;
	}
}

public class Hello3 {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfig.class);


		//		Apple apple = ctx.getBean("apple", Apple.class);
		Banana banana = ctx.getBean("banana",Banana.class);
		banana.f2();

		//		apple.show();
		//		System.out.println(apple);
		ctx.close();

	}

}




/*
class Apple{
	String name;
	int age;

	Apple(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("������ ��");
	}
	void show() {
		System.out.println(name + "" + age);
	}
	@Override
	public String toString() {
		return "Apple [name=" + name + ", age=" + age + "]";
	}
}


@Configuration
class AppConfig {
	@Bean // ��ü�� ���������ִ� �Լ��̴�. 
	Apple apple() {
		return new Apple("ȣ����", 1000);
	}

}

public class Hello3 {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfig.class);


		Apple apple = ctx.getBean("apple", Apple.class);
//		apple.show();
		System.out.println(apple);
		ctx.close();

	}

}






/* ex 1)
class Apple{
	Apple() {
		System.out.println("������ ��");
	}
	void f1() {
		System.out.println("f1 call");
	}
}


@Configuration
class AppConfig {
	@Bean // ��ü�� ���������ִ� �Լ��̴�. 
	Apple apple() {
		return new Apple();
	}

//	@Bean
//	Apple appleNum() {
//		return new Apple();
//	}
//	

}

public class Hello3 {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfig.class);


		Apple apple = ctx.getBean("appleNum", Apple.class);
		apple.f1();
		ctx.close();

	}

}

 */