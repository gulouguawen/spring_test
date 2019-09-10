package com.spring.pojo;

public class User {

    private String username;
    private String password;

    public User() {
        System.out.println("Init User...");
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("username = "+username+"\npassword = "+password);
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
}
