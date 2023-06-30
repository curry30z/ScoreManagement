package model;

public class Choosec {


    private String cno;
    private int tId;
    private  int sId;
    private int time;
    private float score;
    private  String year;

    @Override
    public String toString() {
        return "Choosec{" +
                "cno='" + cno + '\'' +
                ", tId=" + tId +
                ", sId=" + sId +
                ", time=" + time +
                ", score=" + score +
                ", year='" + year + '\'' +
                '}';
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Choosec(String cno, int tId, int sId, int time, float score, String year) {
        this.cno = cno;
        this.tId = tId;
        this.sId = sId;
        this.time = time;
        this.score = score;
        this.year = year;
    }
}
