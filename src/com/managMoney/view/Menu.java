package com.managMoney.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.managMoney.viewbk.InOutSet;
import com.managMoney.viewbk.Income;
import com.managMoney.viewbk.Outcome;

public class Menu extends JPanel {


	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Menu() {
		
		setBounds(100, 100, 916, 525);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 255));
		panel_1.setBounds(0, 0, 99, 497);
		this.add(panel_1);
		panel_1.setLayout(null);
		
		JButton button_1 = new JButton("我的账户");
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_1.setBackground(new Color(204, 204, 204));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_1.setBounds(2, 52, 93, 23);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("分类设置");
		button_2.setFont(new Font("宋体", Font.PLAIN, 14));
		button_2.setBackground(new Color(204, 204, 204));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_2.setBounds(2, 127, 93, 23);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("收入管理");
		button_3.setFont(new Font("宋体", Font.PLAIN, 14));
		button_3.setBackground(new Color(204, 204, 204));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_3.setBounds(2, 202, 93, 23);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("支出管理");
		button_4.setFont(new Font("宋体", Font.PLAIN, 14));
		button_4.setBackground(new Color(204, 204, 204));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_4.setBounds(2, 277, 93, 23);
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("退出系统");
		button_5.setFont(new Font("宋体", Font.PLAIN, 14));
		button_5.setBackground(new Color(204, 204, 204));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_5.setBounds(2, 352, 93, 23);
		panel_1.add(button_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(97, 0, 813, 497);
		panel_2.setBackground(new Color(70, 130, 180));
		this.add(panel_2);
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
//	public void executeOutcome() {
//		Rectangle rectangle =this.jPanelRight.getBounds();
//		this.remove(jPanelRight);
//		this.jPanelRight = new Outcome();
//		
//		this.add(jPanelRight);
//		jPanelRight.setBounds(rectangle);
//		setVisible(true);
//	}
//	
//	public void executeInOutSet() {
//		Rectangle rectangle =this.jPanelRight.getBounds();
//		this.remove(jPanelRight);
//		this.jPanelRight = new InOutSet();
//		this.add(jPanelRight);
//		jPanelRight.setBounds(rectangle);
//		setVisible(true);
//	}
//	
//	public void executeIncome() {
//		Rectangle rectangle =this.jPanelRight.getBounds();
//		this.remove(jPanelRight);
//		this.jPanelRight = new Income();
//		this.add(jPanelRight);
//		jPanelRight.setBounds(rectangle);
//		setVisible(true);
//	}

}
