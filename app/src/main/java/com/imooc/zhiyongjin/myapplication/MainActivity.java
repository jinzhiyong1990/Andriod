package com.imooc.zhiyongjin.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

//创建MainActivity 类继承自Activity(界面类)
public class MainActivity extends Activity {

//    想要获取textview对象
//    第一步, 定义textview类, (根据xml布局文件中定义的控件类型)
    private TextView textView;

    @Override
//    重写Activity类的onCreate方法, 当前界面创建时被系统调用
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        设置内容视图(R.layout.activity_main)
//        为当前的Activity设置显示内容
        setContentView(R.layout.activity_main);
//        第二步, 通过findviewById方法获取控件对象(传入的内容为代表
//        控件的ID, 需要向下转型成对应控件类型
//        向下转型成textView
        textView = (TextView)findViewById(R.id.testView01);
        System.out.println("*********************是否获取成功" + textView +".");
//        动态设置控件属性
//        在xml文件定义的属性, 可以在java文件中覆盖, 变成现实java文件的内容

        textView.setText("Hello, Zhiyong!");
    }
}
