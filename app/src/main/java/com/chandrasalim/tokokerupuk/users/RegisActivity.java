package com.chandrasalim.tokokerupuk.users;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.chandrasalim.tokokerupuk.R;

public class RegisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);

        getSupportActionBar().hide();
    }
}
