package com.android.aspectj.test;

/**
 * 作者:created by storm on 2019-11-08
 */

public class TestInclude {

    private String pwd;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        System.out.println("setPwd 1111");
        this.pwd = pwd;
        System.out.println("setPwd 2222");

    }
}
