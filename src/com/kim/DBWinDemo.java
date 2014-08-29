package com.kim;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

public class DBWinDemo extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DBWinDemo frame = new DBWinDemo();
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
	public DBWinDemo() {
		setTitle("Data Base Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Login", null, panel, null);
		panel.setLayout(new GridLayout(12, 1, 0, 0));
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Remerber password");
		chckbxNewCheckBox_1.setMnemonic('R');
		
		chckbxNewCheckBox_1.setMnemonic(KeyEvent.VK_R);
		chckbxNewCheckBox_1.setDisplayedMnemonicIndex(KeyEvent.VK_R);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Display all schema");
		chckbxNewCheckBox.setMnemonic('D');
		panel.add(chckbxNewCheckBox);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Query", null, panel_1, null);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Load Option", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		panel_3.add(rdbtnNewRadioButton_1);
		buttonGroup.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		panel_3.add(rdbtnNewRadioButton_2);
		buttonGroup.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		panel_3.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(6, 1, 0, 0));
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("New check box");
		panel_4.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("New check box");
		panel_4.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		panel_4.add(chckbxNewCheckBox_2);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Drivers", null, panel_5, null);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Note: This is too long long long long long long long long long long long long long long ");
		panel_5.add(lblNewLabel, BorderLayout.NORTH);
		
		JTextPane textPane = new JTextPane();
		panel_5.add(textPane, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6, BorderLayout.EAST);
		panel_6.setLayout(new GridLayout(5, 1, 0, 0));
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_6.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("New button");
		panel_6.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("New button");
		panel_6.add(btnNewButton_4);
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7, BorderLayout.SOUTH);
		panel_7.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel_7.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("New button");
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(btnNewButton_2);
	}

}
