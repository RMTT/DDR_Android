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
        new VideoMessage(null, null, 0);
    }

    public VideoMessage(@Nullable String title, @Nullable String classification, double time) {
        this.title = title;
        this.classification = classification;
        this.time = time;
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
