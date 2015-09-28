package com.ktdid.accessibilitydemo;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        Button defaultAccessBtn = (Button) rootView.findViewById(R.id.default_access_btn);
        defaultAccessBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchDefaultAccessScreen();
            }
        });

        Button withAccessBtn = (Button) rootView.findViewById(R.id.with_access_btn);
        withAccessBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchWithAccessScreen();
            }
        });

        return rootView;
    }

    public void launchDefaultAccessScreen() {
        Intent intent = new Intent(getActivity(), DefaultAccessibilityActivity.class);
        startActivity(intent);
    }

    public void launchWithAccessScreen() {
        Intent intent = new Intent(getActivity(), WithAccessibilityActivity.class);
        startActivity(intent);
    }
}
