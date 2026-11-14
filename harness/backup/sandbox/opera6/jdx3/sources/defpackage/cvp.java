package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class cvp {
    public static cvp i;
    public final g40 a;
    public final IntentFilter b;
    public final Context c;
    public final HashSet d;
    public up1 e;
    public volatile boolean f;
    public final Handler g;
    public final LinkedHashSet h;

    public cvp(Context context) {
        AtomicReference atomicReference = ytp.a;
        g40 g40Var = new g40("SplitInstallListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService");
        this.d = new HashSet();
        this.e = null;
        this.f = false;
        this.a = g40Var;
        this.b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
        this.g = new Handler(Looper.getMainLooper());
        this.h = new LinkedHashSet();
    }

    public static synchronized cvp b(Context context) {
        cvp cvpVar;
        cvpVar = i;
        if (cvpVar == null) {
            AtomicReference atomicReference = ytp.a;
            cvpVar = new cvp(context);
            i = cvpVar;
        }
        return cvpVar;
    }

    public final void a() {
        BroadcastReceiver broadcastReceiver;
        if ((this.f || !this.d.isEmpty()) && this.e == null) {
            BroadcastReceiver up1Var = new up1(this, (byte) 27);
            this.e = up1Var;
            int i2 = Build.VERSION.SDK_INT;
            Context context = this.c;
            IntentFilter intentFilter = this.b;
            if (i2 >= 33) {
                context.registerReceiver(up1Var, intentFilter, 2);
            } else {
                context.registerReceiver(up1Var, intentFilter);
            }
        }
        if (this.f || !this.d.isEmpty() || (broadcastReceiver = this.e) == null) {
            return;
        }
        this.c.unregisterReceiver(broadcastReceiver);
        this.e = null;
    }

    public final synchronized void c(qop qopVar) {
        Iterator it = new LinkedHashSet(this.h).iterator();
        while (it.hasNext()) {
            ((a9e) it.next()).a(qopVar);
        }
        synchronized (this) {
            try {
                Iterator it2 = new HashSet(this.d).iterator();
                while (it2.hasNext()) {
                    ((zak) it2.next()).a(qopVar);
                }
            } finally {
            }
        }
    }
}
