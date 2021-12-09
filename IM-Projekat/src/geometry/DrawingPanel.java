package geometry;

import java.awt.Graphics;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JPanel;//crtl+shift+o

public class DrawingPanel extends JPanel {
	
	public DrawingPanel() {
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Line line = new Line(new Point(50,50), new Point(50, 70));
		Point point = new Point(100,100);
		point.setSelected(true);
		//point.draw(g);
		line.setSelected(true);
		//line.draw(g);
		line.setSelected(false);
		//line.draw(g);
		Rectangle rect = new Rectangle(new Point(200, 120), 100, 50);
		rect.setSelected(true);
		//rect.draw(g);
		Circle circle = new Circle(new Point(150,150), 50);
		circle.setSelected(true);
		//circle.draw(g);
		Donut donut = new Donut(new Point(100, 200), 100, 50);
		donut.setSelected(true);
		//donut.draw(g);
		
		Object[] objects = new Object[5];
		objects[0] = line;
		objects[1] = point;
		objects[2] = circle;
		objects[3] = donut;
		objects[4] = rect;
		/*Zbog KASNOG POVEZIVANJA, u sluèaju deklaracije niza tipa Object, 
		 nije moguæe direktno pozvati draw metodu nad elementom ovako deklarisanog niza,
		 jer klasa Object ne sadrži draw metodu, pa je potrebno vršiti DOWNCAST-ovanje
		*/
		/*for(int i=0; i<objects.length;i++) {
			if(objects[i] instanceof Point) {
				Point p = (Point)objects[i];
				p.draw(g);
			}else if(objects[i] instanceof Line) {
				Line l = (Line)objects[i];
				l.draw(g);
			}
		}*/
		/*Shape kao apstraktna klasa sadrži deklaraciju draw metode, pa kompajler dozvoljava poziv ove metode
		 nad elementima niza koji je deklarisan kao niz tipa Shape (nije potrebno DOWNCAST-ovanje)
		*/
		Shape[] shapes = new Shape[5];
		shapes[0] = line;
		shapes[1] = point;
		shapes[2] = circle;
		shapes[3] = donut;
		shapes[4] = rect;
		for(int i=0; i<shapes.length;i++) {
			shapes[i].draw(g);
		}
		
		
		
	}
}
