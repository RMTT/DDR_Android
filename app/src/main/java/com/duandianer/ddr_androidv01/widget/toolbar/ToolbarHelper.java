/**
 * CopyRright (c)2016:   <短点>
 * Project:              <短点Android>
 * Module ID:            <>
 * Comments:  <Toolbar助手类>
 * JDK version used:      <JDK1.6>
 * Author：        <@奔跑的MT>
 * Create Date：  <2016-12-03>
 * Modified By：   <@奔跑的MT>
 * Modified Date:  <2016-12-03>
 * Why & What is modified  <修改原因描述>
 * Version:                  <V0.1>
 */
package com.duandianer.ddr_androidv01.widget.toolbar;


public class ToolbarHelper {
    public static DDR_Toolbar mToolbar;

    /**
     * 设置全局Toolbar
     *
     * @param toolbar:全局Toolbar对象
     */
    public static void setToolbar(DDR_Toolbar toolbar) {
        if (mToolbar == null)
            mToolbar = toolbar;
    }
}
