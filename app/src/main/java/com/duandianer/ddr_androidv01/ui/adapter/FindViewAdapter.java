package com.duandianer.ddr_androidv01.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.duandianer.ddr_androidv01.R;
import com.duandianer.ddr_androidv01.data.classification.ClassificationMessage;

/**
 * Created by Administrator on 12/21/2016.
 */

public class FindViewAdapter extends RecyclerView.Adapter<FindViewHoder> {
    private Context mContext;

    public FindViewAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public FindViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.find_item_view, null);
        return new FindViewHoder(view);
    }

    @Override
    public void onBindViewHolder(FindViewHoder holder, int position) {
        holder.setInfo(position);
    }

    @Override
    public int getItemCount() {
        return ClassificationMessage.getCount();
    }
}
