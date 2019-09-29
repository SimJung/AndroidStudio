package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawable);

        Intent intent = new Intent(this.getIntent());
        String s = intent.getStringExtra("text");
        TextView textView = (TextView)findViewById(R.id.textview);
        textView.setText(s);

        Button btn = (Button)findViewById(R.id.mainBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(SubActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
    }
}
