package dao;

import com.mysql.jdbc.Connection;

import jdbc.DBConnection;
import model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UserDao implements Dao<User>{



    @Override
    public  boolean insert(User a) {
        //创建连接
        Connection con = (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        //写入sql语句
        String sql="insert into user values (null,?,?,?,?)  ";

        try {



            ps = con.prepareStatement(sql);

            ps.setString(1,a.getuName());
            ps.setString(2,a.getPassword());
            ps.setInt(3,a.getClazz());
            ps.setInt(4,a.getState());
            int reslut =ps.executeUpdate();
            System.out.println("添加成功");
            return reslut>0;


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.closeConnection(null,ps,con);
        }

        return false;
    }


        public int selectUid(String username,String password){
            Connection con = (Connection) DBConnection.getConnection();
            PreparedStatement ps = null;
            ResultSet rs=null;
            String sql="select uId from user where uName =? and password =?";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1,username);
                ps.setString(2,password);
                rs=ps.executeQuery();
                if(rs.next()){
                    int uid = rs.getInt(1);
                    return uid;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


            return 0;
        }

    @Override
    public boolean update(User a) {
        Connection con = (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        String sql="update user set uName =?,password =? where uId=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,a.getuName());
            ps.setString(2,a.getPassword());
            ps.setInt(3,a.getuId());
            int reslut =ps.executeUpdate();
            return  reslut>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.closeConnection(null,ps,con);
        }


        return false;
    }

    @Override
    public boolean delete(int id) {
        Connection con= (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        String sql="delete from user where uId =?";
        //写入sql语句

        try {



            ps = con.prepareStatement(sql);
            ps.setInt(1,id);

            int reslut =ps.executeUpdate();
            return reslut>0;


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.closeConnection(null,ps,con);
        }



        return false;
    }

    @Override
    public User select(int id) {
        Connection con= (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        String sql="select * from user where uId=?";
        User user = null;
        //写入sql语句

        try {



            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int uId=rs.getInt(1);
                String uName=rs.getString(2);
                 String password=rs.getString(3);
                int clazz=rs.getInt(4);
                 int State=rs.getInt(5);
                 user=new User(uId, uName, password,clazz,State);
            }


            return user;


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.closeConnection(null,ps,con);
        }



        return null;
    }


    public User selectPasswd(String uName) {
        Connection con = (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        User user=null;
        String sql = "select * from user where uName=? and State=1";
        ResultSet rs = null;
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,uName);
            rs=ps.executeQuery();
            if(rs.next()){
                   int uId=rs.getInt(1);
                   String uname=rs.getString(2);
                   String passwd=rs.getString(3);
                int a = rs.getInt(4);
                int b = rs.getInt(5);
                user=new User(uId, uname, passwd,a,b);
                return user;

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.closeConnection(rs,ps,con);

        }


        return null;
    }



    @Override
    public List<User> selectAll(int page,int pageSize) {

        Connection con = (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        User user=null;
        String sql = "select * from user LIMIT ?,? ";

        ArrayList<User> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            int start = (page-1)*pageSize;
            ps = con.prepareStatement(sql);

           ps.setInt(1,start);
           ps.setInt(2,pageSize);
            rs = ps.executeQuery();
            while (rs.next()) {
                   int uId=rs.getInt(1);
                    String uName = rs.getString(2);
                    String password = rs.getString(3);
                    int a = rs.getInt(4);
                    int b = rs.getInt(5);
                user = new User(uId, uName, password, a, b);
                list.add(user);
                return list;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(rs, ps, con);
        }


        return null;

    }
}
