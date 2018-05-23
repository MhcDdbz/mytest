package cn.itcast;


import java.util.Date;

public class User {
    private String username;

    private Date birthday;

    public User(String username, Date birthday) {
        this.username = username;
        this.birthday = birthday;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("hello world ~");


    }




}


