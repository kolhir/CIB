package com.example.roterdam;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class Home extends Fragment {

    int CURRENT_BLOCK = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        Context context = getActivity().getApplicationContext();
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Button create_file_button = (Button) view.findViewById(R.id.button_submit_new_dossier);
        create_file_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CreateFileActivity.class);
                startActivity(intent);
            }
        });

        FragmentManager fragmentManager = getFragmentManager();
        final FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container_for_fragment, new CollectionsFragment()).commit();

        final RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.radioGroup);
        final RadioButton RadioButton1 = (RadioButton) view.findViewById(R.id.radio_1);
        final RadioButton RadioButton2 = (RadioButton) view.findViewById(R.id.radio_2);
        final RadioButton RadioButton3 = (RadioButton) view.findViewById(R.id.radio_3);
        final RadioButton RadioButton4 = (RadioButton) view.findViewById(R.id.radio_4);
        final RadioButton RadioButton5 = (RadioButton) view.findViewById(R.id.radio_5);


        final TextView text_view = (TextView) view.findViewById(R.id.mainTextView);

        ImageButton right_button = view.findViewById(R.id.block_right);
        right_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final FragmentTransaction fragmentTrans = getChildFragmentManager().beginTransaction();
                if (CURRENT_BLOCK == 1) {
                    fragmentTrans.replace(R.id.container_for_fragment, new FinancialFragment())
                            .commit();
                    radioGroup.clearCheck();
                    RadioButton2.setChecked(true);
                    text_view.setText("Financial information");
                    CURRENT_BLOCK = 2;
                }
                else if (CURRENT_BLOCK == 2) {
                    fragmentTrans.replace(R.id.container_for_fragment, new NewFilesFragment())
                            .commit();
                    radioGroup.clearCheck();
                    RadioButton3.setChecked(true);
                    text_view.setText("New files");
                    CURRENT_BLOCK = 3;

                }
                else if (CURRENT_BLOCK == 3){
                    fragmentTrans.replace(R.id.container_for_fragment, new ClosedFileFragment())
                            .commit();
                    radioGroup.clearCheck();
                    RadioButton4.setChecked(true);
                    text_view.setText("Closed files");
                    CURRENT_BLOCK = 4;
                } else if (CURRENT_BLOCK == 4){
                    fragmentTrans.replace(R.id.container_for_fragment, new FileNumbersFragment())
                            .commit();
                    radioGroup.clearCheck();
                    RadioButton5.setChecked(true);
                    text_view.setText("File numbers");
                    CURRENT_BLOCK = 5;
                }

            }
        });

        ImageButton left_button = view.findViewById(R.id.block_left);
        left_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final FragmentTransaction fragmentTrans = getChildFragmentManager().beginTransaction();
                if (CURRENT_BLOCK == 2) {
                    fragmentTrans.replace(R.id.container_for_fragment, new CollectionsFragment())
                            .commit();
                    radioGroup.clearCheck();
                    RadioButton1.setChecked(true);
                    text_view.setText("Collection");
                    CURRENT_BLOCK = 1;
                }
                else if (CURRENT_BLOCK == 3) {
                    fragmentTrans.replace(R.id.container_for_fragment, new FinancialFragment())
                            .commit();
                    radioGroup.clearCheck();
                    RadioButton2.setChecked(true);
                    text_view.setText("Financial information");
                    CURRENT_BLOCK = 2;

                }
                else if (CURRENT_BLOCK == 4){
                    fragmentTrans.replace(R.id.container_for_fragment, new NewFilesFragment())
                            .commit();
                    radioGroup.clearCheck();
                    RadioButton3.setChecked(true);
                    text_view.setText("New files");
                    CURRENT_BLOCK = 3;
                } else if (CURRENT_BLOCK == 5){
                    fragmentTrans.replace(R.id.container_for_fragment, new ClosedFileFragment())
                            .commit();
                    radioGroup.clearCheck();
                    RadioButton4.setChecked(true);
                    text_view.setText("Closed files");
                    CURRENT_BLOCK = 4;
                }

            }
        });

        return view;
    }



}
