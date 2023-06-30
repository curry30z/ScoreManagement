package jdbc;

import java.sql.*;

public class DBConnection {

 public static final String driver = "com.mysql.jdbc.Driver";
 public static final String url = "jdbc:mysql://localhost:3306/cjxt?characterEncoding=utf8";
 public static final String username = "root";
 public static final String password = "303030";

 static{
     try {
         Class.forName(driver);
         System.out.println("驱动加载成功");
     } catch (ClassNotFoundException e) {
        System.out.println("驱动加载失败");
         e.printStackTrace();
     }
     }
     //连接数据库，静态
     public static Connection getConnection(){

         try {
             Connection con= DriverManager.getConnection(url,username,password);
             System.out.println("连接成功");
             return con;
         } catch (SQLException e) {
             System.out.println("连接失败");
             e.printStackTrace();
         }

            return null;

     }


    public static void closeConnection(ResultSet rs , PreparedStatement pst, Connection con){



         try {
             if(rs != null){
                 rs.close();
             }

            if(pst != null) {
                pst.close();
            }
            if(con != null);
             {
                 con.close();
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }




    }





}
