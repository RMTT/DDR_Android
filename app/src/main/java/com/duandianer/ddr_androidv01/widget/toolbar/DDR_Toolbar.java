package com.duandianer.ddr_androidv01.widget.toolbar;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 12/10/2016.
 */

public class DDR_Toolbar extends Toolbar {
    public DDR_Toolbar(Context context) {
        super(context);
    }

    public DDR_Toolbar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DDR_Toolbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
