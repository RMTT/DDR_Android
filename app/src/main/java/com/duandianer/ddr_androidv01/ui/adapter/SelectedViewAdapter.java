package com.duandianer.ddr_androidv01.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.duandianer.ddr_androidv01.R;
import com.duandianer.ddr_androidv01.data.banner.BannerMessage;
import com.duandianer.ddr_androidv01.data.video.VideoSet;
import com.duandianer.ddr_androidv01.ui.view.SelectedView;

public class SelectedViewAdapter extends SelectedView.Adapter<SelectedViewHolder> {
    public static final int TYPE_ITEM_VIEW = 1;
    public static final int TYPE_HAED_VIEW = 2;
    private Context mContext;

    public SelectedViewAdapter(Context context) {
        mContext = context;
    }

    @Override
    public SelectedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_ITEM_VIEW) {
            View item = LayoutInflater.from(mContext).inflate(R.layout.item_selected_layout, null);
            return new SelectedViewHolder(item);
        } else if (viewType == TYPE_HAED_VIEW) {
            BannerMessage.Test();
            View header = LayoutInflater.from(mContext).inflate(R.layout.selected_banner_view, null);
            return new SelectedViewHolder(true, header);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(SelectedViewHolder holder, int position) {
        if (position != 0)
            holder.setInfo(VideoSet.Videos.get(position - 1));
    }

    @Override
    public int getItemCount() {
        return VideoSet.getVideoCount() + 1;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0)
            return TYPE_HAED_VIEW;
        else
            return TYPE_ITEM_VIEW;
    }
}
