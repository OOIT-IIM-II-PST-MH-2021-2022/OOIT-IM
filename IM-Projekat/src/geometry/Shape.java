package geometry;

public abstract class Shape implements Moveable, Comparable<Object> {

	protected boolean selected;
	
	
	public abstract boolean contains(int x, int y);
	
	//Konstuktori
	
	public Shape() {
		
	}
	
	public Shape(boolean selected) {
		this.selected = selected;
	}
	
	//Get i set metode
	public boolean isSelected() {
		return selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
