package com.duandianer.ddr_androidv01.ui.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

import com.duandianer.ddr_androidv01.data.banner.BannerMessage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class BannerView extends ViewPager {

    private static final int AUTO_SCROLL = 1001;

    private Handler mHander;

    private ScheduledExecutorService mScheduledExecutorService;

    public BannerView(Context context) {
        super(context);
    }

    public BannerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onPageScrolled(int position, float offset, int offsetPixels) {
        super.onPageScrolled(position, offset, offsetPixels);
    }

    public void autoStart() {
        mHander = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                if (msg.what == AUTO_SCROLL) {
                    if (getCurrentItem() + 1 >= BannerMessage.getCount())
                        setCurrentItem(0, true);
                    else
                        setCurrentItem(getCurrentItem() + 1, true);
                }
            }
        };
        mScheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        mScheduledExecutorService.scheduleWithFixedDelay(new PagerTask(), 4, 4, TimeUnit.SECONDS);
    }

    private class PagerTask implements Runnable {
        @Override
        public void run() {
            Message message = mHander.obtainMessage();
            message.what = AUTO_SCROLL;
            mHander.sendMessage(message);
        }
    }
}
