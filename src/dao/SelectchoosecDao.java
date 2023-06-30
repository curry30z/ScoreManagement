package dao;

import com.mysql.jdbc.Connection;
import jdbc.DBConnection;
import model.ClassScore;
import model.CoursScore;
import model.User;
import sun.rmi.runtime.NewThreadAction;

import javax.xml.crypto.Data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class SelectchoosecDao {




    public  float selectupdateScore(long sId,String cId,String uName){
        Connection con = (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs=null;
        String sql="select * from choosec natural  join teacher left join user on teacher.uId=user.uId " +
                "WHERE sId = ? AND cno = ? and uName=? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1,sId);
            ps.setString(2,cId);
            ps.setString(3,uName);
            rs=ps.executeQuery();
            if(rs.next()){

                return rs.getFloat(5);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.closeConnection(rs, ps, con);
        }

        return 0;
    }


    public boolean updateScoreBysIdAndcId(long sId,String cId,float score){

        Connection con = (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        String sql="UPDATE choosec SET score =?,time=NOW() WHERE sId = ? AND cno = ? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setFloat(1,score);
            ps.setLong(2,sId);
            ps.setString(3,cId);

            int reslut =ps.executeUpdate();
            return  reslut>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.closeConnection(null,ps,con);
        }


        return false;





    }




    public List<CoursScore> selectName(String sname,String uname) {


        Connection con = (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        User user=null;
        String sql = "select student.Name,student.sId,choosec.score,course.cName,course.cScore,choosec.time FROM " +
                "user " +
                "natural JOIN  teacher natural JOIN  choosec natural JOIN course  left join student" +
                " on choosec.sId = student.sId " +
                " where user.uName=? and student.Name LIKE ?";



        ArrayList<CoursScore> list = new ArrayList<>();
        ResultSet rs = null;
        try {

            ps = con.prepareStatement(sql);
           ps.setString(1,uname);
          ps.setString(2,"%"+sname+"%");

            rs = ps.executeQuery();
            while (rs.next()) {
                 String Name= rs.getString(1);
                  long id=rs.getLong(2);
                 float score=rs.getFloat(3);
                 Date date= rs.getDate(6);
                String cname=rs.getString(4);
                  int cscore=rs.getInt(5);
                CoursScore coursScore=new CoursScore(Name,id,score,date,cname,cscore);
                list.add(coursScore);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(rs, ps, con);
        }
        return list;



    }

    public List<ClassScore> getAllcalssAVG( String uname){
        Connection con = (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        User user=null;
        String sql="SELECT classes.cName,course.cName ,avg(choosec.score)  FROM user NATURAL JOIN teacher" +
                " NATURAL JOIN choosec NATURAL JOIN course LEFT JOIN student ON  choosec.sId = student.sId " +
                "LEFT JOIN " +
                " classes ON student.cId = classes.cId where user.uName=?  group by classes.cId ";
        ArrayList<ClassScore> list = new ArrayList<>();
        ResultSet rs=null;
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,uname);
            rs=ps.executeQuery();

            while (rs.next()){
                String claName =rs.getString(1);
                String coursName=rs.getString(2);
                float avgScore = rs.getFloat(3);
                ClassScore classScore=new ClassScore(claName,coursName,avgScore);
                list.add(classScore);


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.closeConnection(rs,ps,con);
        }


        return list;
    }





}
