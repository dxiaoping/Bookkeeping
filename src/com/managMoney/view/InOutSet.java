package com.managMoney.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.eclipse.ui.actions.LabelRetargetAction;

public class InOutSet extends JPanel {

	/**
	 * Create the panel.
	 */
	public InOutSet() {
		this.setBounds(0, 0, 600,386);
		this.setLayout(null);
		
		
		JPanel jPanelTopLeft = new JPanel();
		jPanelTopLeft.setBounds(0,0,295,50);
		jPanelTopLeft.setBackground(new Color(135, 206, 235));
		jPanelTopLeft.setLayout(null);
		JLabel labelLeft = new JLabel("收入类");
		labelLeft.setBounds(0,0,295,50);
		labelLeft.setBackground(new Color(135, 206, 235));
		labelLeft.setHorizontalAlignment(SwingConstants.CENTER);
		jPanelTopLeft.add(labelLeft);
		this.add(jPanelTopLeft);
		
		JPanel jPanelTopRight = new JPanel();
		jPanelTopRight.setBounds(305,0,295,50);
		jPanelTopRight.setBackground(new Color(135, 206, 235));
		jPanelTopRight.setLayout(null);
		JLabel lableRight = new JLabel("支出类");
		lableRight.setBounds(0,0,295,50);
		lableRight.setBackground(new Color(135, 206, 235));
		lableRight.setHorizontalAlignment(SwingConstants.CENTER);
		lableRight.setLayout(null);
		jPanelTopRight.add(lableRight);
		this.add(jPanelTopRight);
		
		JPanel jPanelBottomLeft = new JPanel();
		jPanelBottomLeft.setBounds(0,58,295,327);
		jPanelBottomLeft.setBackground(Color.white);
		jPanelBottomLeft.setLayout(null);
		this.add(jPanelBottomLeft);
		
		JPanel jPanelBottomRight = new JPanel();
		jPanelBottomRight.setBounds(305,58,295,327);
		jPanelBottomRight.setBackground(Color.white);
		jPanelBottomRight.setLayout(null);
		this.add(jPanelBottomRight);
	}

}
