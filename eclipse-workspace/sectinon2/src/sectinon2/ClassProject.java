package sectinon2;

public class ClassProject {

	public static void main(String[] args) {
/*
		차가 있는데 차가 가지는 속성들이 있을텐데 
		댜앙한 성격들이 들어갈 수 있을 것인데 
		성질들을 묶어서 클래스라고 하는 것이다. 
		실제로 프로젝트에서 사용할 때 new를 사용하여 객체를 만들어 변수로
		쓸 수 있다. 
		
		어떠한 데이터를 변수로 만들어 사용할 수 있는 것을 인스턴스라고 한다.(인스턴스화)
		객체라는 것은 실세계의 사물이다. 
		
		
*/
		
		Node one = new Node(10,20);
		Node two = new Node(30,40);
		
		Node result = one.getCenter(two);
		
		System.out.println("x : " + result.getX() + ", y" + result.getY());
		
		
	}

}
