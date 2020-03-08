
package com.example.tolet;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class app extends Application {

    public static final String CHANNEL_ID="notificationChannel";

    @Override
    public void onCreate() {
        super.onCreate();
        createNotificationChannel();
    }

    private void createNotificationChannel() {
        if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.O){
            NotificationChannel sevices=new NotificationChannel(
                    CHANNEL_ID,
                    "notification channel",
                    NotificationManager.IMPORTANCE_DEFAULT

            );

            NotificationManager manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(sevices);
        }
    }

}

    

