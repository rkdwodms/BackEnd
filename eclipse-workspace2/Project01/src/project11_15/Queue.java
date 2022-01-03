package project11_15;

import java.util.LinkedList;


// 업캐스팅

class A{}
class B extends A{}

//interface C{}
//class D implements C{}
// Ring Queue

//데이터 크기는 4
//front , rear의 위치가 끝일 때 맨앞으로 위치 시키다.
// 데이터를 모두 채운 상태에서는 더이상 데이터를 추가 할 수 없다. 
	//단, 원칙은 메모리를 더 늘리는게 원칙이다. 

//데이터가 없는 상태에서는 데이터를 삭제할 수 없다. 
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
			System.out.println(" 추가  불가 ");
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
			System.out.println("삭제불가");
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
//		// 부 = 자 
//		// TODO Auto-generated method stub
		
		MyQueue mq = new MyQueue();
		mq.show();
		mq.enque(10);
		mq.deque();
//
//		Queue<Integer> q = new LinkedList<>();
//		A tt = new C();
//		
//		A t1 = new A(); // 부 = 부
//		
//		// 부 = 자 (업 캐스팅)
//		A t2 = new B(); // 부 = 자
//		
//		B t3 = new A(); // 자 = 부 (다운 캐스팅)
//		B t4 = new B(); // 부 = 부       
		
		

	}

}
