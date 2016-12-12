/**
 * CopyRright (c)2016:   <短点>
 * Project:              <短点Android>
 * Module ID:            <>
 * Comments:  <主页Activity>
 * JDK version used:      <JDK1.6>
 * Author：        <@奔跑的MT>
 * Create Date：  <2016-12-03>
 * Modified By：   <@奔跑的MT>
 * Modified Date:  <2016-12-03>
 * Why & What is modified  <修改原因描述>
 * Version:                  <V0.1>
 */
package com.duandianer.ddr_androidv01.ui.activity;


import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TabHost;
import android.widget.TabWidget;

import com.duandianer.ddr_androidv01.R;
import com.duandianer.ddr_androidv01.ui.fragment.Find_fragment;
import com.duandianer.ddr_androidv01.ui.fragment.My_fragment;
import com.duandianer.ddr_androidv01.ui.fragment.Selected_fragment;
import com.duandianer.ddr_androidv01.widget.toolbar.DDR_Toolbar;
import com.duandianer.ddr_androidv01.widget.toolbar.ToolbarHelper;

/**
 * 主页Activity
 */
public class HomePageActivity extends BaseActivity {

    private FragmentTabHost mFragmentTabHost;
    private TabWidget mTabWidget;

    private TabHost.TabSpec mSelected;
    private TabHost.TabSpec mFind;
    private TabHost.TabSpec mMy;

    private DDR_Toolbar mToolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home_page);

        setToolbar();
        initFragmentHost();
        initTabs();
    }

    /**
     * 设置Toolbar
     */
    private void setToolbar() {
        mToolbar = (DDR_Toolbar) findViewById(R.id.toolbar);
        ToolbarHelper.setToolbar(mToolbar);
    }

    /**
     * 初始化Tabs
     */
    private void initTabs() {
        mSelected = mFragmentTabHost.newTabSpec("selected").setIndicator(getView(R.layout.icon_selected));
        mFind = mFragmentTabHost.newTabSpec("find").setIndicator(getView(R.layout.icon_find));
        mMy = mFragmentTabHost.newTabSpec("my").setIndicator(getView(R.layout.icon_my));

        mFragmentTabHost.addTab(mSelected, Selected_fragment.class, null);
        mFragmentTabHost.addTab(mFind, Find_fragment.class, null);
        mFragmentTabHost.addTab(mMy, My_fragment.class, null);
        mTabWidget = mFragmentTabHost.getTabWidget();
        mTabWidget.setDividerDrawable(null);
    }

    /**
     * 初始化FragmentTabHost
     */
    private void initFragmentHost() {
        mFragmentTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mFragmentTabHost.setup(getApplicationContext(), getSupportFragmentManager(), android.R.id.tabcontent);
    }

    /**
     * 获取Tab
     *
     * @param id:Tab布局ID
     * @return View:TabView
     */
    private View getView(int id) {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(id, null);
        return view;
    }
}
