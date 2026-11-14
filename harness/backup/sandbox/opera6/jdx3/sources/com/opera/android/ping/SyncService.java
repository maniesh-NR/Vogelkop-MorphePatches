package com.opera.android.ping;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.kwk;

/* loaded from: classes.dex */
public class SyncService extends Service {
    public static kwk a;
    public static final Object b = new Object();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return a.getSyncAdapterBinder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        synchronized (b) {
            if (a == null) {
                a = new kwk(getApplicationContext());
            }
        }
    }
}
