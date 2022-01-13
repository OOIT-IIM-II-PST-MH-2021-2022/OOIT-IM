package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmIgrac extends JFrame {

	private JPanel contentPane;
	private DefaultListModel dlm=  new DefaultListModel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmIgrac frame = new FrmIgrac();
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
	public FrmIgrac() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[]{0, 0, 73, 0, 0, 0, 0, 0, 0};
		gbl_panelCenter.rowHeights = new int[]{0, 0, 0, 0, 0, 27, 0};
		gbl_panelCenter.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelCenter.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCenter.setLayout(gbl_panelCenter);
		
		JLabel lblIgrac1 = new JLabel("Branislav Ivanovic");
		lblIgrac1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblIgrac1 = new GridBagConstraints();
		gbc_lblIgrac1.gridwidth = 2;
		gbc_lblIgrac1.insets = new Insets(0, 0, 5, 5);
		gbc_lblIgrac1.gridx = 1;
		gbc_lblIgrac1.gridy = 0;
		panelCenter.add(lblIgrac1, gbc_lblIgrac1);
		
		JButton btnIvanovic = new JButton("Ivanovic");
		btnIvanovic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dlm.addElement(lblIgrac1.getText());
			}
		});
		GridBagConstraints gbc_btnIvanovic = new GridBagConstraints();
		gbc_btnIvanovic.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnIvanovic.insets = new Insets(0, 0, 5, 5);
		gbc_btnIvanovic.gridx = 0;
		gbc_btnIvanovic.gridy = 0;
		panelCenter.add(btnIvanovic, gbc_btnIvanovic);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridheight = 4;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 3;
		gbc_scrollPane.gridy = 0;
		panelCenter.add(scrollPane, gbc_scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(dlm);
		
		JLabel lblIgrac2 = new JLabel("Nemanja Matic");
		lblIgrac2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblIgrac2 = new GridBagConstraints();
		gbc_lblIgrac2.gridwidth = 2;
		gbc_lblIgrac2.insets = new Insets(0, 0, 5, 5);
		gbc_lblIgrac2.gridx = 1;
		gbc_lblIgrac2.gridy = 1;
		panelCenter.add(lblIgrac2, gbc_lblIgrac2);
		
		JButton btnNewButton_1 = new JButton("Matic");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.addElement(lblIgrac2.getText());
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 1;
		panelCenter.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JLabel lblIgrac3 = new JLabel("Aleksandar Kolarov");
		lblIgrac3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblIgrac3 = new GridBagConstraints();
		gbc_lblIgrac3.gridwidth = 2;
		gbc_lblIgrac3.insets = new Insets(0, 0, 5, 5);
		gbc_lblIgrac3.gridx = 1;
		gbc_lblIgrac3.gridy = 2;
		panelCenter.add(lblIgrac3, gbc_lblIgrac3);
		
		JButton btnNewButton_2 = new JButton("Kolarov");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.addElement(lblIgrac3.getText());
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 2;
		panelCenter.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JCheckBox chckbxUnesiIgraca = new JCheckBox("Unesi igraca");
		chckbxUnesiIgraca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxUnesiIgraca.isSelected()) {
					textField.setEnabled(true);
				}
				else {
					textField.setEnabled(false);
				}
			}
		});
		GridBagConstraints gbc_chckbxUnesiIgraca = new GridBagConstraints();
		gbc_chckbxUnesiIgraca.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxUnesiIgraca.gridx = 0;
		gbc_chckbxUnesiIgraca.gridy = 4;
		panelCenter.add(chckbxUnesiIgraca, gbc_chckbxUnesiIgraca);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode() == KeyEvent.VK_ENTER) {
					dlm.addElement(textField.getText());
					textField.setText("");
				}
				
			}
		});
		textField.setEnabled(false);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridwidth = 7;
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 4;
		panelCenter.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblIzbor = new JLabel("Izaberi igraca");
		GridBagConstraints gbc_lblIzbor = new GridBagConstraints();
		gbc_lblIzbor.insets = new Insets(0, 0, 0, 5);
		gbc_lblIzbor.gridx = 0;
		gbc_lblIzbor.gridy = 5;
		panelCenter.add(lblIzbor, gbc_lblIzbor);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dlm.addElement(comboBox.getSelectedItem().toString());
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tadic", "Jovic", "Gudelj"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 6;
		gbc_comboBox.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 5;
		panelCenter.add(comboBox, gbc_comboBox);
		
		
		JPanel panelNorth = new JPanel();
		contentPane.add(panelNorth, BorderLayout.NORTH);
		
		JLabel lblNaslov = new JLabel("Forma za unos igraca");
		lblNaslov.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelNorth.add(lblNaslov);
		
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JButton btnDodavanje = new JButton("Dodaj igraca");
		btnDodavanje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgIgrac dlg = new DlgIgrac();
				dlg.setVisible(true);
				dlm.addElement(dlg.getTextFieldIme().getText() + " " + dlg.getTextFieldPrezime().getText());
			}
		});
		panelSouth.add(btnDodavanje);
	}

}
