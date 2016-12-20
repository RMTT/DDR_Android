/**
 * CopyRright (c)2016:   <短点>
 * Project:              <短点Android>
 * Module ID:            <>
 * Comments:  <视频信息类>
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
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 12/13/2016.
 */

public class VideoMessage {
    private String title;
    private String classification;

    private Uri picture;

    private double time;

    public VideoMessage() {
        new VideoMessage(null, null, 0, null);
    }

    public VideoMessage(@Nullable String title, @Nullable String classification, double time, @Nullable Uri picture) {
        this.title = title;
        this.classification = classification;
        this.time = time;
        this.picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public VideoMessage setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getClassification() {
        return classification;
    }

    public VideoMessage setClassification(String classification) {
        this.classification = classification;
        return this;
    }

    public double getTime() {
        return time;
    }

    public VideoMessage setTime(double time) {
        this.time = time;
        return this;
    }

    public Uri getPicture() {
        return picture;
    }

    public VideoMessage setPicture(Uri picture) {
        this.picture = picture;
        return this;
    }
}
