package model;

import javax.xml.crypto.Data;
import java.util.Date;

public class CoursScore {

    private  String Name;
    private  long id;
    private  float score;
    private Date date;
    private String cname;
    private  int cscore;

    @Override
    public String toString() {
        return "CoursScore{" +
                "Name='" + Name + '\'' +
                ", id=" + id +
                ", score=" + score +
                ", date=" + date +
                ", cname='" + cname + '\'' +
                ", cscore=" + cscore +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCscore() {
        return cscore;
    }

    public void setCscore(int cscore) {
        this.cscore = cscore;
    }

    public CoursScore(String name, long id, float score, Date date, String cname, int cscore) {
        Name = name;
        this.id = id;
        this.score = score;
        this.date = date;
        this.cname = cname;
        this.cscore = cscore;
    }
}
