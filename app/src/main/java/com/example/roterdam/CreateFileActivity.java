package com.example.roterdam;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CreateFileActivity extends AppCompatActivity {


    int CURRENT_FRAGMENT = 1;
//    FragmentTransaction fTrans =  getSupportFragmentManager().beginTransaction();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_file);
        if (savedInstanceState == null) {
//             при первом запуске программы
            FragmentTransaction fTrans =  getSupportFragmentManager().beginTransaction();
            fTrans.add(R.id.container_for_fragment, new CreateFile1Fragment())
                    .commit();
        }


        Button button = findViewById(R.id.continue_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CURRENT_FRAGMENT == 1){
                FragmentTransaction fTrans =  getSupportFragmentManager().beginTransaction();
                fTrans.replace(R.id.container_for_fragment, new CreateFile2Fragment())
                            .commit();
                    CURRENT_FRAGMENT = 2;
                } else if (CURRENT_FRAGMENT == 2){
                FragmentTransaction fTrans =  getSupportFragmentManager().beginTransaction();
                fTrans.replace(R.id.container_for_fragment, new CreateFile3Fragment())
                        .commit();
                CURRENT_FRAGMENT = 3;
                } else if (CURRENT_FRAGMENT == 3){
                    FragmentTransaction fTrans =  getSupportFragmentManager().beginTransaction();
                    fTrans.replace(R.id.container_for_fragment, new CreateFile4Fragment())
                            .commit();
                    CURRENT_FRAGMENT = 4;
                }
                else if (CURRENT_FRAGMENT == 4){
                    FragmentTransaction fTrans =  getSupportFragmentManager().beginTransaction();
                    fTrans.replace(R.id.container_for_fragment, new CreateFile5Fragment())
                            .commit();
                    CURRENT_FRAGMENT = 5;
                }
                else if (CURRENT_FRAGMENT == 5){
                    FragmentTransaction fTrans =  getSupportFragmentManager().beginTransaction();
                    fTrans.replace(R.id.container_for_fragment, new CreateFile6Fragment())
                            .commit();
                    CURRENT_FRAGMENT = 6;
                }
            }
        });

        ImageButton back_button = findViewById(R.id.imageButtonBack);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CURRENT_FRAGMENT == 1) {
                    onBackPressed();
                    CURRENT_FRAGMENT = 1;
                }else
                if (CURRENT_FRAGMENT == 2){
                    FragmentTransaction fTrans =  getSupportFragmentManager().beginTransaction();
                    fTrans.replace(R.id.container_for_fragment, new CreateFile1Fragment())
                            .commit();
                    CURRENT_FRAGMENT = 1;
                } else if (CURRENT_FRAGMENT == 3){
                    FragmentTransaction fTrans =  getSupportFragmentManager().beginTransaction();
                    fTrans.replace(R.id.container_for_fragment, new CreateFile2Fragment())
                            .commit();
                    CURRENT_FRAGMENT = 2;
                } else if (CURRENT_FRAGMENT == 4){
                    FragmentTransaction fTrans =  getSupportFragmentManager().beginTransaction();
                    fTrans.replace(R.id.container_for_fragment, new CreateFile3Fragment())
                            .commit();
                    CURRENT_FRAGMENT = 3;
                }
                else if (CURRENT_FRAGMENT == 5){
                    FragmentTransaction fTrans =  getSupportFragmentManager().beginTransaction();
                    fTrans.replace(R.id.container_for_fragment, new CreateFile4Fragment())
                            .commit();
                    CURRENT_FRAGMENT = 4;
                }
                else if (CURRENT_FRAGMENT == 6){
                    FragmentTransaction fTrans =  getSupportFragmentManager().beginTransaction();
                    fTrans.replace(R.id.container_for_fragment, new CreateFile5Fragment())
                            .commit();
                    CURRENT_FRAGMENT = 5;
                }
            }
        });
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

}
