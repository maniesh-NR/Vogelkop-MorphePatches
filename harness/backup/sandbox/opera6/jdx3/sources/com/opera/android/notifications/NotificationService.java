package com.opera.android.notifications;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.opera.android.OperaApplication;
import com.opera.android.notifications.NotificationBridge;
import defpackage.e7d;
import defpackage.fsp;
import kotlin.Metadata;
import org.chromium.base.CommandLine;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/opera/android/notifications/NotificationService;", "Landroid/app/Service;", "Lcom/opera/android/notifications/NotificationBridge$Callback;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NotificationService extends Service implements NotificationBridge.Callback {
    public static final /* synthetic */ int b = 0;
    public int a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.opera.android.notifications.NotificationBridge.Callback
    public final void onDone() {
        int i = this.a - 1;
        this.a = i;
        if (i == 0) {
            stopSelf();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        this.a++;
        if (intent == null || !NotificationBridge.c(intent)) {
            int i3 = this.a - 1;
            this.a = i3;
            if (i3 == 0) {
                stopSelf();
            }
            return 2;
        }
        Context applicationContext = getApplicationContext();
        String[] strArr = OperaApplication.K;
        CommandLine commandLine = ((OperaApplication) applicationContext.getApplicationContext()).n;
        if (commandLine == null) {
            commandLine = null;
        }
        fsp.g(applicationContext, commandLine);
        e7d.a(applicationContext, new c(applicationContext, intent, this));
        return 2;
    }
}
