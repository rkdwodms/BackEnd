package collectionlist;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 선언
		Stack<Integer> stack = new Stack<>();
		
		// 입력
		for (int i =0; i<10; i++) {
			stack.push(i);
			System.out.println("PUSH" + stack);
			
		}
		
		//조회
		System.out.println("peek:" + stack.peek());
		System.out.println("Stack: " + stack);
		
		//인출
		System.out.println("pop: " + stack.pop());
		System.out.println("stack: "+ stack);
		
		
		// 순서대로 인출
		while(!stack.empty()) { //비어있지 않으면 인출
			System.out.println("pop" + stack.pop());
			System.out.println("stack" + stack);
		}
		

	}

}
