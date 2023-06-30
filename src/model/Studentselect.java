package model;

import java.util.Date;

public class Studentselect {

    private String sname;
    private float score;
    private   String cname;
    private String tname;
    private  int cscore;
    private Date date;

    public Studentselect(String sname, float score, String cname, String tname, int cscore, Date date) {
        this.sname = sname;
        this.score = score;
        this.cname = cname;
        this.tname = tname;
        this.cscore = cscore;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Studentselect{" +
                "sname='" + sname + '\'' +
                ", score=" + score +
                ", cname='" + cname + '\'' +
                ", tname='" + tname + '\'' +
                ", cscore=" + cscore +
                ", date=" + date +
                '}';
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getCscore() {
        return cscore;
    }

    public void setCscore(int cscore) {
        this.cscore = cscore;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
