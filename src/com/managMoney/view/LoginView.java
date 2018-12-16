package com.managMoney.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.managMoney.entity.User;
import com.managMoney.viewtest.Menu_hello;


public class LoginView extends JFrame {

    private JPanel contentPane;
    private JLabel lblv = new JLabel();
    private JTextField textField;
    private JPasswordField JPasswordField;

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

        JLabel lblNewLabel_1 = new JLabel("欢迎使用");
        lblNewLabel_1.setForeground(new Color(255, 250, 240));
        lblNewLabel_1.setFont(new Font("叶根友毛笔行书2.0版", Font.BOLD, 30));
        lblNewLabel_1.setBounds(148, 22, 138, 51);
        panel.add(lblNewLabel_1);

        JLabel label_1 = new JLabel("小型学生理财系统");
        label_1.setForeground(new Color(255, 245, 238));
        label_1.setFont(new Font("叶根友毛笔行书2.0版", Font.BOLD, 28));
        label_1.setBounds(90, 83, 262, 36);
        panel.add(label_1);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(245, 245, 245));
        panel_1.setBounds(0, 156, 427, 148);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel = new JLabel("手机号");
        lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
        lblNewLabel.setBounds(84, 24, 47, 26);
        panel_1.add(lblNewLabel);

        JLabel label = new JLabel("密码");
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

        lblv.setForeground(Color.RED);
        lblv.setFont(new Font("宋体", Font.PLAIN, 14));
        lblv.setBounds(94, 80, 189, 21);
        panel_1.add(lblv);


        JButton button = new JButton("登陆");
        button.setBackground(new Color(211, 211, 211));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                executeLogin();
            }
        });
        button.setBounds(100, 106, 73, 23);
        button.setBorder(BorderFactory.createRaisedBevelBorder());
        panel_1.add(button);

        JButton button_1 = new JButton("注册");
        button_1.setBackground(new Color(211, 211, 211));
        button_1.setBounds(254, 106, 73, 23);
        button_1.setBorder(BorderFactory.createRaisedBevelBorder());
        panel_1.add(button_1);
    }

    public void executeLogin() {
        int state;
        User user = new User();
        user.setPhoneNum("13577888899");
        user.setPassword("dxp123456");
        state = user.login();
        if (state == 1) {
            setBounds(100, 100, 738, 480);
            Menu menu = new Menu();
            setContentPane(menu);
            setVisible(true);
        } else if (state == -1) {
            this.lblv.setText("该账户没有注册,请先注册");
        } else {
            this.lblv.setText("密码错误");
        }
    }
}
