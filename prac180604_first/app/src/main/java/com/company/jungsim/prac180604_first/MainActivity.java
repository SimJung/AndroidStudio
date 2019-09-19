package com.company.jungsim.prac180604_first;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.daum.net"));
                startActivity(myIntent);
                Toast.makeText(getApplicationContext(),"웹 페이지 이동", Toast.LENGTH_SHORT).show();
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
                startActivity(myIntent);
                Toast.makeText(getApplicationContext(), "웹 페이지 이동", Toast.LENGTH_SHORT).show();
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://learn.inha.ac.kr"));
                startActivity(myIntent);
                Toast.makeText(getApplicationContext(), "웹 페이지 이동", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
