package project11_12;

//this ��� 1  ������ �����ϱ� ����.
//2. �Լ� ü�̴�.
class Tiger{
//	Tiger(){
		int x, y;
		
		Tiger(int x, int y){
//			x = a;
//			y = b;
			
			this.x = x; // �ʵ� = �μ�;
			this.y = y;
			
			
		}
		void show() {
			System.out.println(x + " " + y);
			System.out.println(this.x + " " + this.y);
		}
		
		void m1(Tiger t) {
			
		}
		
		Tiger m2() {
			//return new Tiger(0,0); //� ���̵� Ÿ�̰Ÿ� ���Ͻ�Ű�� �ȴٴ� ���̴�. 
			
			return this; // this�� ���� Ÿ���̳�, Ÿ�̰� Ÿ�� -> �׷���
			// ������ �����ϴ� ���̴�. 
			
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
		
	//��ü�� ����ؼ� �̸� �θ��� ���� this�̴�. 
	// �ΰ��� ������ �����ϱ� ���ؼ�,, 
		
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
		t.m3(); //��ü�� ������� �Ϻ������̴�. -> t.m3().m4(); �����ؼ� �Լ� ���� ����
		t.m3()
		.m4()
		.m5()
		.m2(); // �Լ� ü�̴ױ��
		
		
		
//		t.show();
//		Tiger t100 = new Tiger(10,20);
//		t.m1(new Tiger(1,2));
//		
//		//t �� this �� ttt �� ���� �� ������ ���� ��Ÿ����. 
//		System.out.println(t.hashCode());
//		Tiger ttt = t.m2();
//		System.out.println(ttt.hashCode());
		
		
//		//�ڱ� ���� �ڵ� : �ƹ� �ǹ̰� ���� �����ʹ�. 
//		int num = 10;
//		num = num; 
//		Tiger t = new Tiger();
//		System.out.println(t.hashCode()); //��ü�� ������ȣ�� ��Ÿ���� ��
//
//		Tiger t1 = new Tiger();
//		System.out.println(t1.hashCode());
	}

}
