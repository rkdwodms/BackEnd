package shape.v1;

public class Circle extends Shape 
	implements Drawable {
	
	//필드 
	protected double radius;
	
	public Circle(int x, int y, double radius) {
		super(x,y);
		this.radius = radius;
	}
	

	@Override
	public void draw() {
		System.out.printf("x=%d , y=%d, r=%f, area = %f %n",
				x,y,radius,area());
		// TODO Auto-generated method stub

	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

}
