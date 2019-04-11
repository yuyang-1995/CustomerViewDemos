package com.yuyang.scrollertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MyImageView iv_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_main = (MyImageView) findViewById(R.id.iv_main);
    }

    public void scrollLeft(View v) {
        iv_main.scrollBy(10, 0);
        Log.e("TAG", iv_main.getScrollX() + "-");
    }

    public void scrollRight(View v) {
        iv_main.scrollBy(-10, 0);
        Log.e("TAG", iv_main.getScrollX() + "-");
    }

    public void scrollUp(View v) {
        iv_main.scrollBy(0, 10);
        Log.e("TAG", iv_main.getScrollX() + "-");
    }

    public void scrollDown(View v) {
        iv_main.scrollBy(0, -10);
        Log.e("TAG", iv_main.getScrollX() + "-");
    }

    public void reset1(View v) {
        iv_main.scrollTo(0, 0);
    }

    public void reset2(View v) {
        iv_main.reset();
    }
}
