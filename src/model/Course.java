package model;

public class Course {

    private String cno;
    private  String cName;
    private  int cScore;
    private  String cClass;

    @Override
    public String toString() {
        return "Course{" +
                "cno='" + cno + '\'' +
                ", cName='" + cName + '\'' +
                ", cScore=" + cScore +
                ", cClass='" + cClass + '\'' +
                '}';
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getcScore() {
        return cScore;
    }

    public void setcScore(int cScore) {
        this.cScore = cScore;
    }

    public String getcClass() {
        return cClass;
    }

    public void setcClass(String cClass) {
        this.cClass = cClass;
    }

    public Course(String cno, String cName, int cScore, String cClass) {
        this.cno = cno;
        this.cName = cName;
        this.cScore = cScore;
        this.cClass = cClass;
    }
}
