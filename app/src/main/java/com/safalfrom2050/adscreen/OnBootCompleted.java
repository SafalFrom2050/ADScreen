package com.safalfrom2050.adscreen;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class OnBootCompleted extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        // Start app at boot completed

        Intent i = new Intent(context, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
