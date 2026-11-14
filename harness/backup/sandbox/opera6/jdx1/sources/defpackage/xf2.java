package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class xf2 implements x6f {
    public boolean a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;
    public Object j;

    public xf2(Context context, va2 va2Var, pf2 pf2Var, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = va2Var;
        this.j = pf2Var;
        this.i = audioDeviceInfo;
        String str = tym.a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.d = handler;
        this.e = new vf2(this, (byte) 0);
        this.f = new up1(this, (byte) 1);
        uf2 uf2Var = uf2.c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.g = uriFor != null ? new wf2(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public xf2(plh plhVar, a64 a64Var, List list, Context context) {
        this.b = new Object();
        this.c = new CopyOnWriteArrayList();
        this.e = null;
        this.a = false;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(y9m.v((String) it.next(), null, null));
        }
        this.d = arrayList;
        this.f = plhVar;
        this.g = a64Var;
        this.h = new AtomicBoolean(false);
        this.j = (CameraManager) context.getSystemService("camera");
    }

    public final void a(uf2 uf2Var) {
        if (!this.a || uf2Var.equals((uf2) this.h)) {
            return;
        }
        this.h = uf2Var;
        uh2 uh2Var = (uh2) ((va2) this.c).b;
        uh2Var.f();
        uf2 uf2Var2 = uh2Var.g;
        if (uf2Var2 == null || uf2Var.equals(uf2Var2)) {
            return;
        }
        uh2Var.g = uf2Var;
        ijc ijcVar = uh2Var.e;
        if (ijcVar != null) {
            ijcVar.i(-1, new t40((byte) 29));
        }
    }

    @Override // defpackage.x6f
    public final ListenableFuture b() {
        return k1g.z(new r9g(this, (byte) 2));
    }

    public final void c() {
        if (((AtomicBoolean) this.h).compareAndSet(false, true)) {
            d3k d3kVar = (d3k) this.i;
            mt5 mt5Var = null;
            if (d3kVar != null) {
                d3kVar.k((CancellationException) null);
            }
            lqh lqhVar = new lqh();
            lqhVar.a = true;
            this.i = j14.Y(new x99(new z99(new z78((plh) this.f, (byte) 8), new mz9(this, lqhVar, mt5Var, (byte) 14), (byte) 2), new km4((byte) 8, (mt5) null, this), (byte) 1), (a64) this.g);
        }
    }

    public final void d(Throwable th, List list) {
        boolean z;
        List listUnmodifiableList;
        Throwable th2;
        synchronized (this.b) {
            z = true;
            if (th != null) {
                if (((Throwable) this.e) != null && ((List) this.d).isEmpty()) {
                    z = false;
                }
                this.e = th;
                list = Collections.EMPTY_LIST;
                this.d = list;
            } else {
                list.getClass();
                if (((Throwable) this.e) == null && ((List) this.d).equals(list)) {
                    z = false;
                }
                this.e = null;
                this.d = list;
            }
            listUnmodifiableList = Collections.unmodifiableList(list);
            th2 = (Throwable) this.e;
        }
        if (z) {
            ((CopyOnWriteArrayList) this.c).size();
            Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
            while (it.hasNext()) {
                l3 l3Var = (l3) it.next();
                l3Var.a.execute(new k3(th2, l3Var, listUnmodifiableList, (byte) 0));
            }
        }
    }

    @Override // defpackage.x6f
    public final void f(v6f v6fVar) {
        l3 l3Var;
        v6fVar.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (true) {
            if (!it.hasNext()) {
                l3Var = null;
                break;
            } else {
                l3Var = (l3) it.next();
                if (l3Var.b.equals(v6fVar)) {
                    break;
                }
            }
        }
        if (l3Var != null) {
            ((CopyOnWriteArrayList) this.c).remove(l3Var);
        }
        synchronized (this.b) {
            if (this.a && ((CopyOnWriteArrayList) this.c).isEmpty()) {
                this.a = false;
                if (((AtomicBoolean) this.h).compareAndSet(true, false)) {
                    d3k d3kVar = (d3k) this.i;
                    if (d3kVar != null) {
                        d3kVar.k((CancellationException) null);
                    }
                    this.i = null;
                }
            }
        }
    }

    @Override // defpackage.x6f
    public final void g(Executor executor, v6f v6fVar) {
        List listUnmodifiableList;
        Throwable th;
        executor.getClass();
        v6fVar.getClass();
        ((CopyOnWriteArrayList) this.c).add(new l3(executor, v6fVar));
        synchronized (this.b) {
            if (!this.a && !((CopyOnWriteArrayList) this.c).isEmpty()) {
                this.a = true;
                c();
            }
            listUnmodifiableList = Collections.unmodifiableList((List) this.d);
            th = (Throwable) this.e;
        }
        executor.execute(new k3(th, new l3(executor, v6fVar), listUnmodifiableList, (byte) 0));
    }
}
