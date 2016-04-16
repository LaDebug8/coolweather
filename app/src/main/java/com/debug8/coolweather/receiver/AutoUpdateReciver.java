package com.debug8.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.debug8.coolweather.server.AutoUpdateService;

/**
 * Created by Debug8 on 2016/4/16.
 */
public class AutoUpdateReciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}
