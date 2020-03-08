package com.example.tolet;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.messaging.RemoteMessage;

import static com.example.tolet.app.CHANNEL_ID;

public class ExampleService extends Service {
    NotificationCompat.Builder builder;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
       final String text=intent.getStringExtra("name");

        Intent notificatinIntent=new Intent(this,ImageHome.class);
        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,notificatinIntent,
                0);
       Notification notificationCompat=new NotificationCompat.Builder(this,CHANNEL_ID)
                .setContentTitle(text)
                .setSmallIcon(R.drawable.house)
                .setAutoCancel(true)
                .setContentText(text)
               .build();

        startForeground(1,notificationCompat);
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }





}
