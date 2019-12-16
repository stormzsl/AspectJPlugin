package com.android.aspectj.plugin;

import com.method.consume.MethodConsume;

/**
 * 作者:created by storm
 */

public class MethodConsumeTest {

    @MethodConsume
    public void testString(){
        String str=new String();
        for (int i = 0; i <1000 ; i++) {
            str+="hello";
        }
    }

    @MethodConsume
    public void testStringBuilder(){
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < 1000; i++) {
           stringBuilder.append("hello");
        }
    }
}
