package geometry;

import java.awt.Graphics;

import javax.swing.JPanel;//crtl+shift+o

public class DrawingPanel extends JPanel {
	
	public DrawingPanel() {
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Line line = new Line(new Point(50,50), new Point(50, 70));
		Point point = new Point(100,100);
		point.setSelected(true);
		point.draw(g);
		line.setSelected(true);
		//line.draw(g);
		line.setSelected(false);
		line.draw(g);
		Rectangle rect = new Rectangle(new Point(200, 120), 100, 50);
		rect.setSelected(true);
		rect.draw(g);
		Circle circle = new Circle(new Point(150,150), 50);
		circle.setSelected(true);
		circle.draw(g);
		Donut donut = new Donut(new Point(100, 200), 100, 50);
		donut.setSelected(true);
		donut.draw(g);
	}
}
