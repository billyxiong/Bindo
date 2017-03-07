package com.bindo.util;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.SQLException;  
  
public class Mysql {  
    public static final String db_url = Constant.db_url;
    public static final String db_name = Constant.db_name; 
    public static final String db_user = Constant.db_user;
    public static final String db_password = Constant.db_password; 
  
    public Connection conn = null;  
    public PreparedStatement pst = null;  
  
    public Mysql(String sql) {  
        try {  
            Class.forName(db_name);//指定连接类型  
            conn = DriverManager.getConnection(db_url, db_user, db_password);//获取连接  
            pst = conn.prepareStatement(sql);//准备执行语句  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
  
    public void close() {  
        try {  
            this.conn.close();  
            this.pst.close();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }  
}  
