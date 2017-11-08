package com.blueinker.bluetrans.main;


import com.blueinker.bluetrans.R;
import com.blueinker.bluetrans.module.mine.Mine1Fragment;
import com.blueinker.bluetrans.module.mine.MineFragment;

/**
 * Created by Jesson_Yi on 2016/4/14.
 */
public enum MainTab {

    NEWS(0, R.string.main_tab_name_me, R.drawable.mine_tabbar_selecter,
            MineFragment.class),
    ME(1, R.string.main_tab_name_me1, R.drawable.mine_tabbar_selecter,
            Mine1Fragment.class);

    private int idx;
    private int resName;
    private int resIcon;
    private Class<?> clz;

    private MainTab(int idx, int resName, int resIcon, Class<?> clz) {
        this.idx = idx;
        this.resName = resName;
        this.resIcon = resIcon;
        this.clz = clz;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getResName() {
        return resName;
    }

    public void setResName(int resName) {
        this.resName = resName;
    }

    public int getResIcon() {
        return resIcon;
    }

    public void setResIcon(int resIcon) {
        this.resIcon = resIcon;
    }

    public Class<?> getClz() {
        return clz;
    }

    public void setClz(Class<?> clz) {
        this.clz = clz;
    }
}
