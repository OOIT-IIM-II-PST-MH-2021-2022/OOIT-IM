package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgDodavanjeBoje extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldOne;
	private JTextField textFieldTwo;
	private JTextField textFieldThree;
	
	private int one = -1;
	private int two = -1;
	private int three = -1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgDodavanjeBoje dialog = new DlgDodavanjeBoje();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgDodavanjeBoje() {
		setTitle("Dodavanje boje");
		setModal(true);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{30, 30, 30, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblOne = new JLabel("Prva vrednost");
			GridBagConstraints gbc_lblOne = new GridBagConstraints();
			gbc_lblOne.anchor = GridBagConstraints.EAST;
			gbc_lblOne.insets = new Insets(0, 0, 5, 5);
			gbc_lblOne.gridx = 3;
			gbc_lblOne.gridy = 0;
			contentPanel.add(lblOne, gbc_lblOne);
		}
		{
			textFieldOne = new JTextField();
			textFieldOne.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent arg0) {
					char c = arg0.getKeyChar();
					if(c < '0' || c > '9' || c == KeyEvent.VK_SPACE) {
						arg0.consume();
					}
				}
			});
			GridBagConstraints gbc_textFieldOne = new GridBagConstraints();
			gbc_textFieldOne.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldOne.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldOne.gridx = 4;
			gbc_textFieldOne.gridy = 0;
			contentPanel.add(textFieldOne, gbc_textFieldOne);
			textFieldOne.setColumns(10);
		}
		{
			JLabel lblTwo = new JLabel("Druga vrednost");
			GridBagConstraints gbc_lblTwo = new GridBagConstraints();
			gbc_lblTwo.anchor = GridBagConstraints.EAST;
			gbc_lblTwo.insets = new Insets(0, 0, 5, 5);
			gbc_lblTwo.gridx = 3;
			gbc_lblTwo.gridy = 1;
			contentPanel.add(lblTwo, gbc_lblTwo);
		}
		{
			textFieldTwo = new JTextField();
			textFieldTwo.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(c < '0' || c > '9' || c == KeyEvent.VK_SPACE) {
						e.consume();
					}
				}
			});
			GridBagConstraints gbc_textFieldTwo = new GridBagConstraints();
			gbc_textFieldTwo.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldTwo.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldTwo.gridx = 4;
			gbc_textFieldTwo.gridy = 1;
			contentPanel.add(textFieldTwo, gbc_textFieldTwo);
			textFieldTwo.setColumns(10);
		}
		{
			JLabel lblThree = new JLabel("Treca vrednost");
			GridBagConstraints gbc_lblThree = new GridBagConstraints();
			gbc_lblThree.anchor = GridBagConstraints.EAST;
			gbc_lblThree.insets = new Insets(0, 0, 0, 5);
			gbc_lblThree.gridx = 3;
			gbc_lblThree.gridy = 2;
			contentPanel.add(lblThree, gbc_lblThree);
		}
		{
			textFieldThree = new JTextField();
			textFieldThree.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent arg0) {
					char c = arg0.getKeyChar();
					if(c < '0' || c > '9' || c == KeyEvent.VK_SPACE) {
						arg0.consume();
					}
				}
			});
			GridBagConstraints gbc_textFieldThree = new GridBagConstraints();
			gbc_textFieldThree.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldThree.gridx = 4;
			gbc_textFieldThree.gridy = 2;
			contentPanel.add(textFieldThree, gbc_textFieldThree);
			textFieldThree.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							one = Integer.parseInt(textFieldOne.getText());
							two = Integer.parseInt(textFieldTwo.getText());
							three = Integer.parseInt(textFieldThree.getText());
						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null, "Neophodno je proslediti broj a ne prazan string."
									, "Greska", JOptionPane.ERROR_MESSAGE);
						}
						/*one = Integer.parseInt(textFieldOne.getText());
						two = Integer.parseInt(textFieldTwo.getText());
						three = Integer.parseInt(textFieldThree.getText());*/
						if(one>= 0 && one<= 255 && two >= 0 && two <= 255 && three >= 0 && three <= 255) {
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null, "Vrednosti moraju biti u opsegu od 0 do 255"
									, "Greska", JOptionPane.ERROR_MESSAGE);
						}
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public int getOne() {
		return one;
	}

	public int getTwo() {
		return two;
	}

	public int getThree() {
		return three;
	}

	public JTextField getTextFieldOne() {
		return textFieldOne;
	}

	public JTextField getTextFieldTwo() {
		return textFieldTwo;
	}

	public JTextField getTextFieldThree() {
		return textFieldThree;
	}
	

}
