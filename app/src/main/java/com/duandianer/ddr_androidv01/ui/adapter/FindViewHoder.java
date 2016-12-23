package com.duandianer.ddr_androidv01.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.duandianer.ddr_androidv01.R;
import com.duandianer.ddr_androidv01.data.classification.ClassificationMessage;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by Administrator on 12/21/2016.
 */

public class FindViewHoder extends RecyclerView.ViewHolder {

    private View mView;
    private SimpleDraweeView mCoverView;
    private TextView mTitleView;

    public FindViewHoder(View itemView) {
        super(itemView);
        mView = itemView;

        mCoverView = (SimpleDraweeView) mView.findViewById(R.id.class_item);
        mTitleView = (TextView) mView.findViewById(R.id.class_title);
    }

    public void setInfo(int position) {
        mCoverView.setImageURI(ClassificationMessage.get(position).getUri());
        mTitleView.setText("#" + ClassificationMessage.get(position).getTitle());
    }
}
