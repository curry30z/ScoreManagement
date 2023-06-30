package dao;

import jdbc.DBConnection;
import model.Student;
import model.Teacher;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IDUstudent {

    public  long selectstudentuid(Long sId ,String tName){
        Connection con= (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs=null;
        String sql="select uId from student where sId =? and Name=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setLong(1,sId);
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

    public  long selectstudentuidbyname(String tName){
        Connection con= (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs=null;
        String sql="select uId from student where  Name=?";
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


    public  long selectstudentuidbySID(long sid){
        Connection con= (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs=null;
        String sql="select uId from student where  sId=?";
        try {
            ps=con.prepareStatement(sql);

            ps.setLong(1,sid);
            rs = ps.executeQuery();
            if(rs.next()){
                return rs.getLong(1);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }





    public boolean deleteStudent(Long sId ,String tName)  {

        Connection con= (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        String sql="delete from student where sId =? and Name=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setLong(1,sId);
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

    public boolean insertStudent(Student student){
        Connection con= (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        String sql=" insert into student value (null,?,?,?,?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,student.getName());
            ps.setString(2,student.getSex());
            ps.setString(3,student.getPhone());
            ps.setString(4,student.getcId());
            ps.setInt(5,student.getuId());
            int reslut =ps.executeUpdate();
            return reslut>0;

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.closeConnection(null,ps,con);
        }


        return false;
    }


    public boolean updateStudemt(Student student) {
        com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        String sql="update student set  Name=? , Phone=?,  Sex=? ,cId=? where sId=? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,student.getName());
            ps.setString(2,student.getPhone());
            ps.setString(3,student.getSex());
             ps.setString(4,student.getcId());
            ps.setInt(5,student.getsId());

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
