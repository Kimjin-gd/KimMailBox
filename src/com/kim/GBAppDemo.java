package com.kim;

import javax.swing.JApplet;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GBAppDemo extends JApplet {

	/**
	 * Create the applet.
	 */
	public GBAppDemo() {
		GridBagLayout gridBagLayout = new GridBagLayout();
//		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
//		gridBagLayout.rowHeights = new int[]{0, 0};
//		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
//		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JButton btnNewButton = new JButton("New button");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.weighty = 1.0;
		gbc_btnNewButton.weightx = 1.0;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.weightx = 1.0;
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 0);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 0;
		getContentPane().add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.weightx = 1.0;
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 0);
		gbc_btnNewButton_2.gridx = 2;
		gbc_btnNewButton_2.gridy = 0;
		getContentPane().add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.weightx = 1.0;
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 0, 0);
		gbc_btnNewButton_3.gridx = 3;
		gbc_btnNewButton_3.gridy = 0;
		getContentPane().add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.weighty = 1.0;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 0, 0);
		gbc_btnNewButton_4.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_4.gridwidth = 4;
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 1;
		getContentPane().add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.weighty = 1.0;
		gbc_btnNewButton_5.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5.gridwidth = 3;
		gbc_btnNewButton_5.insets = new Insets(0, 0, 0, 0);
		gbc_btnNewButton_5.gridx = 0;
		gbc_btnNewButton_5.gridy = 2;
		getContentPane().add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_6.insets = new Insets(0, 0, 0, 0);
		gbc_btnNewButton_6.gridx = 3;
		gbc_btnNewButton_6.gridy = 2;
		getContentPane().add(btnNewButton_6, gbc_btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.weighty = 2.0;
		gbc_btnNewButton_7.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_7.gridheight = 2;
		gbc_btnNewButton_7.insets = new Insets(0, 0, 0, 0);
		gbc_btnNewButton_7.gridx = 0;
		gbc_btnNewButton_7.gridy = 3;
		getContentPane().add(btnNewButton_7, gbc_btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.weighty = 1.0;
		gbc_btnNewButton_8.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_8.insets = new Insets(0, 0, 0, 0);
		gbc_btnNewButton_8.gridwidth = 3;
		gbc_btnNewButton_8.gridx = 1;
		gbc_btnNewButton_8.gridy = 3;
		getContentPane().add(btnNewButton_8, gbc_btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_9 = new GridBagConstraints();
		gbc_btnNewButton_9.weighty = 1.0;
		gbc_btnNewButton_9.gridwidth = 3;
		gbc_btnNewButton_9.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_9.insets = new Insets(0, 0, 0, 0);
		gbc_btnNewButton_9.gridx = 1;
		gbc_btnNewButton_9.gridy = 4;
		getContentPane().add(btnNewButton_9, gbc_btnNewButton_9);

	}

}
