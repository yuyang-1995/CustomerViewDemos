package com.yuyang.kaiguanview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Author: yuyang
 * Date:2019/4/9 23:26
 */
public class TView extends View {

    public TView(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }


    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
