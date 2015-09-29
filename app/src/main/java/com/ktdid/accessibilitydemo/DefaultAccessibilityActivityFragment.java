package com.ktdid.accessibilitydemo;

import android.support.v4.app.Fragment;
import android.support.design.widget.TextInputLayout;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

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

        ImageView imageView = (ImageView) rootView.findViewById(R.id.rainbow_pixel_image);
        Button buttonOne = (Button) rootView.findViewById(R.id.button_one);
        CheckBox checkBox = (CheckBox) rootView.findViewById(R.id.checkbox);
        TextView checkBoxTextView = (TextView) rootView.findViewById(R.id.checkbox_tv);
        TextInputLayout textInputLayout = (TextInputLayout) rootView.findViewById(R.id.text_input_layout);
        EditText editTextOne = (EditText) rootView.findViewById(R.id.input_one_et);
        TextInputLayout textInputLayoutTwo = (TextInputLayout) rootView.findViewById(R.id.text_input_layout_two);
        EditText editTextTwo = (EditText) rootView.findViewById(R.id.input_two_et);

        return rootView;
    }


}
