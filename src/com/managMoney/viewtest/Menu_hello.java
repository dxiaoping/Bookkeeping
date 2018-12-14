package com.managMoney.viewtest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Menu_hello extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_hello frame = new Menu_hello();
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
	public Menu_hello() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 916, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 255));
		panel_1.setBounds(0, 0, 99, 497);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("\u6211\u7684\u8D26\u6237");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 14));
		btnNewButton.setBackground(new Color(204, 204, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(2, 52, 93, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u5206\u7C7B\u8BBE\u7F6E");
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 14));
		btnNewButton_1.setBackground(new Color(204, 204, 204));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(2, 127, 93, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u6536\u5165\u7BA1\u7406");
		btnNewButton_2.setFont(new Font("宋体", Font.PLAIN, 14));
		btnNewButton_2.setBackground(new Color(204, 204, 204));
		btnNewButton_2.setBounds(2, 202, 93, 23);
		panel_1.add(btnNewButton_2);
		
		JButton button = new JButton("\u652F\u51FA\u7BA1\u7406");
		button.setFont(new Font("宋体", Font.PLAIN, 14));
		button.setBackground(new Color(204, 204, 204));
		button.setBounds(2, 277, 93, 23);
		panel_1.add(button);
		
		JButton button_1 = new JButton("\u9000\u51FA\u7CFB\u7EDF");
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_1.setBackground(new Color(204, 204, 204));
		button_1.setBounds(2, 352, 93, 23);
		panel_1.add(button_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(97, 0, 813, 497);
		panel_2.setBackground(new Color(70, 130, 180));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("\u5C0F \u578B \u5B66 \u751F \u7406 \u8D22 \u7CFB \u7EDF");
		label.setBounds(206, 271, 449, 59);
		panel_2.add(label);
		label.setForeground(new Color(255, 255, 204));
		label.setFont(new Font("叶根友毛笔行书2.0版", Font.BOLD, 34));
		
		JLabel label_1 = new JLabel("\u6B22\u8FCE\u4F7F\u7528");
		label_1.setForeground(new Color(255, 255, 224));
		label_1.setFont(new Font("叶根友毛笔行书2.0版", Font.BOLD, 30));
		label_1.setBounds(326, 187, 146, 54);
		panel_2.add(label_1);
	}


}
