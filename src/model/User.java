package model;

public class User {
       private int uId;
        private String uName;
        private String password;
        private int clazz;
        private int State;

    public User(int uId, String uName, String password) {
        this.uId = uId;
        this.uName = uName;
        this.password = password;
    }

    public User(){

        }

    public User(int uId) {
        this.uId = uId;
    }

    public User(String uName, String password, int clazz, int state) {
        this.uName = uName;
        this.password = password;
        this.clazz = clazz;
        State = state;
    }

    public String getPassword() {
        return password;
    }

    public int getState() {
        return State;
    }

    public User(int uId, String uName, String password, int clazz, int state) {
        this.uId = uId;
        this.uName = uName;
        this.password = password;
        this.clazz = clazz;
        State = state;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", password='" + password + '\'' +
                ", clazz=" + clazz +
                ", State=" + State +
                '}';
    }

    public void setState(int state) {
        State = state;
    }

    public int getClazz() {
        return clazz;
    }

    public void setClazz(int clazz) {
        this.clazz = clazz;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }
}
