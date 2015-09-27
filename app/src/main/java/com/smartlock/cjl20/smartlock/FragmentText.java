package com.smartlock.cjl20.smartlock;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by neokree on 16/12/14.
 */
public class FragmentText extends Fragment {

    private int pos;

    public FragmentText(int pos) {
        this.pos = pos;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView text = new TextView(container.getContext());
        text.setText("Fragment content" + pos);
        text.setGravity(Gravity.CENTER);

        return text;
    }
}
