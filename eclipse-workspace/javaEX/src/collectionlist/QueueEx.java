package collectionlist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		
		//데이터 제공
		for (int i=0; i <0; i++) {
			queue.offer(i);
			System.out.println("OFFER: " + queue);
		}
		
		System.out.println("PEEK: " + queue.peek());
		System.out.println("QUEUE: " + queue);

		
		
	}

}
