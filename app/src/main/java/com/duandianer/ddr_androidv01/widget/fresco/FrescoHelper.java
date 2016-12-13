/**
 * CopyRright (c)2016:   <短点>
 * Project:              <短点Android>
 * Module ID:            <>
 * Comments:  <Fresco助手类>
 * JDK version used:      <JDK1.6>
 * Author：        <@奔跑的MT>
 * Create Date：  <2016-12-13>
 * Modified By：   <@奔跑的MT>
 * Modified Date:  <2016-12-13>
 * Why & What is modified  <修改原因描述>
 * Version:                  <V0.1>
 */

package com.duandianer.ddr_androidv01.widget.fresco;

import android.content.Context;

import com.facebook.drawee.backends.pipeline.Fresco;

public class FrescoHelper {
    public static void init(Context context){
        Fresco.initialize(context);
    }
}
