package com.opera.android.osp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Message;
import com.opera.api.Callback;
import defpackage.b59;
import defpackage.ghf;
import defpackage.l45;
import defpackage.lkk;
import defpackage.ni6;
import defpackage.zsf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class OspCollectorService extends ilf {
    public static final HashMap g = new HashMap();
    public static final HashMap h = new HashMap();
    public ghf f;

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Intent intent) {
        Message message;
        lkk lkkVarD;
        Callback callback;
        if (sfe.g0(getApplicationContext()) || sfe.k0(getApplicationContext()) || !"com.opera.android.osp.action.OSP_MSG".equals(intent.getAction()) || (message = (Message) yi4.x(intent, "com.opera.android.osp.extra.MSG_DATA", Message.class)) == null) {
            return;
        }
        ghf ghfVar = this.f;
        ghfVar.getClass();
        int i = message.arg1;
        if (i < 0 || i >= ((zsf[]) ghfVar.b).length) {
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            l45 l45Var = ghfVar.z(i).d;
            ReentrantLock reentrantLock = (ReentrantLock) l45Var.c;
            reentrantLock.lock();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                ((ni6) l45Var.b).b(jCurrentTimeMillis);
                ((SharedPreferences) ((b59) l45Var.a).get()).edit().putLong("LastActiveTimeStamp", jCurrentTimeMillis).apply();
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (i2 == 2) {
            try {
                ghfVar.z(i).a(message.getData().getByteArray("com.opera.android.browser.DATA_VALUE"));
            } catch (IOException | IllegalArgumentException unused) {
            }
        } else if (i2 == 3) {
            ghfVar.z(i).f(message.getData().getLong("com.opera.android.browser.DATA_VALUE"), message.arg2 != 0);
        } else {
            if (i2 != 4 || (lkkVarD = lkk.d(i)) == null || (callback = (Callback) h.get(lkkVarD)) == null) {
                return;
            }
            callback.run(lkkVarD);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate() {
        super.onCreate();
        this.f = new ghf(getApplicationContext(), new lkk[]{lkk.ANALYTICS, lkk.REQUESTS, lkk.BEHAVIOR, lkk.ONBOARDING, lkk.DOMAINS});
    }

    public final void onDestroy() {
        super.onDestroy();
        for (zsf zsfVar : (zsf[]) this.f.b) {
            if (zsfVar != null) {
                synchronized (zsfVar.i) {
                    zsfVar.d(false);
                }
            }
        }
    }
}
