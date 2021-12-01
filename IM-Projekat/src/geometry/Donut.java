package geometry;
public class Donut extends Circle {

	private int innerRadius;
	private boolean selected;
	
	public Donut() {
		
	}
	
	public Donut(Point center, int radius, int innerRadius) {
		super(center, radius);
		this.innerRadius = innerRadius;
	}
	
	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		this(center, radius, innerRadius);
		this.selected = selected;
	}
	
	@Override
	public double area() {
		double outerCircle = super.area();
		double innerCircle = this.innerRadius * this.innerRadius * Math.PI;
		return outerCircle - innerCircle;
	}
	
	public boolean contains(int x, int y) {
		double dFromCenter = getCenter().distance(new Point(x,y));
		return dFromCenter >= this.innerRadius && dFromCenter <= getRadius();
	}
	
	public boolean contains(Point p) {
		double dFromCenter = getCenter().distance(p);
		return dFromCenter >= this.innerRadius && dFromCenter <= getRadius();
	}
	
	public boolean equals(Object obj) {
		//kada su centri isti, i innerRadius i radius
		if(obj instanceof Donut) {
			Donut donut = (Donut) obj;
			//super.equals(obj) && this.innerRadius == donut.innerRadius
			if(getCenter().equals(donut.getCenter()) && getRadius() == donut.getRadius() && this.innerRadius == donut.innerRadius) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public String toString() {
		return "Center: ("+ getCenter().getX()+", "+getCenter().getY() +"), " + "outer radius = "+ getRadius()+ ", inner radius = " + this.innerRadius; 
	}
	
}
