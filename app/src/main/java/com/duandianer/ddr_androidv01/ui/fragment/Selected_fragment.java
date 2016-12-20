/**
 * CopyRright (c)2016:   <短点>
 * Project:              <短点Android>
 * Module ID:            <>
 * Comments:  <精选Fragment>
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
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.aspsine.swipetoloadlayout.OnRefreshListener;
import com.duandianer.ddr_androidv01.R;
import com.duandianer.ddr_androidv01.ui.adapter.SelectedViewAdapter;
import com.duandianer.ddr_androidv01.ui.view.SelectedRefreshHeaderView;
import com.duandianer.ddr_androidv01.ui.view.SelectedRefreshView;
import com.duandianer.ddr_androidv01.ui.view.SelectedView;

public class Selected_fragment extends Fragment {

    private SelectedView mContentView;
    private SelectedViewAdapter mAdapter;
    private SelectedRefreshView mRefreshLayoutView;
    private SelectedRefreshHeaderView mHeaderView;
    private View mView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mView == null) {
            mView = inflater.inflate(R.layout.selected_fragment_layout, null);
            mContentView = (SelectedView) mView.findViewById(R.id.swipe_target);
            mRefreshLayoutView = (SelectedRefreshView) mView.findViewById(R.id.select_refresh_view);
            mHeaderView = (SelectedRefreshHeaderView) mView.findViewById(R.id.swipe_refresh_header);
            setContentView();
            setRefreshLayoutView();
            updateUI();
        }
        ViewGroup viewGroup = (ViewGroup) mView.getParent();
        if (viewGroup != null)
            viewGroup.removeView(mView);
        return mView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void updateUI() {
        mAdapter = new SelectedViewAdapter(getActivity());
        mContentView.setAdapter(mAdapter);
    }

    private void setContentView() {
        mContentView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    private void setRefreshLayoutView() {
        mRefreshLayoutView.setRefreshHeaderView(mHeaderView);
        mRefreshLayoutView.setRefreshEnabled(true);
        mRefreshLayoutView.setRefreshCompleteDelayDuration(2000);
        mRefreshLayoutView.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                mRefreshLayoutView.setRefreshing(false);
            }
        });
    }
}
