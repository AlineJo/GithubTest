package com.alienjo.githubtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();


        //#1 Yousuf : hello , How are you ?
        // #2 rahma  : hello, fine
        // #3 github
        //#4 test

    }
}