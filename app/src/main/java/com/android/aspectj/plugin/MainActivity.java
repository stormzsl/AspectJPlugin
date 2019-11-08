package com.android.aspectj.plugin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.aspectj.test.TestInclude;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Person person=new Person();
        person.setName("test person");

        TestInclude testInclude=new TestInclude();
        testInclude.setPwd("test pwd");
    }
}
