package geometry;

public class Test {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(20);
		Point p2 = new Point();
		System.out.println(p1.getX());
		System.out.println(p2.getX());
		
		//Vezbe 3
		p2.setX(21);
		p2.setY(30);
		p1.setY(22);
		
		System.out.println(p1.distance(p2));
		Line l1 = new Line();
		Line l2 = new Line();
		l1.setStartPoint(p2);
		l1.setEndPoint(p1);
		System.out.println(l1.length());
		
		Rectangle r1 = new Rectangle();
		r1.setUpperLeft(p1);
		r1.setHeight(20);
		r1.setWidth(20);
		System.out.println(r1.area());
		System.out.println(r1.circumference());
		
		l1.getEndPoint().setY((int)r1.getUpperLeft().distance(r1.getUpperLeft())+r1.area());
		System.out.println("Vrednost y koordinate krajnje tacke linije l1 je: " + l1.getEndPoint().getY());
	}

}
