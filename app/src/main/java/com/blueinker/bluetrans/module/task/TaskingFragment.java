package com.blueinker.bluetrans.module.task;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blueinker.bluetrans.R;

/**
 * Created by jesson on 2017/11/12.
 */

public class TaskingFragment extends Fragment {




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_tasking,
                container, false);

        return rootView;
    }
    @Override
    public void onResume() {
        super.onResume();
    }
}
