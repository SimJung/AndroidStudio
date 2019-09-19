package com.company.jungsim.prac0605_first;

import android.content.Intent;
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
        button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, OneActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "1번 페이지로 이동합니다", Toast.LENGTH_LONG).show();
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TwoActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "2번 페이지로 이동합니다", Toast.LENGTH_LONG).show();
            }
        });
    }


}
