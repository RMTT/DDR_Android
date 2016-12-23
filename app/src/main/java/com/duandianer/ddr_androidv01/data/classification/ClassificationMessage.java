package com.duandianer.ddr_androidv01.data.classification;

import java.util.ArrayList;

/**
 * Created by Administrator on 12/21/2016.
 */

public class ClassificationMessage {
    private static ArrayList<Classification> ClassificationInfo;

    public static void setInfo(ArrayList<Classification> info) {
        if (ClassificationInfo == null)
            ClassificationInfo = new ArrayList<>();
        ClassificationInfo = info;
    }

    public static Classification get(int position) {
        return ClassificationInfo.get(position);
    }

    public static int getCount() {
        return ClassificationInfo.size();
    }

    public static void Test() {
        ArrayList<Classification> temp = new ArrayList<>();

        temp.add(new Classification("http://p8.qhimg.com/t0103bcbcf3d52111ee.png", "日漫"));
        temp.add(new Classification("http://www.cnii.com.cn/internetnews/img/attachement/jpg/site2/20131029/00016c58d8d513d9707008.jpg", "日漫"));
        temp.add(new Classification("http://images2.china.com/game/zh_cn/picnews/11128819/20141216/19114163_2014121615445382354200.jpg", "日漫"));
        temp.add(new Classification("http://img003.21cnimg.com/photos/album/20140521/m600/0D89791132E95C324C352A68876F13C3.jpeg", "日漫"));
        temp.add(new Classification("http://img003.21cnimg.com/photos/album/20140512/m600/FB443BD54E8D7F0154627174866706D1.jpg", "日漫"));
        temp.add(new Classification("http://img003.21cnimg.com/photos/album/20140804/m600/71E65C95551A66CE8626A982EE297759.jpeg", "日漫"));
        temp.add(new Classification("http://comic.people.com.cn/NMediaFile/2014/0310/MAIN201403101334000435073626117.jpg", "日漫"));
        temp.add(new Classification("http://img1.gtimg.com/gamezone/pics/hv1/151/79/1819/118300771.jpg", "日漫"));
        temp.add(new Classification("http://game.people.com.cn/NMediaFile/2015/0514/MAIN201505140844000559416434582.jpg", "日漫"));
        temp.add(new Classification("http://comic.people.com.cn/NMediaFile/2014/0109/MAIN201401091050212643127107613.jpg", "日漫"));
        temp.add(new Classification("http://game.people.com.cn/NMediaFile/2015/0514/MAIN201505140844000542924395460.jpg", "日漫"));
        temp.add(new Classification("http://game.people.com.cn/NMediaFile/2015/0514/MAIN201505140844000567035171372.jpg", "日漫"));
        temp.add(new Classification("http://img003.21cnimg.com/photos/game_0/20141005/c100-0-0-500-391_r0/670D68328E0FE240AD19EE66E1E71148.jpeg", "日漫"));
        setInfo(temp);
    }
}
