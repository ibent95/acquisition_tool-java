package com.ibent95.acquisition.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Font;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainFrame frame = new MainFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("Acquisition Tool - ibent95");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1129, 743);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel leftSidebarPanel = new JPanel();
		leftSidebarPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Steps", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		leftSidebarPanel.setLayout(null);
		leftSidebarPanel.setBackground(UIManager.getColor("Panel.background"));
		leftSidebarPanel.setBounds(10, 10, 178, 686);
		contentPane.add(leftSidebarPanel);

		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(new TitledBorder(null, "Main", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		mainPanel.setBackground(UIManager.getColor("Panel.background"));
		mainPanel.setBounds(197, 10, 908, 686);
		contentPane.add(mainPanel);
		mainPanel.setLayout(null);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cancelButton.setBounds(813, 651, 85, 25);
		mainPanel.add(cancelButton);
		
		JButton previousButton = new JButton("Previous");
		previousButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		previousButton.setBounds(623, 651, 85, 25);
		mainPanel.add(previousButton);
		
		JButton nextButton = new JButton("Next");
		nextButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nextButton.setBounds(718, 651, 85, 25);
		mainPanel.add(nextButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Type of Acquisition");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(6, 20, 166, 21);
		leftSidebarPanel.add(rdbtnNewRadioButton);
	}
}
