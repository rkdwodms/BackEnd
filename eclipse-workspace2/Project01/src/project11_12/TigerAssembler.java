package project11_12;

//this 용법 1  변수를 구분하기 위함.
//2. 함수 체이닝.
class Tiger{
//	Tiger(){
		int x, y;
		
		Tiger(int x, int y){
//			x = a;
//			y = b;
			
			this.x = x; // 필드 = 인수;
			this.y = y;
			
			
		}
		void show() {
			System.out.println(x + " " + y);
			System.out.println(this.x + " " + this.y);
		}
		
		void m1(Tiger t) {
			
		}
		
		Tiger m2() {
			//return new Tiger(0,0); //어떤 식이든 타이거만 리턴시키면 된다는 것이다. 
			
			return this; // this가 무슨 타입이냐, 타이거 타입 -> 그래서
			// 문법이 성립하는 것이다. 
			
		}
		
		Tiger m3() {
			System.out.println(3);
			return this;
		}
		
		Tiger m4() {

			System.out.println(3);
			return this;
		}
//		
		
		Tiger m5() {

			System.out.println(3);
			return this;
		}
		
		Tiger m6() {
			System.out.println(6);
		}
}
//		
//		System.out.println(this.hashCode());
		
	//객체를 대신해서 이름 부르는 것이 this이다. 
	// 두개의 변수를 구분하기 위해서,, 
		
//		void m1() {
//			
//		}
//		void m2() {
//			this.m1();
//		}


public class TigerAssembler {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tiger t = new Tiger(10,20);
		t.m3(); //객체가 사라지기 일보직전이다. -> t.m3().m4(); 연속해서 함수 선언 가능
		t.m3()
		.m4()
		.m5()
		.m2(); // 함수 체이닝기법
		
		
		
//		t.show();
//		Tiger t100 = new Tiger(10,20);
//		t.m1(new Tiger(1,2));
//		
//		//t 나 this 나 ttt 나 전부 다 동일한 것을 나타낸다. 
//		System.out.println(t.hashCode());
//		Tiger ttt = t.m2();
//		System.out.println(ttt.hashCode());
		
		
//		//자기 대입 코드 : 아무 의미가 없는 데이터다. 
//		int num = 10;
//		num = num; 
//		Tiger t = new Tiger();
//		System.out.println(t.hashCode()); //객체의 고유번호를 나타내는 것
//
//		Tiger t1 = new Tiger();
//		System.out.println(t1.hashCode());
	}

}
