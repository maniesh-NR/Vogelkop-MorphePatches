package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.a;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class kwh implements ComponentCallbacks2, kdc {
    public static final rwh l;
    public final a a;
    public final Context b;
    public final scc c;
    public final rn9 d;
    public final nwh e;
    public final icl f;
    public final vl9 g;
    public final Handler h;
    public final um5 i;
    public final CopyOnWriteArrayList j;
    public final rwh k;

    static {
        rwh rwhVar = (rwh) new rwh().e(Bitmap.class);
        rwhVar.l = true;
        l = rwhVar;
        ((rwh) new rwh().e(kx9.class)).l = true;
    }

    public kwh(a aVar, scc sccVar, nwh nwhVar, Context context) {
        rwh rwhVar;
        rn9 rn9Var = new rn9((byte) 26);
        wu5 wu5Var = aVar.g;
        this.f = new icl();
        Runnable vl9Var = new vl9(this, (byte) 25);
        this.g = vl9Var;
        Handler handler = new Handler(Looper.getMainLooper());
        this.h = handler;
        this.a = aVar;
        this.c = sccVar;
        this.e = nwhVar;
        this.d = rn9Var;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        um5 dn6Var = nb6.h(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new dn6(applicationContext, new jvg(this, rn9Var, (byte) 2)) : new c4f();
        this.i = dn6Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            sccVar.d(this);
        } else {
            handler.post(vl9Var);
        }
        sccVar.d(dn6Var);
        this.j = new CopyOnWriteArrayList(aVar.c.d);
        ry9 ry9Var = aVar.c;
        synchronized (ry9Var) {
            rwhVar = ry9Var.h;
            if (rwhVar == null) {
                ry9Var.c.getClass();
                rwhVar = new rwh();
                rwhVar.l = true;
                ry9Var.h = rwhVar;
            }
        }
        synchronized (this) {
            rwh rwhVar2 = (rwh) rwhVar.clone();
            if (rwhVar2.l && !rwhVar2.m) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            rwhVar2.m = true;
            rwhVar2.l = true;
            this.k = rwhVar2;
        }
        synchronized (aVar.h) {
            if (aVar.h.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            aVar.h.add(this);
        }
    }

    public final void g(zbl zblVar) {
        if (zblVar != null) {
            boolean zJ = j(zblVar);
            zlj request = zblVar.getRequest();
            if (zJ) {
                return;
            }
            a aVar = this.a;
            synchronized (aVar.h) {
                ArrayList arrayList = aVar.h;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((kwh) obj).j(zblVar)) {
                        return;
                    }
                }
                if (request != null) {
                    zblVar.c(null);
                    request.c();
                }
            }
        }
    }

    public final synchronized void h() {
        rn9 rn9Var = this.d;
        rn9Var.b = true;
        ArrayList arrayListY = rm5.y((Set) rn9Var.c);
        int size = arrayListY.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListY.get(i);
            i++;
            zlj zljVar = (zlj) obj;
            if (zljVar.f()) {
                synchronized (zljVar.b) {
                    if (zljVar.f()) {
                        zljVar.c();
                    }
                }
                ((ArrayList) rn9Var.d).add(zljVar);
            }
        }
    }

    public final synchronized void i() {
        rn9 rn9Var = this.d;
        int i = 0;
        rn9Var.b = false;
        ArrayList arrayListY = rm5.y((Set) rn9Var.c);
        int size = arrayListY.size();
        while (i < size) {
            Object obj = arrayListY.get(i);
            i++;
            zlj zljVar = (zlj) obj;
            if (!zljVar.e() && !zljVar.f()) {
                zljVar.a();
            }
        }
        ((ArrayList) rn9Var.d).clear();
    }

    public final synchronized boolean j(zbl zblVar) {
        zlj request = zblVar.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.d.o(request)) {
            return false;
        }
        this.f.a.remove(zblVar);
        zblVar.c(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // defpackage.kdc
    public final synchronized void onDestroy() {
        this.f.onDestroy();
        ArrayList arrayListY = rm5.y(this.f.a);
        int size = arrayListY.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListY.get(i2);
            i2++;
            g((zbl) obj);
        }
        this.f.a.clear();
        rn9 rn9Var = this.d;
        ArrayList arrayListY2 = rm5.y((Set) rn9Var.c);
        int size2 = arrayListY2.size();
        while (i < size2) {
            Object obj2 = arrayListY2.get(i);
            i++;
            rn9Var.o((zlj) obj2);
        }
        ((ArrayList) rn9Var.d).clear();
        this.c.f(this);
        this.c.f(this.i);
        this.h.removeCallbacks(this.g);
        a aVar = this.a;
        synchronized (aVar.h) {
            try {
                if (!aVar.h.contains(this)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                aVar.h.remove(this);
            } finally {
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // defpackage.kdc
    public final synchronized void onStart() {
        i();
        this.f.onStart();
    }

    @Override // defpackage.kdc
    public final synchronized void onStop() {
        h();
        this.f.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.d + ", treeNode=" + this.e + "}";
    }
}
