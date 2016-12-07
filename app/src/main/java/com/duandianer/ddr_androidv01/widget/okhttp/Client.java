/**
 * CopyRright (c)2016:   <短点>
 * Project:              <短点Android>
 * Module ID:            <>
 * Comments:  <常用的HTTP请求>
 * JDK version used:      <JDK1.6>
 * Author：        <@奔跑的MT>
 * Create Date：  <2016-12-03>
 * Modified By：   <@奔跑的MT>
 * Modified Date:  <2016-12-03>
 * Why & What is modified  <修改原因描述>
 * Version:                  <V0.1>
 */

package com.duandianer.ddr_androidv01.widget.okhttp;

import okhttp3.OkHttpClient;


public  class Client {
    private static OkHttpClient mClient;

    public static OkHttpClient getClient(){
        if(mClient == null)
            mClient = new OkHttpClient();
        return mClient;
    }
}
