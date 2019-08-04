package com.itheima.pojo;

/**
 * @Author LiuJunShi
 * @create 2019/8/3 9:24
 */
public class User {
    private String username ; //用户名
    private String password ; //密码
    private Integer age; //年龄
    private String number; //电话号码

    public User() {
    }

    public User(String username, String password, Integer age, String number) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.number = number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
