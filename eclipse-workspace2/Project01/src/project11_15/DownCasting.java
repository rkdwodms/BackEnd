package project11_15;

class Animal{
	void cry() {
		System.out.println("�Ҹ� ����");
	}
}
class Cat extends Animal{
	void cry() {
		System.out.println("�߿�");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("�۸�");
	}
}
class Snake extends Animal{
	
}
class Tiger extends Animal{
	void cry() {
		System.out.println("����");
	}
	
}

class Zoo{
	
	//Animal ani = new Cat()
	//Animal ani = new Dog()
	// �� ĳ����
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
	//���Կ���(=)�� �����Ǿ� �ִ�. 
	//a = 10 . s = "ȣ����"
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
////		��������� �̷��� �� �� ������
////		������ �����غ��ϱ� 
////		��ĳ���� �ص� ���� ���� �ڵ带 ��ĳ���� �ϰ� �ֳ�?
//		
//		Cat t4 = new Cat();
//		Dog t5 = new Dog();
//		Snake t6 = new Snake();
//		t4.cry();
//		t5.cry();
//		t6.cry();
		
		//���� ����� ������ ���Ҷ�� ��ĳ������ �ϴ°�?

	}

}





/*
 void insert(int index, int num) {
		if(index > size) {
			System.out.println("���� ������ �߸��Ǿ����ϴ�.");
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
		
		Node node = head; //newNode�� ����
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
