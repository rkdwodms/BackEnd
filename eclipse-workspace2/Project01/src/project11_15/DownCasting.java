package project11_15;

class Animal{
	void cry() {
		System.out.println("소리 못냄");
	}
}
class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}
class Snake extends Animal{
	
}
class Tiger extends Animal{
	void cry() {
		System.out.println("어흥");
	}
	
}

class Zoo{
	
	//Animal ani = new Cat()
	//Animal ani = new Dog()
	// 업 캐스팅
	//void sound(Animal ani){
	// 	 	ani.cry();
//			}
	void sound(Cat cat) {
		cat.cry();
	}
	void sound(Dog dog) {
		dog.cry();
	}
	void sound(Tiger tiger) {
		tiger.cry();
	}
	//대입연산(=)이 생략되어 있다. 
	//a = 10 . s = "호랑이"
	void m1(int a, String s) {
		
	}
//	   
}
public class DownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Zoo zoo = new Zoo();
		zoo.sound(new Cat());		
		zoo.sound(new Dog());
		zoo.sound(new Tiger());
		
//		Animal t1 = new Cat();
//		Animal t2 = new Dog();
//		Animal t3 = new Snake();
//		
//		t1.cry();
//		t2.cry();
//		t3.cry();
//		
////		결과적으로 이렇게 된 거 같은데
////		가만히 생각해보니까 
////		업캐스팅 해도 되지 않을 코드를 업캐스팅 하고 있네?
//		
//		Cat t4 = new Cat();
//		Dog t5 = new Dog();
//		Snake t6 = new Snake();
//		t4.cry();
//		t5.cry();
//		t6.cry();
		
		//위와 결과가 같은데 뭐할라고 업캐스팅을 하는가?

	}

}





/*
 void insert(int index, int num) {
		if(index > size) {
			System.out.println("범위 지정이 잘못되었습니다.");
			return;
		}
		if( index == 0) {
			addFirst(num);
			return;
		}
		if(index == size) {
			addLast(num);
			return;
		}
		
		Node node = head; //newNode의 왼쪽
		for (int i = 0; i < index; i++) {
			node = node.right;
		}
		
		
		Node newNode = new Node();
		newNode.data = num;
		
		newNode.left = node;
		newNode.right = node.right;
		
		node.right = newNode;
		newNode.right.left = newNode;
		
		size++;
		
		
	}
*/
