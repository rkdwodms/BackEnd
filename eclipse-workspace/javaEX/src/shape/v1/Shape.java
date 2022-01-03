package shape.v1;

//추상 클래스 : 실체화 될 수 없고, 자식클래스에 상속하기 위한 존재
public abstract class Shape { 
	protected int x;
	protected int y;
	
	//생성자 
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//추상 메서드 :  상속받은 자식클래스에서 반드시 구현 해줘야 한다. 
//	public abstract void draw();
	public abstract double area(); // 면적 구하기 메서드
	
	

}
