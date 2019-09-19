package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random dice = new Random();
                int result = dice.nextInt(6) + 1;
                tv.setText(String.valueOf(result));
            }
        });
    }

    public void init() {
        tv = (TextView)findViewById(R.id.tvResult);
        btn = (Button)findViewById(R.id.rollBtn);
    }
}
