package com.managMoney.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.managMoney.data.ConnentOrcl;

public class LoginConfirm {
	
	 // 创建一个数据库连接
    Connection connection = null;
    // 创建预编译语句对象，一般都是用这个而不用Statement
    PreparedStatement pstm = null;
    // 创建一个结果集对象
    ResultSet rs = null;
    ConnentOrcl dbs = new ConnentOrcl();
    public int retutnState;
    /**
     * @param phoneNumView
     * @param psdView
     * @return 状态码 -1：用户不存在 ；0：密码错误；1：登陆成功
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
//	                	System.out.println("账号存在");
	                    if (password.equals(psdView)) {
	                        System.out.println("登陆成功");
	                        retutnState = 1;
	                        return;
	                    }
	                    System.out.println("密码错误");
	                    retutnState = 0;
	                    return;
	                }
	            }
	            System.out.println("用户不存在");
	            retutnState = -1;
	            return;
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            dbs.ReleaseResource();
	        }
	    }
}
