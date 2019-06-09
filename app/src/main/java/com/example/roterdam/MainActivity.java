package com.example.roterdam;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.v7.app.ActionBar;
import android.view.View;
public class MainActivity extends AppCompatActivity {


    FragmentTransaction fTrans;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            fTrans = getSupportFragmentManager().beginTransaction();
            switch (item.getItemId()) {

                case R.id.navigation_setings:
                    fTrans.replace(R.id.container_for, new Settings())
                            .commit();
                    return true;

                case R.id.navigation_dossiers:
                    fTrans.replace(R.id.container_for, new Dossier())
                            .commit();
                    return true;

                case R.id.navigation_home:
                    fTrans.replace(R.id.container_for, new Home())
                            .commit();
                    return true;

                case R.id.navigation_tba:
                    fTrans.replace(R.id.container_for, new ContactFragment())
                            .commit();
                    return true;


                case R.id.navigation_persanal_info:
                    fTrans.replace(R.id.container_for, new Profile())
                            .commit();
                    return true;

            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        setContentView(R.layout.activity_main);
        fTrans = getSupportFragmentManager().beginTransaction();
        fTrans.replace(R.id.container_for, new Home())
                .commit();
//        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setSelectedItemId(R.id.navigation_home);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void Log_out(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
