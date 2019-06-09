package com.example.roterdam;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.zip.Inflater;


public class CreateFile2Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create_file2, container, false);


        Spinner spinner = (Spinner) view.findViewById(R.id.pricomspinner);
        String selected = spinner.getSelectedItem().toString();
//        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
//            public void onItemSelected(AdapterView<?> parent,
//                                       View itemSelected, int selectedItemPosition, long selectedId) {
//
//                LinearLayout compprylayout = (LinearLayout) parent.findViewById(R.id.for_company_layout);
//                compprylayout.setVisibility(View.VISIBLE);
//                String[] choose = getResources().getStringArray(R.array.private_company);
//                Toast toast = Toast.makeText(getActivity(),
//                        "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
//                toast.show();
//
//
//
//            }
//            public void onNothingSelected(AdapterView<?> parent) {
//            }
//        });

        OnItemSelectedListener itemSelectedListener = new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                View views = CreateFile2Fragment.super.getView();
                LinearLayout compprylayout = (LinearLayout) views.findViewById(R.id.for_company_layout);
                if (position == 1){
                    compprylayout.setVisibility(View.VISIBLE);
                } else {
                    compprylayout.setVisibility(View.INVISIBLE);
                }


                // Получаем выбранный объект
//                String[] choose = getResources().getStringArray(R.array.private_company);
//                Toast toast = Toast.makeText(getActivity(),
//                        "Ваш выбор: " + choose[position], Toast.LENGTH_SHORT);
//                toast.show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
        spinner.setOnItemSelectedListener(itemSelectedListener);



        return view;
    }


}
