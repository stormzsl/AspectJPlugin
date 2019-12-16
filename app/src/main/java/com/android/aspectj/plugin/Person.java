package com.android.aspectj.plugin;

import com.method.consume.MethodConsume;

/**
 * 作者:created by storm on 2019-11-08
 */

public class Person {

    private String name;

    public String getName() {
        return name;
    }

    @MethodConsume
    public void setName(String  name) {
        System.out.println("setName11111");
        this.name = name;
        System.out.println("setName2222");
    }
}
