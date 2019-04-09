package com.yuyang.viewpagerdemo;

import android.support.v4.view.ViewPager;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Author: yuyang
 * Date:2019/4/9 19:46
 */
public class MyOnPageChangeListener implements ViewPager.OnPageChangeListener {

    ArrayList<TextView> arrayList_textView;
    TextView textView;

      public MyOnPageChangeListener(ArrayList<TextView> arrayList_textView, TextView textView){

        this.arrayList_textView = arrayList_textView;
        this.textView = textView;
    }
    /**
     * 当页面滚动了的时候回调这个方法
     * @param i 当前页面的位置
     * @param v 滑动页面的百分比
     * @param i1 在屏幕上滑动的像数
     */
    @Override
    public void onPageScrolled(int i, float v, int i1) {

    }

    /**
     * 当某个页面被选中了的时候回调
     * @param i 被选中页面的位置
     */
    @Override
    public void onPageSelected(int i) {
        int realPosition = i%arrayList_textView.size();

        textView.setText("第" + i + "页！");

    }

    /**
     当页面滚动状态变化的时候回调这个方法
     静止->滑动
     滑动-->静止
     静止-->拖拽
      */
    @Override
    public void onPageScrollStateChanged(int i) {


    }
}
