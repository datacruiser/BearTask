package com.datacruiser.beartask.entity;


import java.io.Serializable;

public class User implements Serializable{

    @Override
    public String toString() {
        return "User [loginId=" + loginId + ", name=" + name + ", password="
                + pwd;
    }

    private String loginId; // 主键登陆ID
    private String name; // 用户姓名
    private String pwd; // 密码

    public void setName(String name) {
        this.name = name;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getPwd() {
        return pwd;
    }


}
