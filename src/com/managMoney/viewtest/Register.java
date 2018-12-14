package com.managMoney.viewtest;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JPasswordField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField JPasswordField;
	private JTextField JPasswordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 383, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(70, 130, 180));
		panel.setBounds(0, 0, 376, 97);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u5C0F\u578B\u5B66\u751F\u7406\u8D22\u7CFB\u7EDF");
		label.setBounds(76, 24, 241, 44);
		label.setForeground(new Color(253, 245, 230));
		label.setFont(new Font("叶根友毛笔行书2.0版", Font.BOLD, 26));
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 245));
		panel_1.setBounds(0, 95, 376, 332);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(135, 81, 173, 21);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(135, 129, 173, 21);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JPasswordField = new JPasswordField();
		JPasswordField.setBounds(135, 177, 173, 21);
		panel_1.add(JPasswordField);
		JPasswordField.setColumns(10);
		
		JPasswordField_1 = new JPasswordField();
		JPasswordField_1.setBounds(135, 225, 173, 21);
		panel_1.add(JPasswordField_1);
		JPasswordField_1.setColumns(10);
		
		JLabel label_1 = new JLabel("\u624B\u673A\u53F7");
		label_1.setFont(new Font("新宋体", Font.PLAIN, 16));
		label_1.setBounds(57, 83, 72, 15);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("\u6635\u79F0");
		label_2.setFont(new Font("新宋体", Font.PLAIN, 16));
		label_2.setBounds(57, 131, 54, 15);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("\u5BC6\u7801");
		label_3.setFont(new Font("新宋体", Font.PLAIN, 16));
		label_3.setBounds(57, 179, 42, 15);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("\u786E\u8BA4\u5BC6\u7801");
		label_4.setFont(new Font("新宋体", Font.PLAIN, 16));
		label_4.setBounds(57, 227, 72, 15);
		panel_1.add(label_4);
		
		JButton button = new JButton("\u7ACB\u5373\u6CE8\u518C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(57, 290, 81, 23);
		button.setBorder(BorderFactory.createRaisedBevelBorder());
		panel_1.add(button);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setBounds(227, 290, 81, 23);
		button_1.setBorder(BorderFactory.createRaisedBevelBorder());
		panel_1.add(button_1);
	}

}
