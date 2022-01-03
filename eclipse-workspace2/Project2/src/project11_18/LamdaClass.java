package project11_18;


interface Test01 {
	void m1();
}

interface Test02{
	int m2();
}

class Tiger{
	void m3(Test01 t) {
		t.m1();
		
		
	}
	void m4(Test02 t) {
		System.out.println(t.m2());
//		t.m2();
		
	}
	
	Test01 m5() {
		return ()->{
			System.out.println(999);
		};
	}
	
}

public class LamdaClass {

	public static void main(String[] args) {
		
		Test01 t = ()-> {
			System.out.println(1);
		};
		t.m1();
		
		Tiger tiger = new Tiger();
		tiger.m3(()->{
			System.out.println(2);
		});
		
		tiger.m4(()->{
//			System.out.println(3);
			return 200;
		});
		
		tiger.m4(()-> 300 );
//			System.out.println(3);
		
		tiger.m5();
		
		Test01 t2 = tiger.m5();
		t2.m1();
		
		tiger.m5().m1();
		
		
		
		// TODO Auto-generated method stub
//		Test01 t1 = new Test01() {
//			@Override
//			public void m1() {
//				// TODO Auto-generated method stub
//				System.out.println(1);
//			}
//		};
//		t1.m1();
//		
//		// ->  => 
//		Test01 t2 = ()->{
//			System.out.println(2);
//		};
//		t2.m1();
		
//		ex3)
	}
}
