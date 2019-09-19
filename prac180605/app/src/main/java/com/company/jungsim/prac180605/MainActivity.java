package com.company.jungsim.prac180605;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    SoundPool soundf;
    int tom;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundf = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        tom = soundf.load(this, R.raw.hitt, 1);

        btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundf.play(tom, 1, 1, 0, 0, 1);
            }
        });
    }
}
