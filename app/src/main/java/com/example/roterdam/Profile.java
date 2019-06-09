package com.example.roterdam;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Profile extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Context context = getActivity().getApplicationContext();
        View view = inflater.inflate(R.layout.fragment_profile, container, false);


        Button persinfo = (Button) view.findViewById(R.id.pers_info_button);
        persinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), PersInfoActivity.class);
                startActivity(intent);
            }
        });
        Button contractinfo = (Button) view.findViewById(R.id.contract_info_button);
        contractinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ContractInfoActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }


}
