package com.yuyang.ykview;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;

/**
 * Author: yuyang
 * Date:2019/4/7 23:06
 */
public class Tools {

    public static void hideView(ViewGroup view) {
        hideView(view, 0);
    }



    public static void showView(ViewGroup view) {
        showView(view, 0);
    }



    public static void hideView(ViewGroup view, int startOffset) {

//        RotateAnimation ra = new RotateAnimation(0,180,
//                  view.getWidth()/2,view.getHeight());
//
//     //  ScaleAnimation sa = new ScaleAnimation()
//        ra.setDuration(500);//设置动画播放持续的时间
//        ra.setFillAfter(true);//动画停留在播放完成的状态
//        ra.setStartOffset(startOffset);//延迟多久后播放动画
//        view.startAnimation(ra);
//
//        for(int i = 0;i<view.getChildCount();i++){
//            View children = view.getChildAt(i);
//            children.setEnabled(false);
//        }
//        //设置不可以点击
//        view.setEnabled(false);


        ObjectAnimator animator = ObjectAnimator.ofFloat(view,"rotation",0,180);
        animator.setDuration(500);
        animator.setStartDelay(startOffset);
        animator.start();

        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getHeight());

    }

    public static void showView(ViewGroup view, int startOffset) {

        ObjectAnimator animator = ObjectAnimator.ofFloat(view,"rotation",180,360);
        animator.setDuration(500);
        animator.setStartDelay(startOffset);
        animator.start();

        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getHeight());

    }
}
