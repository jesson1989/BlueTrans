package com.blueinker.bluetrans.main;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

import com.blueinker.bluetrans.R;
import com.blueinker.bluetrans.utils.ViewUtils;
import com.blueinker.bluetrans.widget.MyFragmentTabHost;

/**
 * Created by jesson on 2017/11/7.
 */

public class MainActivity extends AppCompatActivity {

    private MyFragmentTabHost mTabHost;
    private int tabPadding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        tabPadding = (int)ViewUtils.dp2px(this,50f);
        mTabHost=(MyFragmentTabHost)findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        initTabs();
        TextView tv = (TextView)findViewById(R.id.tv_time);
        Drawable drawable = this.getResources().getDrawable(
                R.drawable.mine_tabbar_selecter, null);

        tv.setCompoundDrawablesWithIntrinsicBounds(null,drawable,null,null);
        tv.setText("发布");

    }

    private void initTabs() {
        MainTab[] tabs = MainTab.values();
        final int size = tabs.length;
        for (int i = 0; i < size; i++) {
            MainTab mainTab = tabs[i];
            TabHost.TabSpec tab = mTabHost.newTabSpec(getString(mainTab.getResName()));
            View indicator = LayoutInflater.from(getApplicationContext())
                    .inflate(R.layout.tab_indicator, null);
            TextView title = (TextView) indicator.findViewById(R.id.tab_title);
            if(i==0){
                title.setPadding(0,0,tabPadding,0);
            }else{
                title.setPadding(tabPadding,0,0,0);
            }
            Drawable drawable = this.getResources().getDrawable(
                    mainTab.getResIcon(), null);
            title.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
            title.setText(getString(mainTab.getResName()));
            tab.setIndicator(indicator);
            mTabHost.addTab(tab, mainTab.getClz(), null);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }





}
