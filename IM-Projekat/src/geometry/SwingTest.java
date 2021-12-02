package geometry;

import javax.swing.JFrame;

public class SwingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Swing API klase delimo na tri grupe:
		 *1)kontejneri najviseg nivoa (JFrame, JPanel)
		 *2)medjukontejneri
		 *3)komponente (JLabel, JTextField, JButton)
		*/
		JFrame frame = new JFrame();
		frame.getContentPane().add(new DrawingPanel());
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	


}
