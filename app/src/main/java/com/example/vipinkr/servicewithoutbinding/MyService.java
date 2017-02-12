package com.example.vipinkr.servicewithoutbinding;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    // Called when the service is being created.
    @Override
    public void onCreate() {

        Toast.makeText(this, "Service is Created", Toast.LENGTH_LONG).show();
        stopSelf();

    }

    /**
     * The service is starting, due to a call to startService()
     */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        Log.i("flag",Integer.toString(intent.getFlags()));

        Toast.makeText(this, "Service has started", Toast.LENGTH_LONG).show();

        return START_STICKY;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        Toast.makeText(this, "Service has stopped", Toast.LENGTH_LONG).show();
    }

}
