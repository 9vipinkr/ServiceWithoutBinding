package com.example.vipinkr.servicewithoutbinding;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    Button startButton;
    Button stopButton;
    TextView result;
    Intent intent;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_main, container, false);
        startButton=(Button)rootView.findViewById(R.id.Start);
        stopButton=(Button)rootView.findViewById(R.id.Stop);
        intent=new Intent(getActivity(),MyService.class);
        getActivity().startService(intent);



        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                getActivity().startService(intent);

            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().stopService(intent);
            }
        });

        return rootView;
    }


}
