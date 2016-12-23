/**
 * CopyRright (c)2016:   <短点>
 * Project:              <短点Android>
 * Module ID:            <>
 * Comments:  <个人中心Fragment>
 * JDK version used:      <JDK1.6>
 * Author：        <@奔跑的MT>
 * Create Date：  <2016-12-03>
 * Modified By：   <@奔跑的MT>
 * Modified Date:  <2016-12-03>
 * Why & What is modified  <修改原因描述>
 * Version:                  <V0.1>
 */
package com.duandianer.ddr_androidv01.ui.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.duandianer.ddr_androidv01.R;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;


public class My_fragment extends Fragment {
    private View mView;
    private SimpleDraweeView mPhotoView;
    private TextView mUsernameView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mView == null) {
            mView = LayoutInflater.from(getActivity()).inflate(R.layout.my_fragment_layout, null);
            mPhotoView = (SimpleDraweeView) mView.findViewById(R.id.my_photo);
            mUsernameView = (TextView) mView.findViewById(R.id.my_username_text);
            setUsername("奔跑的MT");
            setPhoto(Uri.parse("http://img4.imgtn.bdimg.com/it/u=736866795,1344239347&fm=23&gp=0.jpg"));
        }

        ViewGroup parent = (ViewGroup) mView.getParent();
        if (parent != null)
            parent.removeView(mView);
        return mView;
    }

    private void setPhoto(Uri uri) {
        configPhoto();
        mPhotoView.setImageURI(uri);
    }

    private void setUsername(String username) {
        mUsernameView.setText(username);
    }

    private void configPhoto() {
        RoundingParams params = RoundingParams.fromCornersRadius(7f);
        params.setRoundAsCircle(true);
        mPhotoView.getHierarchy().setRoundingParams(params);
    }
}
