package com.ktdid.accessibilitydemo;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.design.widget.TextInputLayout;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class WithAccessActivityFragment extends Fragment {

    public WithAccessActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_default_accessibility, container, false);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.rainbow_pixel_image);
        Button buttonOne = (Button) rootView.findViewById(R.id.button_one);
        LinearLayout rememberMeLinearLayout = (LinearLayout) rootView.findViewById(R.id.checkbox_layout);
        final CheckBox checkBox = (CheckBox) rootView.findViewById(R.id.checkbox);
        final TextView checkBoxTextView = (TextView) rootView.findViewById(R.id.checkbox_tv);
        TextInputLayout textInputLayout = (TextInputLayout) rootView.findViewById(R.id.text_input_layout);
        EditText editTextOne = (EditText) rootView.findViewById(R.id.input_one_et);
        TextInputLayout textInputLayoutTwo = (TextInputLayout) rootView.findViewById(R.id.text_input_layout_two);
        EditText editTextTwo = (EditText) rootView.findViewById(R.id.input_two_et);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBoxTextView.setContentDescription(getString(
                        isChecked ? R.string.remember_me_on_cd : R.string.remember_me_off_cd));
            }
        });

        // To set a context description to an "empty description, try the following!
        // checkBoxTextView.setContentDescription("\u00A0");

        // Set onClickListener to image in order to make it clickable and accessible
        // However, in this case, it's really not necessary to the user to be accessible
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            }
//        });
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}

