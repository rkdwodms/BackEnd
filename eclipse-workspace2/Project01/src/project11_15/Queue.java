package project11_15;

import java.util.LinkedList;


// ��ĳ����

class A{}
class B extends A{}

//interface C{}
//class D implements C{}
// Ring Queue

//������ ũ��� 4
//front , rear�� ��ġ�� ���� �� �Ǿ����� ��ġ ��Ű��.
// �����͸� ��� ä�� ���¿����� ���̻� �����͸� �߰� �� �� ����. 
	//��, ��Ģ�� �޸𸮸� �� �ø��°� ��Ģ�̴�. 

//�����Ͱ� ���� ���¿����� �����͸� ������ �� ����. 
class MyQueue{


	int front;
	int rear;
	int num;
	int[] data;

	MyQueue() {
		front = rear = num = 0;
		data = new int[4];
	}


	void enque(int x) {
		if( num == 4) {
			System.out.println(" �߰�  �Ұ� ");
			return;
		}
		data[rear++] = x;
		num++;
		
		if(rear == 4) {
			rear = 0;

		}
	}

	int deque() {
		if(num <=0) {
			System.out.println("�����Ұ�");
			return -1;
		}
		int x = data[front];
		data[front] = 0;
		front++;
		num--;

		if(front == 4) {
			front = 0;
		}
		return x;
	}
	
	void show() {
		for (int i = 0; i < front; i++) 
			System.out.println("   ");
		System.out.println('F');
			
		for (int i = 0; i < rear; i++) {
			System.out.println("   ");
		System.out.println('R');
			
		for (int i = 0; i < data.length; i++) {
			System.out.printf("%02d ", data[i]);
				
		}System.out.println();
		System.out.println("==================================");
		}
				
		}
	}

public class Queue {
	
	

	public static void main(String[] args) {
//		// �� = �� 
//		// TODO Auto-generated method stub
		
		MyQueue mq = new MyQueue();
		mq.show();
		mq.enque(10);
		mq.deque();
//
//		Queue<Integer> q = new LinkedList<>();
//		A tt = new C();
//		
//		A t1 = new A(); // �� = ��
//		
//		// �� = �� (�� ĳ����)
//		A t2 = new B(); // �� = ��
//		
//		B t3 = new A(); // �� = �� (�ٿ� ĳ����)
//		B t4 = new B(); // �� = ��       
		
		

	}

}
