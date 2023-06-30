package model;

public class ClassScore {

    private String claName ;
    private String coursName;
    private float avgScore;

    @Override
    public String toString() {
        return "ClassScore{" +
                "claName='" + claName + '\'' +
                ", coursName='" + coursName + '\'' +
                ", avgScore=" + avgScore +
                '}';
    }

    public String getClaName() {
        return claName;
    }

    public void setClaName(String claName) {
        this.claName = claName;
    }

    public String getCoursName() {
        return coursName;
    }

    public void setCoursName(String coursName) {
        this.coursName = coursName;
    }

    public float getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }

    public ClassScore(String claName, String coursName, float avgScore) {
        this.claName = claName;
        this.coursName = coursName;
        this.avgScore = avgScore;
    }
}
