package com.managMoney.view;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.xml.internal.ws.api.pipe.Tube;

public class Menu extends JPanel {

	/**
	 * Create the panel.
	 */
	JPanel jPanelRight = new JPanel();
	public Menu() {
		
		this.setBounds(0, 0, 700, 430);
		this.setBackground(Color.ORANGE);
		this.setLayout(null);
		
		JPanel jPanelLeft = new JPanel();
		this.add(jPanelLeft);
		jPanelLeft.setBounds(2, 40, 106, 389);
		jPanelLeft.setLayout(null);
		jPanelLeft.setBackground(Color.PINK);
		
//		this.jPanelRight = new Outcome();
		this.add(jPanelRight);
		jPanelRight.setBounds(116, 40, 600, 389);
		
		JLabel welcomeLabel = new JLabel("欢迎使用小型学生理财系统");
		this.add(welcomeLabel);
		welcomeLabel.setBounds(260, 0, 180, 40);
		
		JButton button_1 = new JButton("我的账户");
		jPanelLeft.add(button_1);
		button_1.setBounds(0, 0, 105, 67);
		
		JButton button_2 = new JButton("收支设置");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				executeInOutSet();
			}
		});
		jPanelLeft.add(button_2);
		button_2.setBounds(0, 107, 105, 67);
		
		JButton button_3 = new JButton("收入管理");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				executeIncome();
			}
		});
		jPanelLeft.add(button_3);
		button_3.setBounds(0, 214, 105, 67);
		
		JButton button_4 = new JButton("支出管理");
		jPanelLeft.add(button_4);
		button_4.setBounds(0, 322, 105, 67);
		
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				executeOutcome();
			}
		});
	}
	public void executeOutcome() {
		Rectangle rectangle =this.jPanelRight.getBounds();
		this.remove(jPanelRight);
		this.jPanelRight = new Outcome();
		
		this.add(jPanelRight);
		jPanelRight.setBounds(rectangle);
		setVisible(true);
	}
	
	public void executeInOutSet() {
		Rectangle rectangle =this.jPanelRight.getBounds();
		this.remove(jPanelRight);
		this.jPanelRight = new InOutSet();
		this.add(jPanelRight);
		jPanelRight.setBounds(rectangle);
		setVisible(true);
	}
	
	public void executeIncome() {
		Rectangle rectangle =this.jPanelRight.getBounds();
		this.remove(jPanelRight);
		this.jPanelRight = new Income();
		this.add(jPanelRight);
		jPanelRight.setBounds(rectangle);
		setVisible(true);
	}
}
