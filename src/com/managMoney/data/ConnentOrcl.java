package com.managMoney.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
public class ConnentOrcl {
	private static String USERNAMR = "xiaoping";
    private static String PASSWORD = "xiaoping";
    private static String DRVIER = "oracle.jdbc.OracleDriver";
    private static String URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
    
    // 创建一个数据库连接
    Connection connection = null;
    // 创建预编译语句对象，一般都是用这个而不用Statement
    PreparedStatement pstm = null;
    // 创建一个结果集对象
    ResultSet rs = null;
    
   
    /**
     * 注册时添加用户
     * @param phoneNum
     * @param psd
     * @param name
     */
    public void addUser(String phoneNum,String psd,String name) {
        connection = getConnection();
        // String sql =
        // "insert into student values('1','王小军','1','17','北京市和平里七区30号楼7门102')";
        String sql = "select count(*) from user_info where 1 = 1";
        String sqlStr = "insert into user_info values(?,?,?)";
        int count = 0;

        try {
            // 计算数据库student表中数据总数
            pstm = connection.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1) + 1;
                System.out.println(rs.getInt(1));
            }
            // 执行插入数据操作
            pstm = connection.prepareStatement(sqlStr);
            
            pstm.setString(1, phoneNum);
            pstm.setString(2, psd);
            pstm.setString(3, name);
//            pstm.setInt(4, age);
//            pstm.setString(5, address);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ReleaseResource();
        }
    }
    /**
     * 向数据库中查询数据(登陆验证)
     */
    public void SelectData(String phoneNumView,String psdView) {
        connection = getConnection();
        String table = "user_info"; 
        String sql = ("SELECT PHONE_NUM,PSD,USER_NAME FROM " + table);
        try {
            pstm = connection.prepareStatement(sql);
            rs = pstm.executeQuery();
            System.out.println(rs);
//            while (rs.next()) {
//                String phoneNum = rs.getString("phone_num");
//                String name = rs.getString("user_name");
//                String password = rs.getString("psd");
//                System.out.println(phoneNum + "\t" + password + "\t"
//                        + name);
//                if (phoneNum == phoneNumView) {
//					if(password == psdView) {
//						System.out.println("登陆成功");
//					}
//					System.out.println("密码错误");
//				}else if(!rs.next()){
//					System.out.println("用户不存在");
//				}
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ReleaseResource();
        }
    }
    
    /**
     * 获取Connection对象
     * 
     * @return
     */
    public Connection getConnection() {
        try {
            Class.forName(DRVIER);
            connection = DriverManager.getConnection(URL, USERNAMR, PASSWORD);
            System.out.println("成功连接数据库");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("class not find !", e);
        } catch (SQLException e) {
            throw new RuntimeException("get connection error!", e);
        }

        return connection;
    }
    
    /**
     * 释放资源
     */
    public void ReleaseResource() {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstm != null) {
            try {
                pstm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnentOrcl dbs = new ConnentOrcl();
		dbs.SelectData("1357788788","dxp123456");
//	    dbs.addUser("1357788788", "dxp123456", "小五");
	}

}
