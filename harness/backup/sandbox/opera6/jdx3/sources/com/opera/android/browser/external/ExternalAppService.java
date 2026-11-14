package com.opera.android.browser.external;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import com.leanplum.internal.Constants;
import defpackage.bn7;
import defpackage.cm;
import defpackage.l1f;
import defpackage.q65;
import defpackage.ua7;
import defpackage.umi;
import defpackage.vml;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/opera/android/browser/external/ExternalAppService;", "Landroid/app/Service;", "<init>", "()V", "yl8", "xl8", "wl8", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExternalAppService extends Service {
    public static boolean b;
    public final q65 a = new q65(new bn7((Object) this, (byte) 17), 4);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        b = true;
        if (Build.VERSION.SDK_INT < 34) {
            umi umiVar = vml.d;
            on7 on7Var = pn7.b;
            this.a.B0(umiVar, pn7.f(cs5.x0(3, un7.f)), TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.a.S();
        b = false;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Bundle extras;
        PendingIntent pendingIntent;
        Bundle extras2;
        String string = null;
        ua7 ua7VarT = zi4.t("other", new cm(string, 2131362744, (byte) 5));
        boolean zL = true;
        ua7VarT.R(true);
        ua7VarT.S(2131231676);
        if (intent != null && (extras2 = intent.getExtras()) != null) {
            string = extras2.getString(Constants.Params.MESSAGE);
        }
        if (string == null) {
            string = "";
        }
        ua7VarT.O(string);
        if (intent != null && (extras = intent.getExtras()) != null && (pendingIntent = (PendingIntent) ((Parcelable) j14.T(extras, "intent", PendingIntent.class))) != null) {
            ((l1f) ua7VarT.b).g = pendingIntent;
        }
        Notification notification = (Notification) ua7VarT.l().b;
        if (Build.VERSION.SDK_INT >= 31) {
            zL = m41.L(this, 2131362744, notification);
        } else {
            startForeground(2131362744, notification);
        }
        if (zL) {
            return 2;
        }
        stopSelf();
        return 2;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        stopSelf();
    }
}
