package model;

public class Classes {

    private String cId;
   private String cName;
    private   String Major;
    private  String Department;

    @Override
    public String toString() {
        return "Classes{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", Major='" + Major + '\'' +
                ", Department='" + Department + '\'' +
                '}';
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Classes(String cId, String cName, String major, String department) {
        this.cId = cId;
        this.cName = cName;
        Major = major;
        Department = department;
    }
}
