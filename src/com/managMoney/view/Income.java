package com.managMoney.view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.managMoney.entity.Bill;
import com.managMoney.service.Service;

public class Income extends JPanel {

	/**
	 * Create the panel.
	 */
	public Income() {
		this.setBounds(0, 0, 600,386);
		this.setLayout(null);
		
		
		JPanel jPanelTop = new JPanel();
		jPanelTop.setBounds(0,0,600,50);
		jPanelTop.setBackground(new Color(135, 206, 235));
		jPanelTop.setLayout(null);
		this.add(jPanelTop);
		
		String head[] = {"账单名称","账单类型","账单类别","金额","支出时间","创建时间"};
		JLabel lable[] = new JLabel[6];
		for (int i = 0; i < 6; i++) {
			lable[i] = new JLabel(head[i]);
			lable[i].setHorizontalAlignment(SwingConstants.CENTER);
			lable[i].setBackground(Color.cyan);
			if (i < 4) {
				lable[i].setBounds(80*i, 0, 78, 50);	
			}else {
				lable[i].setBounds(80*i + 50*(i-4), 0, 78+50, 50);
			}
			jPanelTop.add(lable[i]);
		}
		
		
		//数据域
		
		JPanel jPanelBottom = new JPanel();
		jPanelBottom.setBounds(0,58,600,327);
		jPanelBottom.setBackground(Color.white);
		jPanelBottom.setLayout(null);
		this.add(jPanelBottom);
		
		List<JPanel> jPanels = new ArrayList<JPanel>();
		List<Bill> bills = new Service().getBillList("收入");
		Bill bill = null;
		for (int i = 0; i < bills.size(); i++) {
			//单条数据
			JPanel jPanelBill = new JPanel();
			jPanelBill.setBounds(0,52*i,600,50);
			jPanelBill.setBackground(new Color(135, 206, 235));
			jPanelBill.setLayout(null);
			
//			jPanelBottom.add(jPanelBill);
			
			bill = bills.get(i);
			JLabel label_1 = new JLabel(bill.getBillName());
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1.setBounds(0, 0, 78, 50);
			jPanelBill.add(label_1);
			
			JLabel label_2 = new JLabel(bill.getBillType());
			label_2.setHorizontalAlignment(SwingConstants.CENTER);
			label_2.setBounds(80, 0, 78, 50);
			jPanelBill.add(label_2);
			
			JLabel label_3 = new JLabel(bill.getBillClass());
			label_3.setHorizontalAlignment(SwingConstants.CENTER);
			label_3.setBackground(Color.cyan);
			label_3.setBounds(80*2, 0, 78, 50);
			jPanelBill.add(label_3);
			
			JLabel label_4 = new JLabel(String.valueOf(bill.getBillMoney()));
			label_4.setHorizontalAlignment(SwingConstants.CENTER);
			label_4.setBackground(Color.cyan);
			label_4.setBounds(80*3, 0, 78, 50);
			jPanelBill.add(label_4);
			
			JLabel label_5 = new JLabel(bill.getPayTime());
			label_5.setHorizontalAlignment(SwingConstants.CENTER);
			label_5.setBackground(Color.cyan);
			label_5.setBounds(80*4, 0, 78+50, 50);
			jPanelBill.add(label_5);
			
			JLabel label_6 = new JLabel(String.valueOf(bill.getCreateTime()));
			label_6.setHorizontalAlignment(SwingConstants.CENTER);
			label_6.setBackground(Color.cyan);
			label_6.setBounds(80*5+50, 0, 78+20, 50);
			jPanelBill.add(label_6);
			
//			JComboBox<String> jcb = new JComboBox<String>();//下拉列表
//			jcb.setBounds(80*6+70, 0, 48, 30);
//			jcb.setBackground(Color.white);
//			ItemListener itemListener = new ItemListener() {
//				
//			      @Override
//			      public void itemStateChanged(ItemEvent arg0) {
//			        if(ItemEvent.DESELECTED == arg0.getStateChange()){
//			          String selectedItem = arg0.getItem().toString();
//			          System.out.println(selectedItem);
//			        }
//			      }
//			      };
//			jcb.addItemListener(itemListener);
//			jcb.addItem("修改");
//			jcb.addItem("删除");
//			jPanelBill.add(jcb);
			jPanels.add(jPanelBill);
		}
		
		for (int i = 0; i < jPanels.size(); i++) {
			jPanelBottom.add(jPanels.get(i));
		}
	}
}
