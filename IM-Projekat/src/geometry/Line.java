package geometry;

public class Line extends Shape {
	private Point startPoint;
	private Point endPoint;
	
	
	//Length
	public double length() {
		return startPoint.distance(endPoint);
	}
	
	@Override
	public String toString() {
		return "(" + this.startPoint.getX() + ", " + this.startPoint.getY() + ")"
				+ " --> (" + this.endPoint.getX() + ", " + this.endPoint.getY() + ")";
 	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Line) {
			Line temp =  (Line) obj;
			if(this.startPoint.equals(temp.startPoint) && this.endPoint.equals(temp.endPoint)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean contains(int x, int y) {
		Point klik = new Point(x,y);
		return (this.startPoint.distance(klik) + this.endPoint.distance(klik) - length()) <= 2;
	}
	
	
	//Konstruktori
	
	public Line() {
		
	}
	
	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}
	
	//Get i Set metode
		public Point getStartPoint() {
			return startPoint;
		}
	
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	
	public Point getEndPoint() {
		return endPoint;
	}
	
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	
}
