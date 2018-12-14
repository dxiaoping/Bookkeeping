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
		// 设置这个容器的布局方式是空布局
		contentPane.setLayout(null);
		// 初始化所需组件
		JLabel nameLabel = new JLabel("用户名 :");
		JTextField nameTxt = new JTextField();
		JLabel pwLabel = new JLabel("密码 :");
		JTextField pwTxt = new JTextField();
		JButton registerBtn = new JButton("注册");
		JButton loginBtn = new JButton("登陆");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				executeLogin();
			}
		});
		// 将组件全部添加到容器中
		contentPane.add(nameLabel);
		contentPane.add(nameTxt);
		contentPane.add(pwLabel);
		contentPane.add(pwTxt);
		contentPane.add(registerBtn);
		contentPane.add(loginBtn);
		// 调用 setBounds(x,y,width,height) 设置组件的特定位置
		// 对应四个参数分别为 : 横坐标，纵坐标，组件宽度，组件高度
		nameLabel.setBounds(140, 100, 60, 35);
		nameTxt.setBounds(210, 100, 250, 35);
		pwLabel.setBounds(140, 160, 60, 35);
		pwTxt.setBounds(210, 160, 250, 35);
		loginBtn.setBounds(140, 220, 100, 35);
		registerBtn.setBounds(350, 220, 100, 35);
		// 最后将这张画布添加到窗口中显示
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
			this.lblv.setText("该账户没有注册，请点击右下方注册按钮进行注册后登陆");
		}else {
			this.lblv.setText("密码错误");
		}
		
	}
}
