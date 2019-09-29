package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SubActivity extends AppCompatActivity{
    MyView m;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        m = new MyView(this);
        setContentView(m);

    }
}
