package com.duandianer.ddr_androidv01.data.banner;

import android.net.Uri;

import java.util.ArrayList;

public class BannerMessage {
    private static ArrayList<Uri> BannerSet;

    public static Uri getBannerItem(int position) {
        return BannerSet.get(position);
    }

    public static void setBannerSet(ArrayList<Uri> bannerSet) {
        if (BannerSet == null)
            BannerSet = new ArrayList<>();
        BannerSet = bannerSet;
    }

    public static int getCount() {
        return BannerSet.size();
    }

    public static void Test() {
        BannerSet = new ArrayList<>();
        BannerSet.add(Uri.parse("http://img4.duitang.com/uploads/item/201312/14/20131214132733_GcJjt.thumb.600_0.jpeg"));
        BannerSet.add(Uri.parse("http://i2.hdslb.com/bfs/archive/cb00f1ae937a2d8c4b96ad2e94d5832ed20c2c5f.jpg"));
        BannerSet.add(Uri.parse("http://p8.qhimg.com/t0103bcbcf3d52111ee.png"));
        BannerSet.add(Uri.parse("http://i2.sinaimg.cn/gm/ol/nf2/zt/cgwr294/6.jpg"));
        BannerSet.add(Uri.parse("http://img1.gtimg.com/comic/pics/hv1/154/35/2031/132074854.jpg"));
        BannerSet.add(Uri.parse("http://img1.gtimg.com/ent/pics/hv1/247/229/2016/131149042.jpg"));
        BannerSet.add(Uri.parse("http://comic.qq.com/dangdang/pic_905x435_1.jpg"));
    }
}
