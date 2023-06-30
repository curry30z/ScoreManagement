package dao;

import jdbc.DBConnection;
import model.Teacher;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IDUteacher {

    public boolean insertTeacher(Teacher teacher){
        Connection con= (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        String sql=" insert into teacher value (null,?,?,?,?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,teacher.getName());
            ps.setString(2,teacher.getPhone());
            ps.setString(3,teacher.getSex());
            ps.setInt(4,teacher.getuId());
            ps.setString(5,teacher.getDepartment());
            int reslut =ps.executeUpdate();
            return reslut>0;

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.closeConnection(null,ps,con);
        }


        return false;
    }
    public  long selectTeacheruidByName(String tName){
        Connection con= (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs=null;
        String sql="select uId from teacher where Name=?";
        try {
            ps=con.prepareStatement(sql);

            ps.setString(1,tName);
            rs = ps.executeQuery();
            if(rs.next()){
                return rs.getLong(1);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public  long selectTeacheruidBytid(int tid){
        Connection con= (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs=null;
        String sql="select uId from teacher where tId=?";
        try {
            ps=con.prepareStatement(sql);

            ps.setInt(1,tid);
            rs = ps.executeQuery();
            if(rs.next()){
                return rs.getLong(1);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }








    public  long selectteacheruid(Long tId ,String tName){
        Connection con= (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs=null;
        String sql="select uId from teacher where tId =? and Name=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setLong(1,tId);
            ps.setString(2,tName);
             rs = ps.executeQuery();
            if(rs.next()){
                return rs.getLong(1);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }




    public boolean deleteTeacher(Long tId ,String tName)  {

        Connection con= (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        String sql="delete from teacher where tId =? and Name=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setLong(1,tId);
            ps.setString(2,tName);
            int result=ps.executeUpdate();
            return result>0;


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.closeConnection(null,ps,con);
        }







        return false;
    }

    public boolean updateTeacher(Teacher teacher ) {
        com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        String sql="update teacher set  Name=? , Phone=?,  Sex=? ,Department=? where tId=? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,teacher.getName());
            ps.setString(2,teacher.getPhone());
            ps.setString(3,teacher.getSex());
            ps.setString(4,teacher.getDepartment());
            ps.setInt(5,teacher.gettId());

            int reslut =ps.executeUpdate();
            return  reslut>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.closeConnection(null,ps,con);
        }


        return false;
    }











}
