package com.managMoney.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.managMoney.data.ConnentOrcl;

public class LoginConfirm {
	
	 // ����һ�����ݿ�����
    Connection connection = null;
    // ����Ԥ����������һ�㶼�������������Statement
    PreparedStatement pstm = null;
    // ����һ�����������
    ResultSet rs = null;
    ConnentOrcl dbs = new ConnentOrcl();
    public int retutnState;
    /**
     * @param phoneNumView
     * @param psdView
     * @return ״̬�� -1���û������� ��0���������1����½�ɹ�
     */
	 public LoginConfirm(String phoneNumView, String psdView) {
	        connection = dbs.getConnection();
	        String table = "user_info";
	        String sql = ("SELECT PHONE_NUM,PSD,USER_NAME FROM " + table);
	        try {
	            pstm = connection.prepareStatement(sql);
	            rs = pstm.executeQuery();
	            while (rs.next()) {
	                String phoneNum = rs.getString("phone_num");
	                String name = rs.getString("user_name");
	                String password = rs.getString("psd");
//	                System.out.println(phoneNum + "\t" + password + "\t"
//	                        + name);
	                if (phoneNum.equals(phoneNumView)) {
//	                	System.out.println("�˺Ŵ���");
	                    if (password.equals(psdView)) {
	                        System.out.println("��½�ɹ�");
	                        retutnState = 1;
	                        return;
	                    }
	                    System.out.println("�������");
	                    retutnState = 0;
	                    return;
	                }
	            }
	            System.out.println("�û�������");
	            retutnState = -1;
	            return;
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            dbs.ReleaseResource();
	        }
	    }
}
