
package shape.v1;

public class Rectangle extends Shape 
	implements Drawable {
	//rectangle error : 1.생성자 문제 2. 추상메서드 문제
	
	//너비와 높이를 담을 수 있는 필드를 구현한다.
	
	protected int width;
	protected int height;
	
	//생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x,y); //부모 생성자 명시적으로 
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		//추상메서드를 반드시 오버라이드해야한다. 
		
		System.out.printf("사각형 x = %d , y= %d, w=%d, h=%d, area=%f %n",
				x,y,width,height,area());
		
		
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		
		return width * height;
	}

}
