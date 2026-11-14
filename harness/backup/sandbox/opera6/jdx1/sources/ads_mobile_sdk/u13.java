package ads_mobile_sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.e22;
import defpackage.enp;
import defpackage.t3p;
import defpackage.zhd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class u13 {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final e7 b;
    public boolean g;
    public final Intent h;
    public final t3p i;
    public t13 m;
    public enp n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final zhd k = new zhd(this, 1);
    public final AtomicInteger l = new AtomicInteger(0);
    public final String c = "PrewarmService";
    public final WeakReference j = new WeakReference(null);

    public u13(Context context, e7 e7Var, Intent intent, t3p t3pVar) {
        this.a = context;
        this.b = e7Var;
        this.h = intent;
        this.i = t3pVar;
    }

    public final void a(jk2 jk2Var) {
        enp enpVar = this.n;
        e7 e7Var = this.b;
        ArrayList arrayList = this.d;
        int i = 0;
        if (enpVar != null || this.g) {
            if (!this.g) {
                jk2Var.run();
                return;
            } else {
                e7Var.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(jk2Var);
                return;
            }
        }
        e7Var.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(jk2Var);
        t13 t13Var = new t13(this);
        this.m = t13Var;
        this.g = true;
        if (this.a.bindService(this.h, t13Var, 1)) {
            return;
        }
        e7Var.a("Failed to bind to the service.", new Object[0]);
        this.g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            e22 e22Var = new e22("Failed to bind to the service.");
            TaskCompletionSource taskCompletionSource = ((oz2) obj).a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e22Var);
            }
        }
        arrayList.clear();
    }

    public final void b(oz2 oz2Var) {
        Handler handler;
        HashMap map = o;
        synchronized (map) {
            if (!map.containsKey(this.c)) {
                HandlerThread handlerThread = new HandlerThread(this.c, 10);
                handlerThread.start();
                map.put(this.c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.c);
        }
        handler.post(oz2Var);
    }
}
