package project11_15;

import java.util.Stack;

class MyStack{
	Integer[] ar;
	int index = 0;
	MyStack(){
		this.ar = new Integer[64];
		
	}
	int push(Integer num) {
		return ar[index++] = num;
//		index++;
	}
	int pop() {
		if(index <= 0) {
			return -1;
		}
		
		return ar[--index];
		
	}
	int peek() {
		if(index <= 0) {
			return -1;
		}
		return ar[index-1];
	}
	void dump() {
		for (int i = 0; i < index; i++) {
			System.out.print(ar[i] + " ");			
		}System.out.println();
	}
}

public class stack {

	public static void main(String[] args) {
		
		MyStack ms = new MyStack();
		System.out.println(ms.push(10));
		System.out.println(ms.push(20));
		System.out.println(ms.push(30));
		ms.dump();
		System.out.println(ms.pop());
		ms.dump();
		System.out.println(ms.peek());
		ms.dump();
//		System.out.println(ms.pop());
//		System.out.println(ms.pop());
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		/*
//		ex) 스택을 사용하는 방법 
		
		//스택 사용하기 위함. / 꺽쇠 열고닫고 = 컨테이너
		Stack<Integer> st = new Stack<>(); 
		// Integer push(Integer item) = 인수전달 / 함수 프로토타입
		// push와 출력을 같이 한다. 
		System.out.println(st.push(10));
		System.out.println(st.push(20));
		System.out.println(st.push(30));
		//데이터 관리적인 측면만 생각한다. 
		
		System.out.println(st.size());
		System.out.println(st.pop()); // st.pop(); // 30 pop 가장 최근에 들어간 놈이 가장 빨리 나온다. 
		System.out.println(st.size());
		
		System.out.println("--------------------------");
		System.out.println(st.peek());
		System.out.println(st.size());
		
		
		System.out.println(st.push(100));
		System.out.println(st.push(200));
		System.out.println(st);
		
		for (Integer value : st) {
			System.out.println(value);
		}
		System.out.println(st.contains(100));
		System.out.println(st.contains(140));
		System.out.println(st.empty());
		st.clear();
		System.out.println(st.empty());
		

//		st.push(10);
//		st.push(20);
//		st.push(30);
 * 
 * */


	}

}
