package com.example.roterdam;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import android.view.Gravity;
public class Dossier extends Fragment {
    private TableLayout tableLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        Context context = getActivity().getApplicationContext();
        View view = inflater.inflate(R.layout.fragment_dossier, container, false);

        Button create_file_button = (Button) view.findViewById(R.id.button4);
        create_file_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CreateFileActivity.class);
                startActivity(intent);
            }
        });

        Button  table_row_1 = (Button) view.findViewById(R.id.table_row_1);
        table_row_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DossierInfoActivity.class);
                startActivity(intent);
            }
        });

//        table_row_1
    //        tableLayout = (TableLayout) view.findViewById(R.id.table_dossiers);
//
//        for (int i = 3; i < 5; i++) {
//            TableRow tableRow = new TableRow(context);
//            tableRow.setLayoutParams(new LayoutParams(
//                    LayoutParams.MATCH_PARENT,
//                    LayoutParams.WRAP_CONTENT));
//            tableRow.setBackgroundResource(R.drawable.table_head_row_border);
//            tableRow.setGravity(Gravity.CENTER);
//            tableRow.setPadding(0, 0, 0, 1);
//
//
//            for (int j = 0; j < 4; j++) {
//                TextView text = new TextView(context);
//
//                text.setLayoutParams(new LinearLayout.LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f));
//                text.setBackgroundResource(R.drawable.table_head_row_border);
//                text.setGravity(Gravity.CENTER);
//                text.setText("sadasd");
//                text.setId(i + j);
//
//
//
//
//                tableRow.addView(text, j);
//            }
//            tableLayout.addView(tableRow, i);
//        }
        return view;
    }

}