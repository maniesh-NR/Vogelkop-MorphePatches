package com.opera.android.ping;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.nwk;

/* loaded from: classes.dex */
public class SyncAuthenticatorService extends Service {
    public nwk a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.a.getIBinder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.a = new nwk(this);
    }
}
