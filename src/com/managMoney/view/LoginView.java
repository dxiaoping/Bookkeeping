package com.managMoney.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.managMoney.entity.User;


public class LoginView extends JFrame {

	private JPanel contentPane;
	private JLabel lblv = new JLabel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
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
	public LoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 480);
		contentPane = new JPanel();
		// ������������Ĳ��ַ�ʽ�ǿղ���
		contentPane.setLayout(null);
		// ��ʼ���������
		JLabel nameLabel = new JLabel("�û��� :");
		JTextField nameTxt = new JTextField();
		JLabel pwLabel = new JLabel("���� :");
		JTextField pwTxt = new JTextField();
		JButton registerBtn = new JButton("ע��");
		JButton loginBtn = new JButton("��½");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				executeLogin();
			}
		});
		// �����ȫ����ӵ�������
		contentPane.add(nameLabel);
		contentPane.add(nameTxt);
		contentPane.add(pwLabel);
		contentPane.add(pwTxt);
		contentPane.add(registerBtn);
		contentPane.add(loginBtn);
		// ���� setBounds(x,y,width,height) ����������ض�λ��
		// ��Ӧ�ĸ������ֱ�Ϊ : �����꣬�����꣬�����ȣ�����߶�
		nameLabel.setBounds(140, 100, 60, 35);
		nameTxt.setBounds(210, 100, 250, 35);
		pwLabel.setBounds(140, 160, 60, 35);
		pwTxt.setBounds(210, 160, 250, 35);
		loginBtn.setBounds(140, 220, 100, 35);
		registerBtn.setBounds(350, 220, 100, 35);
		// ������Ż�����ӵ���������ʾ
		getContentPane().add(contentPane);
	}
	
	public void executeLogin() {
		int state;
		User user = new User();
		user.setPhoneNum("13577888899");
		user.setPassword("dxp123456");
		state = user.login();
		if (state == 1) {
			Menu menu = new Menu();
			setContentPane(menu);
			setVisible(true);	
		}else if (state == -1) {
			this.lblv.setText("���˻�û��ע�ᣬ�������·�ע�ᰴť����ע����½");
		}else {
			this.lblv.setText("�������");
		}
		
	}
}
