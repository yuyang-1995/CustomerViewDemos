package com.yuyang.viewpagerdemo;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Author: yuyang
 * Date:2019/4/9 12:41
 */
public class MyPagerAdapter extends PagerAdapter {

    ArrayList<TextView>  arrayList_textView = new ArrayList<>();


      public MyPagerAdapter(){ }

      public MyPagerAdapter(ArrayList<TextView> arrayList_textView){
             super();
             this.arrayList_textView = arrayList_textView;
    }

    /**
     * 得到数据总数，即pager总数
     * 获得viewpager中有多少个view
     * @return
     */
    @Override
    public int getCount() {
        //return arrayList_textView.size();
        return Integer.MAX_VALUE;
    }


    /**
     * 比较view和object是否同一个实例
     * @param view 页面
     * @param object  这个方法instantiateItem返回的结果
     * @return
     * 判断instantiateItem(ViewGroup, int)函数所返回来的Key与一个页面视图是否是
     * 代表的同一个视图(即它俩是否是对应的，对应的表示同一个View),通常我们直接写 return view == object!
     */
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return  view == object;
    }


    /**
     * 释放资源
     * @param container viewpager
     * @param position 要释放的位置
     * @param object 要释放的页面
     *   移除一个给定位置的页面。适配器有责任从容器中删除这个视图。
     *   这是为了确保在finishUpdate(viewGroup)返回时视图能够被移除。
     */
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View) object);
    }


    /**
     * 相当于getView方法
     * @param container ViewPager自身
     * @param position 当前实例化页面的位置
     * @return①将给定位置的view添加到ViewGroup(容器)中,创建并显示出来
     *        ②返回一个代表新增页面的Object(key),通常都是直接返回view本身就可以了,当然你也可以 自定义自己的key,但是key和每个view要一一对应的关系
     */
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        int realPosition = position%arrayList_textView.size();
        TextView textView = arrayList_textView.get(realPosition);  //得到position上的View
        container.addView(textView);   //添加到容器中
        return textView;   //返回

    }
}
