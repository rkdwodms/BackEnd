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

//클래스 스케일이 큰 경우
//너는 절대로 객체 1개 이상 못 만든다. => 싱글톤 패턴 
class Tiger{
	static Tiger t = null; //멤버 객체로 만들어 버린다. 
	private Tiger(){ //메인에 객체 생성이 안된다. 
		
	}
	
	static Tiger getInstance() {
		//객체 생성시켜주는 함수 
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
	
	@Autowired //자동으로 연결시키겠다.  
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
	@Bean // 객체를 생성시켜주는 함수이다. 
	Apple apple() {
		return new Apple();
	}
	@Bean // 객체를 생성시켜주는 함수이다. 
	Orange orange() {
		return new Orange();
	}
	@Bean // 객체를 생성시켜주는 함수이다. 
	Banana banana() {
		return new Banana();
	}
}

// Configuration ~ 여기까지 블라인드 코드라면 



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
	//멤버변수 위에 Autowired를 걸었다. 
	//생성자를 만들어 버린다. (아래 코드를 만든다)
//	Banana(Apple apple) {
//		this.apple = apple;
//	}
//	
	// 어딘가에 apple 객체는 생성이 되어 있어야 한다. 
	@Autowired //자동으로 연결시키겠다.  
	Apple apple;
	
//	
//	//이 코드를 만든다. 아래 banana코드
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
	@Bean // 객체를 생성시켜주는 함수이다. 
	Apple apple() {
		return new Apple();
	}
	@Bean // 객체를 생성시켜주는 함수이다. 
	Banana banana() {
		//return new Banana(new Apple());
//		return new Banana(apple());
		
//		Banana banana = new Banana(apple());
//		return banana;
		// 위 아래 동일 코드 
		return new Banana();
	}
}

// Configuration ~ 여기까지 블라인드 코드라면 



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
		System.out.println("Banana 생성자 콜");
	}
	void f2() {
		apple.f1();
	}
}

@Configuration
class AppConfig {
	@Bean // 객체를 생성시켜주는 함수이다. 
	Apple apple() {
		return new Apple();
	}
	@Bean // 객체를 생성시켜주는 함수이다. 
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
		System.out.println("생성자 콜");
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
	@Bean // 객체를 생성시켜주는 함수이다. 
	Apple apple() {
		return new Apple("호랑이", 1000);
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
		System.out.println("생성자 콜");
	}
	void f1() {
		System.out.println("f1 call");
	}
}


@Configuration
class AppConfig {
	@Bean // 객체를 생성시켜주는 함수이다. 
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