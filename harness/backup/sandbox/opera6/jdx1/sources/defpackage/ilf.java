package defpackage;

import android.app.Service;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class ilf extends Service {
    public static final Object c = new Object();
    public static final HashMap d = new HashMap();
    public static final AtomicReference e = new AtomicReference();
    public hlf a;
    public fob b;

    public static void a(Context context, Class cls, int i, Intent intent) {
        ComponentName componentName = new ComponentName(context, (Class<?>) cls);
        synchronized (c) {
            HashMap map = d;
            glf glfVar = (glf) map.get(componentName);
            if (glfVar == null) {
                glfVar = new glf(context, componentName, i);
                map.put(componentName, glfVar);
            }
            glfVar.a(i);
            try {
                glfVar.e.enqueue(glfVar.d, new JobWorkItem(intent));
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public void b(Intent intent) {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        fob fobVar = this.b;
        return fobVar != null ? fobVar.getBinder() : new Messenger(new Handler(Looper.getMainLooper())).getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        new ComponentName(this, getClass());
        z8b z8bVar = new z8b((byte) 27);
        this.a = new hlf(this, getClass().getSimpleName().concat("-thread"), z8bVar);
        this.b = new fob(this, this.a, z8bVar, new kqd(this, (byte) 20));
        this.a.start();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        hlf hlfVar = this.a;
        if (hlfVar != null) {
            hlfVar.a.set(true);
            hlfVar.c.release();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
