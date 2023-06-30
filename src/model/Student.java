package model;

public class Student {

    private int sId;
    private   String Name;
    private String Sex;
    private String phone;
    private  String cId;
    private  int uId;

    public Student(String name, String sex, String phone, String cId, int uId) {
        Name = name;
        Sex = sex;
        this.phone = phone;
        this.cId = cId;
        this.uId = uId;
    }

    public Student(int sId, String name, String sex, String phone, String cId, int uId) {
        this.sId = sId;
        Name = name;
        Sex = sex;
        this.phone = phone;
        this.cId = cId;
        this.uId = uId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", Name='" + Name + '\'' +
                ", Sex='" + Sex + '\'' +
                ", phone='" + phone + '\'' +
                ", cId='" + cId + '\'' +
                ", uId=" + uId +
                '}';
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }
}
