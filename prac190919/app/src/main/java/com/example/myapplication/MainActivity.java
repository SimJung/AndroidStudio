package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private Button btn;
    private Button switchBtn;
    private Bitmap bit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        takeScreenshot();
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random dice = new Random();
                int result = dice.nextInt(6) + 1;
                tv.setText(String.valueOf(result));
            }
        });

        switchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra("text", String.valueOf(tv.getText()));
                intent.putExtra("img", bit);

                startActivity(intent);
            }
        });
    }
    private void takeScreenshot() {
            View v1 = getWindow().getDecorView();
            v1.setDrawingCacheEnabled(true);
            Bitmap bitmap = v1.getDrawingCache();
            v1.setDrawingCacheEnabled(false);

            bit = bitmap;
    }

    public void init() {
        tv = (TextView)findViewById(R.id.tvResult);
        btn = (Button)findViewById(R.id.rollBtn);
        switchBtn = (Button)findViewById(R.id.drawBtn);
    }
}
