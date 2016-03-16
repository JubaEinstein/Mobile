package com.example.msia.tabdedactiv;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by msia on 16/03/2016.
 */
public class PlaceholderFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle sevedInstanceState){
        View v =inflater.inflate(R.layout.fragment_main,null);
        TextView textView = (TextView) v.findViewById(R.id.section_label);
        Bundle bundle =getArguments();
        int i = bundle.getInt("pos");
        if (i==0){
            textView.setText("Fragment 0");
        }
        if (i==1){
            textView.setText("Fragment 1");
        }
        if (i==2){
            textView.setText("Fragment 2");
        }
        return v;
    }

}
