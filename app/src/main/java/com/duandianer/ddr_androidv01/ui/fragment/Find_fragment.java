/**
 * CopyRright (c)2016:   <短点>
 * Project:              <短点Android>
 * Module ID:            <>
 * Comments:  <发现Fragment>
 * JDK version used:      <JDK1.6>
 * Author：        <@奔跑的MT>
 * Create Date：  <2016-12-03>
 * Modified By：   <@奔跑的MT>
 * Modified Date:  <2016-12-03>
 * Why & What is modified  <修改原因描述>
 * Version:                  <V0.1>
 */
package com.duandianer.ddr_androidv01.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.duandianer.ddr_androidv01.R;
import com.duandianer.ddr_androidv01.data.classification.ClassificationMessage;
import com.duandianer.ddr_androidv01.ui.adapter.FindViewAdapter;
import com.duandianer.ddr_androidv01.ui.view.FindView;


public class Find_fragment extends Fragment {

    private View mView;

    private FindView mContentView;
    private FindViewAdapter mAdapter;

    // TODO 优化布局，提高效率

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ClassificationMessage.Test();
        if (mView == null) {
            mView = inflater.inflate(R.layout.find_fragment_layout, null);
            mContentView = (FindView) mView.findViewById(R.id.find_content);
            setContentView();
            updateUI();
        }
        ViewGroup parent = (ViewGroup) mView.getParent();
        if (parent != null)
            parent.removeView(mView);
        return mView;
    }

    private void setContentView() {
        mContentView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
    }

    private void updateUI() {
        mAdapter = new FindViewAdapter(getActivity());
        mContentView.setAdapter(mAdapter);
    }
}
