package model;

public class Teacher {
    private int tId;
    private String Name;
    private String Phone;
    private String Sex;
    private int uId;
    private String Department;

    public Teacher(String name, String phone, String sex, int uId, String department) {
        Name = name;
        Phone = phone;
        Sex = sex;
        this.uId = uId;
        Department = department;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tId=" + tId +
                ", Name='" + Name + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Sex='" + Sex + '\'' +
                ", uId=" + uId +
                ", Department='" + Department + '\'' +
                '}';
    }

    public Teacher(int tId, String name, String phone, String sex, int uId, String department) {
        this.tId = tId;
        Name = name;
        Phone = phone;
        Sex = sex;
        this.uId = uId;
        Department = department;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}