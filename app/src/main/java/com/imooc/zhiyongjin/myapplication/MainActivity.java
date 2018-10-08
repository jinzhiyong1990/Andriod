package com.imooc.zhiyongjin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//创建MainActivity 类继承自Activity(界面类)
public class MainActivity extends AppCompatActivity {

    @Override
//    重写Activity类的onCreate方法, 当前界面创建时被系统调用
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        设置内容视图(R.layout.activity_main)
//        为当前的Activity设置显示内容
        setContentView(R.layout.activity_main);
    }
}
