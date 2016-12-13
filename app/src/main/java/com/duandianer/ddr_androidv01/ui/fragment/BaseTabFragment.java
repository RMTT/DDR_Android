package com.duandianer.ddr_androidv01.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public abstract class BaseTabFragment extends Fragment {
    protected abstract View CreatView();

    private View mView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(mView == null)
            mView = CreatView();
        ViewGroup viewGroup = (ViewGroup) mView.getParent();
        if(viewGroup != null)
            viewGroup.removeView(mView);
        return mView;
    }
}
