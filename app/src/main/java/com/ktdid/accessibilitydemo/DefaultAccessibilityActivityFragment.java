package com.ktdid.accessibilitydemo;

import android.support.v4.app.Fragment;
import android.support.design.widget.TextInputLayout;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class DefaultAccessibilityActivityFragment extends Fragment {

    public DefaultAccessibilityActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_default_accessibility, container, false);
        TextInputLayout textInputLayout = (TextInputLayout) rootView.findViewById(R.id.text_input_layout);
        return rootView;
    }
}
