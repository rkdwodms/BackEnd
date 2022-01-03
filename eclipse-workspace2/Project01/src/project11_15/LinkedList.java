package project11_15;

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

void deleteFirst() {
	
	Node tmp = head;
	head = head.next;
	Object data = tmp.data;
	tmp = null;
	
	size--;
	return data;
	
}
void deleteLast() {
	Node tmp = tail;
	tail = Node(size-2);
	tail.next = null;
	Object data = tmp.data;
	tmp = null;
	size--;
	return data;
	
}
void remove(int index) {
	if(index == 0) {
		return deleteFirst();
	}
	
	Node tmp = node(index-1);
	Node deleteNode = tmp.right;
	tmp.right = tmp.right.right;
	
	Object data = deleteNode.data;
	if(deleteNode == tail) {
		tail = tmp;
	}
	
	deleteNode = null;
	size--;
	
	return data;
	
	
	
}
	
}

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}

}
