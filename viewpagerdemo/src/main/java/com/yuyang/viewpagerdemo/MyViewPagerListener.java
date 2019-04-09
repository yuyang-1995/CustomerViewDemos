package com.yuyang.viewpagerdemo;

import android.support.v4.view.ViewPager;
import android.util.Log;

/**
 * Author: yuyang
 * Date:2019/4/9 13:39
 */
public class MyViewPagerListener implements ViewPager.OnPageChangeListener {


    /**
     * 当页面滚动了的时候回调这个方法
     * @param position 当前页面的位置
     * @param positionOffset 滑动页面的百分比
     * @param positionOffsetPixels 在屏幕上滑动的像数
     */
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//        int realPosition = position%imageViews.size();
//        Log.e(TAG, "onPageSelected==" + realPosition );
//        //设置对应页面的文本信息
//        tv_title.setText(imageDescriptions[realPosition]);
//
//        //把上一个高亮的设置默认-灰色
//        ll_point_group.getChildAt(prePosition).setEnabled(false);
//        //当前的设置为高亮-红色
//        ll_point_group.getChildAt(realPosition).setEnabled(true);
//
//        prePosition = realPosition;

    }

    /**
     * 当某个页面被选中了的时候回调
     * @param position 被选中页面的位置
     */
    @Override
    public void onPageSelected(int position) {

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
