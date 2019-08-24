package com.itheima.domain;

public class UserInfo {
    private Integer uid;
    private String username;
    private String sex;
    private String uBirthday;
    private String uAddress;

    public UserInfo() {
    }

    public UserInfo(Integer uid, String username, String sex, String uBirthday, String uAddress) {
        this.uid = uid;
        this.username = username;
        this.sex = sex;
        this.uBirthday = uBirthday;
        this.uAddress = uAddress;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getuBirthday() {
        return uBirthday;
    }

    public void setuBirthday(String uBirthday) {
        this.uBirthday = uBirthday;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", uBirthday='" + uBirthday + '\'' +
                ", uAddress='" + uAddress + '\'' +
                '}';
    }
}
