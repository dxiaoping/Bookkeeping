package com.managMoney.viewtest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField JPasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(70, 130, 180));
		panel.setBounds(0, 0, 427, 158);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u6B22\u8FCE\u4F7F\u7528");
		lblNewLabel_1.setForeground(new Color(255, 250, 240));
		lblNewLabel_1.setFont(new Font("叶根友毛笔行书2.0版", Font.BOLD, 30));
		lblNewLabel_1.setBounds(148, 22, 138, 51);
		panel.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("\u5C0F\u578B\u5B66\u751F\u7406\u8D22\u7CFB\u7EDF");
		label_1.setForeground(new Color(255, 245, 238));
		label_1.setFont(new Font("叶根友毛笔行书2.0版", Font.BOLD, 28));
		label_1.setBounds(90, 83, 262, 36);
		panel.add(label_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 245));
		panel_1.setBounds(0, 156, 427, 148);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u624B\u673A\u53F7");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel.setBounds(84, 24, 47, 26);
		panel_1.add(lblNewLabel);
		
		JLabel label = new JLabel("\u5BC6\u7801");
		label.setFont(new Font("宋体", Font.PLAIN, 14));
		label.setBounds(94, 63, 33, 15);
		panel_1.add(label);
		
		textField = new JTextField();
		textField.setBounds(138, 27, 189, 21);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPasswordField = new JPasswordField();
		JPasswordField.setBounds(138, 60, 189, 21);
		panel_1.add(JPasswordField);
		JPasswordField.setColumns(10);
		
		JButton button = new JButton("\u767B\u5F55");
		button.setBackground(new Color(211, 211, 211));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(100, 106, 73, 23);
		button.setBorder(BorderFactory.createRaisedBevelBorder());
		panel_1.add(button);
		
		JButton button_1 = new JButton("\u6CE8\u518C");
		button_1.setBackground(new Color(211, 211, 211));
		button_1.setBounds(254, 106, 73, 23);
		button_1.setBorder(BorderFactory.createRaisedBevelBorder());
		panel_1.add(button_1);
	}
}
