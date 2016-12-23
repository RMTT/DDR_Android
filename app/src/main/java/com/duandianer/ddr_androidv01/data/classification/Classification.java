package com.duandianer.ddr_androidv01.data.classification;

import android.net.Uri;

/**
 * Created by Administrator on 12/21/2016.
 */

public class Classification {
    private Uri mUri;
    private String mTitle;

    public Classification(String url, String title) {
        this.mTitle = title;
        this.mUri = Uri.parse(url);
    }

    public Uri getUri() {
        return mUri;
    }

    public Classification setUri(Uri mUri) {
        this.mUri = mUri;
        return this;
    }

    public String getTitle() {
        return mTitle;
    }

    public Classification setTitle(String mTitle) {
        this.mTitle = mTitle;
        return this;
    }
}
