package project11_15;

public class NodeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

}
}
