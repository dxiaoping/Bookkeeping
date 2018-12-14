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
    
    // ����һ�����ݿ�����
    Connection connection = null;
    // ����Ԥ����������һ�㶼�������������Statement
    PreparedStatement pstm = null;
    // ����һ�����������
    ResultSet rs = null;
    
   
    /**
     * ע��ʱ����û�
     * @param phoneNum
     * @param psd
     * @param name
     */
    public void addUser(String phoneNum,String psd,String name) {
        connection = getConnection();
        // String sql =
        // "insert into student values('1','��С��','1','17','�����к�ƽ������30��¥7��102')";
        String sql = "select count(*) from user_info where 1 = 1";
        String sqlStr = "insert into user_info values(?,?,?)";
        int count = 0;

        try {
            // �������ݿ�student������������
            pstm = connection.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1) + 1;
                System.out.println(rs.getInt(1));
            }
            // ִ�в������ݲ���
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
     * �����ݿ��в�ѯ����(��½��֤)
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
//						System.out.println("��½�ɹ�");
//					}
//					System.out.println("�������");
//				}else if(!rs.next()){
//					System.out.println("�û�������");
//				}
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ReleaseResource();
        }
    }
    
    /**
     * ��ȡConnection����
     * 
     * @return
     */
    public Connection getConnection() {
        try {
            Class.forName(DRVIER);
            connection = DriverManager.getConnection(URL, USERNAMR, PASSWORD);
            System.out.println("�ɹ��������ݿ�");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("class not find !", e);
        } catch (SQLException e) {
            throw new RuntimeException("get connection error!", e);
        }

        return connection;
    }
    
    /**
     * �ͷ���Դ
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
//	    dbs.addUser("1357788788", "dxp123456", "С��");
	}

}
