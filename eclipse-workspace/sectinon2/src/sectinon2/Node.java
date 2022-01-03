package sectinon2;

public class Node {
	
	//외부에서 함부러 바꿀 수 없게  private
	private int x;
	private int y;
	
	//게임 세계에서 나타나는 좌표를 나타내는 값이다. 
	
	//함수를 통해 변수에 접근할 수 있도록 만든다. (객체지향의 기본적인 보안)
	public int getX() {
		return x;
		
		
	}
	public void setX(int x) {
		
		this.x = x;
		//this의 의미 : 자신이 가지고 있는 변수(private int x)를 
		//들어오는 X(int x)의 값으로 설정해주겟다. 
		
	}
	
	public int getY() {
		return y;
		
		
	}
	public void setY(int y) {
		
		this.y = y;
		//this의 의미 : 자신이 가지고 있는 변수(private int x)를 
		//들어오는 X(int x)의 값으로 설정해주겟다. 
		
	}
	
	//생성자 : 인스턴스(객체)를 만들어줄 때 자동으로 값을 초기화해주는 하나의 함수
	//클래스랑 이름이 동일
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Node getCenter(Node other) {
		return new Node((this.x + other.getX())/2 , (this.y + other.getY())/2);
		
	}

}
