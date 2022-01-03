package shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shape s = new Shape(10,20); // 추상 클래스는 인스턴스화(객체화) 할 수 없다.
		
		Rectangle r = new Rectangle(10,10,100,50);
		r.draw(); // 반드시 오버라이딩 해줘야한다. 
		
		Circle c = new Circle(20,20,30);
		c.draw();
		
		Point p = new Point(30,30);
		p.draw();
		
		
		Drawable[] objs = new Drawable[3];
		Drawable objs[] = {r, c, p};
		
		for (Drawble obj: obj) {
			
		}

}
