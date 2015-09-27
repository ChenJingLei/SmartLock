package com.smartlock.cjl20.smartlock;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by cjl20 on 2015/9/27.
 * PROJECT_NAME by SmartLock
 */
public class FragmentDS extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.device_states_fm, container, false);
    }
}
