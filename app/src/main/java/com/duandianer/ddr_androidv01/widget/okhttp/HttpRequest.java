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

import java.io.IOException;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class HttpRequest {
    private static OkHttpClient mClient; // OkHttp客户端

    // 单一变量原则，获取客户端
    private static void creatClient() {
        mClient = Client.getClient();
    }

    /**
     * HTTP GET 操作类
     */
    public static class GET {
        /**
         * 同步GET操作
         *
         * @param url:需要请求的url
         * @throws IOException 返回值: 响应体中的内容
         */
        public static String SynchronousGet(String url) throws IOException {
            creatClient();

            Request request = new Request.Builder()
                    .url(url)
                    .build();
            Response response = mClient.newCall(request).execute();

            return response.body().string();
        }

        /**
         * 异步GET操作
         *
         * @param url:需要请求的url
         * @param callback 回调接口
         *
         * @throws IOException
         */
        public static void AsynchronousGet(String url, Callback callback) throws IOException {
            creatClient();

            Request request = new Request.Builder()
                    .url(url)
                    .build();
            mClient.newCall(request).enqueue(callback);
        }
    }

    /**
     * HTTP Post 操作类
     */
    public static class POST {
        /**
         * 同步Post操作
         *
         * @param url:需要请求的url
         * @param body:请求体
         *
         * @throws IOException
         */
        public static String SynchronousPost(String url, RequestBody body) throws IOException {
            creatClient();

            Request request = new Request.Builder()
                    .url(url)
                    .post(body)
                    .build();

            Response response = mClient.newCall(request).execute();

            return response.body().string();
        }

        /**
         * 异步Post操作
         *
         * @param url:需要请求的url
         * @param  callback: 回调接口
         * @param body:请求体
         */
        public static void AsynchronousPost(String url,RequestBody body,Callback callback){
            creatClient();

            Request request = new Request.Builder()
                    .url(url)
                    .post(body)
                    .build();

            mClient.newCall(request).enqueue(callback);
        }
    }
}
