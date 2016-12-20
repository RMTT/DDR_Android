package com.duandianer.ddr_androidv01.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.duandianer.ddr_androidv01.R;
import com.duandianer.ddr_androidv01.data.video.VideoMessage;
import com.duandianer.ddr_androidv01.ui.view.BannerView;
import com.duandianer.ddr_androidv01.ui.view.SelectedView;
import com.facebook.drawee.view.SimpleDraweeView;

public class SelectedViewHolder extends SelectedView.ViewHolder {
    private FrameLayout mContentView;
    private SimpleDraweeView CoverView;
    private TextView TitleView;
    private TextView InfoView;
    private BannerView mBannner;

    private Context mContext;

    public SelectedViewHolder(View itemView) {
        super(itemView);

        mContentView = (FrameLayout) itemView;
        CoverView = (SimpleDraweeView) mContentView.findViewById(R.id.video_cover);
        TitleView = (TextView) mContentView.findViewById(R.id.video_title);
        InfoView = (TextView) mContentView.findViewById(R.id.video_info);
    }

    public SelectedViewHolder(boolean header, View view) {
        super(view);
        LinearLayout linearLayout = (LinearLayout) view;
        mBannner = (BannerView) linearLayout.findViewById(R.id.banner);
        mBannner.setAdapter(new BannerAdapter());
        mBannner.autoStart();
    }

    public void setInfo(VideoMessage message) {
        CoverView.setImageURI(message.getPicture());
        TitleView.setText(message.getTitle());
        InfoView.setText("#" + message.getClassification() + " / " + message.getTime());
    }
}
