package com.opera.android.browser;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.br;
import defpackage.mdb;
import defpackage.wub;
import org.chromium.base.TraceEvent;

/* loaded from: classes.dex */
public class PrivateTabsNotificationService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        if (intent == null || !mdb.a(this).equals(intent.getComponent())) {
            return;
        }
        wub.N(TraceEvent.n("NotificationManagerProxyImpl.cancel(id)", (String) null), new br(aib.t(), 2131363801, (byte) 18));
        stopSelf();
    }
}
