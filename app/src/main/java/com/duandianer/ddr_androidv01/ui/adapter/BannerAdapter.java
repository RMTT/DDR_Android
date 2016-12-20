package com.duandianer.ddr_androidv01.ui.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.duandianer.ddr_androidv01.R;
import com.duandianer.ddr_androidv01.application.MyApplication;
import com.duandianer.ddr_androidv01.data.banner.BannerMessage;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;


public class BannerAdapter extends PagerAdapter {
    private ArrayList<View> BannerContent;
    private View mView;

    private static int currentPosition;

    public BannerAdapter() {
    }

    @Override
    public int getCount() {
        return BannerMessage.getCount();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        mView = LayoutInflater.from(MyApplication.getContext()).inflate(R.layout.head_banner_view, null);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) mView.findViewById(R.id.banner_item);
        simpleDraweeView.setImageURI(BannerMessage.getBannerItem(position));

        ViewGroup parent = (ViewGroup) mView.getParent();
        if (parent != null)
            parent.removeView(mView);
        container.addView(mView);

        currentPosition = position;
        return mView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
    }

}
