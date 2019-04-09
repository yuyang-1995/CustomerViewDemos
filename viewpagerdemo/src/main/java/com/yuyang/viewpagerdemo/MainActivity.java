package com.yuyang.viewpagerdemo;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TextView textView;
    ArrayList<TextView> arrayList_textView = new ArrayList<>();
    MyOnPageChangeListener myOnPageChangeListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initList();
        initListener();

        //设置适配器
        MyPagerAdapter  myPagerAdapter = new MyPagerAdapter(arrayList_textView);
        viewPager.setAdapter(myPagerAdapter);

        //设置中间位置
        int item = Integer.MAX_VALUE/2 - Integer.MAX_VALUE/2%arrayList_textView.size();//要保证View的整数倍

        //初始化为中间页面
        viewPager.setCurrentItem(item);

        viewPager.addOnPageChangeListener(myOnPageChangeListener);
    }

    private void initListener() {

         myOnPageChangeListener = new MyOnPageChangeListener(arrayList_textView, textView);
    }

    private void initList() {

        for(int i=0; i<5; i++){

            TextView textView = new TextView(this);
            textView.setText("第" + i + "页");
            textView.setGravity(Gravity.CENTER);
            arrayList_textView.add(textView);
        }


    }

    private void initView() {

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        textView = (TextView) findViewById(R.id.tv_bottom);

    }





}
