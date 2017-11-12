package com.blueinker.bluetrans.module.mine;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.blueinker.bluetrans.R;

/**
 * Created by jesson on 2017/11/7.
 */

public class MineFragment extends Fragment {




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_mine,
                container, false);

        return rootView;
    }
    @Override
    public void onResume() {
        super.onResume();

//        ActionBarUtil.setCustomActionBar(getActivity(), getResources().getString(R.string.lockscreen_flow_data), true, true);
    }
}
