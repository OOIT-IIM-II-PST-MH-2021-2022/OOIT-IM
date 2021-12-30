package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JToggleButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrmTest extends JFrame {

	private JPanel contentPane;
	private ButtonGroup group = new ButtonGroup();
	private DefaultListModel<String> dlm = new DefaultListModel<String>();
	private JTextField textField;
	private boolean check = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTest frame = new FrmTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JButton btnAntistres = new JButton("Antistres dugme");
		btnAntistres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Antistres dugme :)", "Pritisnuli ste dugme", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnAntistres.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panelSouth.add(btnAntistres);
		
		
		JPanel panelNorth = new JPanel();
		contentPane.add(panelNorth, BorderLayout.NORTH);
		
		JLabel lblNaslov = new JLabel("NASLOV");
		lblNaslov.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNorth.add(lblNaslov);
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.WEST);
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[]{67, 0, 0, 0};
		gbl_panelCenter.rowHeights = new int[]{25, 0, 25, 25, 25, 25, 0};
		gbl_panelCenter.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelCenter.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCenter.setLayout(gbl_panelCenter);
		
		JLabel lblCrveno = new JLabel("Crveno");
		GridBagConstraints gbc_lblCrveno = new GridBagConstraints();
		gbc_lblCrveno.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrveno.gridx = 0;
		gbc_lblCrveno.gridy = 0;
		panelCenter.add(lblCrveno, gbc_lblCrveno);
		
		JToggleButton btnCrveno = new JToggleButton("Crveno");
		btnCrveno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.add(0, lblCrveno.getText());
				panelCenter.setBackground(Color.RED);
			}
		});
		group.add(btnCrveno);
		
		
		GridBagConstraints gbc_btnCrveno = new GridBagConstraints();
		gbc_btnCrveno.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrveno.gridx = 1;
		gbc_btnCrveno.gridy = 0;
		panelCenter.add(btnCrveno, gbc_btnCrveno);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 0;
		panelCenter.add(scrollPane, gbc_scrollPane);
		
		JList<String> list = new JList<String>();
		scrollPane.setViewportView(list);
		list.setModel(dlm);
		
		JLabel lblPlavo = new JLabel("Plavo");
		GridBagConstraints gbc_lblPlavo = new GridBagConstraints();
		gbc_lblPlavo.insets = new Insets(0, 0, 5, 5);
		gbc_lblPlavo.gridx = 0;
		gbc_lblPlavo.gridy = 1;
		panelCenter.add(lblPlavo, gbc_lblPlavo);
		
		
		JToggleButton btnPlavo = new JToggleButton("Plavo");
		btnPlavo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dlm.add(0, lblPlavo.getText());
				panelCenter.setBackground(Color.BLUE);
			}
		});
		group.add(btnPlavo);

		
		GridBagConstraints gbc_btnPlavo = new GridBagConstraints();
		gbc_btnPlavo.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPlavo.insets = new Insets(0, 0, 5, 5);
		gbc_btnPlavo.gridx = 1;
		gbc_btnPlavo.gridy = 1;
		panelCenter.add(btnPlavo, gbc_btnPlavo);
		
		JLabel lblZuto = new JLabel("Zuto");
		GridBagConstraints gbc_lblZuto = new GridBagConstraints();
		gbc_lblZuto.insets = new Insets(0, 0, 5, 5);
		gbc_lblZuto.gridx = 0;
		gbc_lblZuto.gridy = 2;
		panelCenter.add(lblZuto, gbc_lblZuto);
		
		JToggleButton btnZuto = new JToggleButton("Zuto");
		btnZuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.add(0, lblZuto.getText());
				panelCenter.setBackground(Color.YELLOW);
			}
		});
		group.add(btnZuto);
		
		
		
		
		GridBagConstraints gbc_btnZuto = new GridBagConstraints();
		gbc_btnZuto.insets = new Insets(0, 0, 5, 5);
		gbc_btnZuto.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnZuto.gridx = 1;
		gbc_btnZuto.gridy = 2;
		panelCenter.add(btnZuto, gbc_btnZuto);
		
		JLabel lblIzaberiBoju = new JLabel("Izaberi boju");
		GridBagConstraints gbc_lblIzaberiBoju = new GridBagConstraints();
		gbc_lblIzaberiBoju.anchor = GridBagConstraints.EAST;
		gbc_lblIzaberiBoju.insets = new Insets(0, 0, 5, 5);
		gbc_lblIzaberiBoju.gridx = 0;
		gbc_lblIzaberiBoju.gridy = 4;
		panelCenter.add(lblIzaberiBoju, gbc_lblIzaberiBoju);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					dlm.add(0, comboBox.getModel().getSelectedItem().toString());
					switch(comboBox.getModel().getSelectedItem().toString()) {
						case "Zelena":
							panelCenter.setBackground(Color.GREEN);
							break;
						case "Narandzasta":
							panelCenter.setBackground(Color.ORANGE);
							break;
						case "Ljubicasta":
							panelCenter.setBackground(Color.MAGENTA);
							break;	
					}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Zelena", "Narandzasta", "Ljubicasta"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 4;
		panelCenter.add(comboBox, gbc_comboBox);
		
		JLabel lblUpisiBoju = new JLabel("Upisi boju");
		GridBagConstraints gbc_lblUpisiBoju = new GridBagConstraints();
		gbc_lblUpisiBoju.anchor = GridBagConstraints.EAST;
		gbc_lblUpisiBoju.insets = new Insets(0, 0, 0, 5);
		gbc_lblUpisiBoju.gridx = 0;
		gbc_lblUpisiBoju.gridy = 5;
		panelCenter.add(lblUpisiBoju, gbc_lblUpisiBoju);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				char c = arg0.getKeyChar();
				if(c == KeyEvent.VK_ENTER) {
					dlm.add(0, textField.getText());
					textField.setText("");
				}
			}
		});
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 5;
		panelCenter.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnDodajBoju = new JButton("Dodaj boju");
		btnDodajBoju.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check) {
					DlgDodavanjeBoje dlg = new DlgDodavanjeBoje();
					dlg.setVisible(true);
					dlm.add(0, dlg.getOne() + "," + dlg.getTwo() + "," + dlg.getThree());
					panelCenter.setBackground(new Color(dlg.getOne(),dlg.getTwo(),dlg.getThree()));
					check = false;
					
				}
				else {
					String[] strings = dlm.get(list.getSelectedIndex()).split(",");
					DlgDodavanjeBoje dlgOne = new DlgDodavanjeBoje();
					dlgOne.getTextFieldOne().setText(strings[0]);
					dlgOne.getTextFieldTwo().setText(strings[1]);
					dlgOne.getTextFieldThree().setText(strings[2]);
					dlgOne.setVisible(true);
					dlm.add(list.getSelectedIndex(), dlgOne.getOne() + "," + dlgOne.getTwo() + "," + dlgOne.getThree());
					dlm.remove(list.getSelectedIndex()+1);
					panelCenter.setBackground(new Color(dlgOne.getOne(),dlgOne.getTwo(),dlgOne.getThree()));
				}
				
			}
		});
		btnDodajBoju.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panelSouth.add(btnDodajBoju);
	}

}
