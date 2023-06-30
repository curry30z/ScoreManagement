package dao;

import com.mysql.jdbc.Connection;
import jdbc.DBConnection;
import model.CoursScore;
import model.Studentselect;
import model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SelectStudentScore {


    public List<Studentselect> SelectALL(String uname){
        Connection con = (Connection) DBConnection.getConnection();
        PreparedStatement ps = null;
        Studentselect studentselect;
        String sql=" select student.Name,choosec.score,course.cName,teacher.Name,course.cScore,choosec.time  " +
                " FROM user LEFT JOIN student ON user.uId = student.uId  LEFT JOIN classes ON student.cId = classes.cId  " +
                "left join choosec on student.sId=choosec.sId left join course on choosec.cno=course.cno left join  " +
                "teacher  " +
                "on teacher.tId=choosec.tId " +
                "where  user.uName=? ";
        ArrayList<Studentselect> list = new ArrayList<>();
        ResultSet rs=null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, uname);
            rs=ps.executeQuery();
            while (rs.next()){
                 String sname =rs.getString(1);
                float score=rs.getFloat(2);
                   String cname=rs.getString(3);
                String tname=rs.getString(4);
                  int cscore=rs.getInt(5);
                 Date date=rs.getDate(6);
                 studentselect=new Studentselect(sname,score,cname,tname,cscore,date);
                 list.add(studentselect);


            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        DBConnection.closeConnection(rs, ps, con);
         }

         return list;



    }





}
