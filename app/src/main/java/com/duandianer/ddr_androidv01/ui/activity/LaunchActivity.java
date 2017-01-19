package com.duandianer.ddr_androidv01.ui.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.duandianer.ddr_androidv01.R;
import com.facebook.drawee.interfaces.SimpleDraweeControllerBuilder;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by durong on 17-1-7.
 */

public class LaunchActivity extends BaseActivity {

    private SimpleDraweeView mBackground;
    private TextView mContentView;

    private static final long DelayTime = 1000 * 3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_layout);

        mBackground = (SimpleDraweeView) findViewById(R.id.launch_background);
        mContentView = (TextView) findViewById(R.id.launch_content);

        initDisplay();
        LoadBackground();
        initContent();
        Delay();
    }


    private void LoadBackground() {
        mBackground.setImageURI(Uri.parse("http://img4.duitang.com/uploads/item/201512/21/20151221130724_AmZ4M.thumb.700_0.jpeg"));
    }

    private void initDisplay() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    private void initContent() {
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/STXingkai.ttf");
        mContentView.setTypeface(typeface);
    }

    private void Delay() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(LaunchActivity.this, HomePageActivity.class);
                startActivity(intent);
                finish();
            }
        }, DelayTime);

    }
}
