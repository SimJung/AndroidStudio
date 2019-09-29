package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

public class SubActivity extends AppCompatActivity{
    MyView m;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        m = new MyView(this);
        Intent intent = getIntent();
        m.bit = (Bitmap)intent.getParcelableExtra("img");
        setContentView(m);

    }
}
