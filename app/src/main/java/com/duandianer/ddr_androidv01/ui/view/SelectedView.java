package com.duandianer.ddr_androidv01.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

import com.duandianer.ddr_androidv01.R;

public class SelectedView extends RecyclerView {

    public SelectedView(Context context) {
        super(context);
    }

    public SelectedView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SelectedView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
