package com.opera.android.browser;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.opera.android.OperaApplication;
import defpackage.ac8;
import defpackage.br;
import defpackage.wub;
import defpackage.x55;
import defpackage.x56;
import defpackage.x5f;
import defpackage.zpa;
import java.util.Random;
import org.chromium.base.TraceEvent;

/* loaded from: classes.dex */
public class PrivateTabsBroadcastReceiver extends BroadcastReceiver {
    public static Random a;
    public static final Object b = new Object();
    public static boolean c;

    public static void a(Context context) {
        int iNextInt = a.nextInt() + context.getSharedPreferences("private_tabs_receiver", 0).getInt("secret", 0);
        c = false;
        context.getSharedPreferences("private_tabs_receiver", 0).edit().putInt("secret", iNextInt).apply();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (sfe.g0(context) || !TextUtils.equals(intent.getAction(), "com.opera.android.ACTION_CLOSE_ALL_PRIVATE_TABS") || (extras = intent.getExtras()) == null) {
            return;
        }
        int i = extras.getInt("com.opera.android.ARGUMENT", 0);
        synchronized (b) {
            if (c) {
                a(context);
            }
        }
        if (i == context.getSharedPreferences("private_tabs_receiver", 0).getInt("secret", 0)) {
            String[] strArr = OperaApplication.K;
            x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                am2.f(zpaVar, x56VarF).b.p(7, 1, 1L);
                x5fVar.U0(x56VarF);
            }
            ac8.a(new x55());
            wub.N(TraceEvent.n("NotificationManagerProxyImpl.cancel(id)", (String) null), new br(aib.t(), 2131363801, (byte) 18));
        }
    }
}
