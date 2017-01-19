package com.duandianer.ddr_androidv01.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.aspsine.swipetoloadlayout.SwipeRefreshTrigger;
import com.aspsine.swipetoloadlayout.SwipeTrigger;
import com.duandianer.ddr_androidv01.R;

/**
 * Created by Administrator on 12/18/2016.
 */

public class SelectedRefreshHeaderView extends LinearLayout implements SwipeRefreshTrigger, SwipeTrigger {

    private String TAG = "Header";

    public SelectedRefreshHeaderView(Context context) {
        super(context);
        init();
    }

    public SelectedRefreshHeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SelectedRefreshHeaderView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        ViewGroup view = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.selected_header_view, null);
        addView(view);
    }

    @Override
    public void onRefresh() {
        Log.d(TAG, "onRefresh");
    }

    @Override
    public void onPrepare() {
        Log.d(TAG, "onPrepare");
    }

    @Override
    public void onMove(int i, boolean b, boolean b1) {
        Log.d(TAG, "onMove   " + i);
    }

    @Override
    public void onRelease() {
        Log.d(TAG, "onRelease");
    }

    @Override
    public void onComplete() {
        Log.d(TAG, "onComplete");
    }

    @Override
    public void onReset() {
        Log.d(TAG, "onReset");
    }
}
