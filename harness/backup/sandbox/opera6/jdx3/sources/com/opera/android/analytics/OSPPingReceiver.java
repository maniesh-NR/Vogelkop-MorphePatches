package com.opera.android.analytics;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.opera.android.OperaApplication;
import defpackage.lkk;
import defpackage.mdb;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class OSPPingReceiver extends BroadcastReceiver {
    public static final HashSet a = new HashSet(Arrays.asList("com.opera.android.action.APP_START", "android.intent.action.BOOT_COMPLETED", "android.intent.action.MY_PACKAGE_REPLACED", "com.opera.android.DELAYED_SYNC"));

    public static void a(Context context, lkk lkkVar, boolean z) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intentPutExtra = new Intent("com.opera.android.DELAYED_SYNC").setClass(context, OSPPingReceiver.class).setPackage(context.getPackageName()).putExtra("ui-sync", z);
        if (lkkVar != null) {
            intentPutExtra.putExtra("subject", (int) lkkVar.a);
        }
        alarmManager.set(3, SystemClock.elapsedRealtime() + 10000, PendingIntent.getBroadcast(context, 0, intentPutExtra, 67108864));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (sfe.g0(context) || intent == null) {
            return;
        }
        String action = intent.getAction();
        if (a.contains(action) && xf8.Q(context.getApplicationContext())) {
            if ("android.intent.action.MY_PACKAGE_REPLACED".equals(action)) {
                ContentResolver.cancelSync(xf8.F(context), xf8.G(context));
                String[] strArr = OperaApplication.K;
                if (((OperaApplication) context.getApplicationContext()).J().i("eula_accepted.gdpr")) {
                    a(context, null, false);
                    return;
                }
                return;
            }
            if (!"com.opera.android.DELAYED_SYNC".equals(action)) {
                xf8.E(context.getApplicationContext(), "com.opera.android.action.APP_START".equals(action));
                return;
            }
            mdb.f(intent);
            Bundle extras = intent.getExtras();
            boolean z = true;
            if (extras != null && !extras.getBoolean("ui-sync", true)) {
                z = false;
            }
            lkk lkkVarD = extras != null ? lkk.d(extras.getInt("subject", -1)) : null;
            if (lkkVarD != null) {
                xf8.n0(context, lkkVarD, false);
            } else if (z) {
                xf8.n0(context, (lkk) null, false);
            } else {
                xf8.E(context, false);
            }
        }
    }
}
