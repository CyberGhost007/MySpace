package com.notebook.idealabs.myspace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.notebook.idealabs.myspace.Utils.bottomnavviewhelper;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setupbottomnavview();
    }

    private void setupbottomnavview(){
        BottomNavigationViewEx bottomNavigationViewEx = findViewById(R.id.bottom_nav_bar);
        bottomnavviewhelper.setupbottomnavview(bottomNavigationViewEx);

    }
}
