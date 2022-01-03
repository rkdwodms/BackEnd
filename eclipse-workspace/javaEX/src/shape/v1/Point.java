package shape.v1;

public class Point implements Drawable{
	//필기
	private int x;
	private int y;
	
	// 생성자 
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.printf("x = %d, y = %d를 그렸습니다. %n",x,y);
		
		
	}
	
	

}
