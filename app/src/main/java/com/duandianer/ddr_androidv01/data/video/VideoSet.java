/**
 * CopyRright (c)2016:   <短点>
 * Project:              <短点Android>
 * Module ID:            <>
 * Comments:  <视频集合类>
 * JDK version used:      <JDK1.6>
 * Author：        <@奔跑的MT>
 * Create Date：  <2016-12-03>
 * Modified By：   <@奔跑的MT>
 * Modified Date:  <2016-12-03>
 * Why & What is modified  <修改原因描述>
 * Version:                  <V0.1>
 */

package com.duandianer.ddr_androidv01.data.video;


import android.net.Uri;

import java.util.ArrayList;

/**
 * 获取视频，刷新视频信息等操作均在这里实现
 */
public class VideoSet {
    public static ArrayList<VideoMessage> Videos;

    public static void setVideos(ArrayList<VideoMessage> videos) {
        Videos = videos;
    }

    public static int getVideoCount() {
        return Videos.size();
    }

    public static ArrayList<VideoMessage> getVideos() {
        return Videos;
    }

    public static void Test() {
        Videos = new ArrayList<>();
        VideoMessage v = new VideoMessage("你的名字-星海诚", "日漫", 100.00, Uri.parse("http://bj.bcebos.com/bos-cyfun/c6dda7d6146304bb5e1bc0801ed94ccb.jpg"));
        Videos.add(v);

        VideoMessage v2 = new VideoMessage("女神-夜刀神十香", "日漫", 999, Uri.parse("http://a.hiphotos.baidu.com/baike/c0%3Dbaike60%2C5%2C5%2C60%2C20/sign=94cf21d959b5c9ea76fe0bb1b450dd65/9e3df8dcd100baa16d4550694510b912c9fc2ef2.jpg"));
        Videos.add(v2);

        VideoMessage v3 = new VideoMessage("永远的面码", "日漫", 666, Uri.parse("http://img4.duitang.com/uploads/item/201511/24/20151124224553_Qyuwe.jpeg"));
        Videos.add(v3);

        VideoMessage v4 = new VideoMessage("纳兹觉醒", "日漫", 666, Uri.parse("http://s.qdcdn.com/cl/10332277,800,450.jpg"));
        Videos.add(v4);
        Videos.add(v2);
        Videos.add(v);
        Videos.add(v3);
        Videos.add(v4);
        Videos.add(v);
        Videos.add(v2);
        Videos.add(v3);
        Videos.add(v4);
    }
}
