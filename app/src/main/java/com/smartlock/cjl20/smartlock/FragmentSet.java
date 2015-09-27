package com.smartlock.cjl20.smartlock;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.smartlock.cjl20.impl.Setting;

/**
 * Created by cjl20 on 2015/9/27.
 * PROJECT_NAME by SmartLock
 */
public class FragmentSet extends Fragment {
    private Button submit;
    private EditText ip_text;
    private EditText port_text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.setting_fm, container, false);
        submit = (Button) view.findViewById(R.id.submitBtn);
        port_text = (EditText) view.findViewById(R.id.port_text);
        ip_text = (EditText) view.findViewById(R.id.ip_text);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ip = ip_text.getText().toString();
                int port = Integer.parseInt(port_text.getText().toString());
                Setting.SetAddress(ip, port);
                Toast.makeText(getActivity(), "设置成功！！！", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }


}
