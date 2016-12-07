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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/*
* 实现文件下载功能
*/
public class HTTPDownLoad {
    private static OkHttpClient mClient;

    /**
     * 同步下载操作
     *
     * @param url:  需要下载的文件地址
     * @param file: 文件保存的地方
     */
    public static void SynchronousDownLoad(String url, File file) throws IOException {
        mClient = Client.getClient();

        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = mClient.newCall(request).execute();

        InputStream is = null;
        byte[] buf = new byte[2048];
        int len = 0, sum = 0;
        FileOutputStream out = null;

        is = response.body().byteStream();
        long total = response.body().contentLength();

        out = new FileOutputStream(file);
        while ((len = is.read(buf)) != -1) {
            out.write(buf, 0, len);
            sum += len;
            System.out.println(sum + "/" + total);
        }
        if (is != null)
            is.close();
    }

    /**
     * 异步下载操作
     *
     * @param url:需要下载的地址
     * @param callback:   回调接口
     */
    public static void AsynchronousDownLoad(String url, Callback callback) {
        mClient = Client.getClient();

        Request request = new Request.Builder()
                .url(url)
                .build();

        mClient.newCall(request).enqueue(callback);
    }
}
