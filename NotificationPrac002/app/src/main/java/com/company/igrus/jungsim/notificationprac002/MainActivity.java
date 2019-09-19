package com.company.igrus.jungsim.notificationprac002;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationManager notificationManager = (NotificationManager)MainActivity.this.getSystemService(MainActivity.this.NOTIFICATION_SERVICE);
                Intent intent1 = new Intent(MainActivity.this.getApplicationContext(), MainActivity.class);

                Notification.Builder builder = new Notification.Builder(getApplicationContext());
                intent1.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP);

                PendingIntent pendingNotificationIntent = PendingIntent.getActivity(MainActivity.this, 0, intent1, PendingIntent.FLAG_UPDATE_CURRENT);

                builder.setSmallIcon(R.drawable.ic_launcher_background).setTicker("HETT").setWhen(System.currentTimeMillis())
                        .setNumber(1).setContentTitle("알람이 왔어여").setContentText("싱싱한 알람")
                        .setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_VIBRATE).setContentIntent(pendingNotificationIntent).setAutoCancel(true).setOngoing(true);

                notificationManager.notify(1, builder.build());
            }
        });
    }
}
