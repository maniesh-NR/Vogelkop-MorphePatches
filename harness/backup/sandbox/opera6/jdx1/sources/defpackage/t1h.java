package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import kotlin.coroutines.e;

/* loaded from: classes.dex */
public final class t1h {
    public final Context b;
    public final jl5 c;
    public final a5o d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    static {
        qs7.B("Processor");
    }

    public t1h(Context context, jl5 jl5Var, a5o a5oVar, WorkDatabase workDatabase) {
        this.b = context;
        this.c = jl5Var;
        this.d = a5oVar;
        this.e = workDatabase;
    }

    public static boolean d(z5o z5oVar, int i) {
        if (z5oVar == null) {
            qs7.x().getClass();
            return false;
        }
        z5oVar.l.B(new q5o(i));
        qs7.x().getClass();
        return true;
    }

    public final void a(dg8 dg8Var) {
        synchronized (this.k) {
            this.j.add(dg8Var);
        }
    }

    public final z5o b(String str) {
        z5o z5oVar = (z5o) this.f.remove(str);
        boolean z = z5oVar != null;
        if (!z) {
            z5oVar = (z5o) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                if (this.f.isEmpty()) {
                    Context context = this.b;
                    int i = qzk.k;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.b.startService(intent);
                    } catch (Throwable unused) {
                        qs7.x().getClass();
                    }
                    PowerManager.WakeLock wakeLock = this.a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.a = null;
                    }
                }
            }
        }
        return z5oVar;
    }

    public final z5o c(String str) {
        z5o z5oVar = (z5o) this.f.get(str);
        return z5oVar == null ? (z5o) this.g.get(str) : z5oVar;
    }

    public final void e(dg8 dg8Var) {
        synchronized (this.k) {
            this.j.remove(dg8Var);
        }
    }

    public final boolean f(w8k w8kVar, d7h d7hVar) {
        boolean z;
        w4o w4oVar = w8kVar.a;
        String str = w4oVar.a;
        ArrayList arrayList = new ArrayList();
        byte b = 1;
        h5o h5oVar = (h5o) this.e.t(new n17(this, arrayList, str, b));
        if (h5oVar == null) {
            qs7 qs7VarX = qs7.x();
            w4oVar.toString();
            qs7VarX.getClass();
            this.d.d.execute(new q2g(this, w4oVar, (byte) 12));
            return false;
        }
        synchronized (this.k) {
            synchronized (this.k) {
                try {
                    z = c(str) != null;
                } finally {
                }
            }
            if (z) {
                Set set = (Set) this.h.get(str);
                if (((w8k) set.iterator().next()).a.b == w4oVar.b) {
                    set.add(w8kVar);
                    qs7 qs7VarX2 = qs7.x();
                    w4oVar.toString();
                    qs7VarX2.getClass();
                } else {
                    this.d.d.execute(new q2g(this, w4oVar, (byte) 12));
                }
                return false;
            }
            if (h5oVar.t != w4oVar.b) {
                this.d.d.execute(new q2g(this, w4oVar, (byte) 12));
                return false;
            }
            z5o z5oVar = new z5o(new ami(this.b, this.c, this.d, this, this.e, h5oVar, arrayList));
            dx5 dx5Var = z5oVar.d.b;
            ynb ynbVarE = o0g.e();
            dx5Var.getClass();
            o94 o94VarD0 = cs5.d0(e.a(dx5Var, ynbVarE), new w5o(z5oVar, null, b));
            o94VarD0.b.addListener(new jbd(this, o94VarD0, z5oVar, (byte) 13), this.d.d);
            this.g.put(str, z5oVar);
            HashSet hashSet = new HashSet();
            hashSet.add(w8kVar);
            this.h.put(str, hashSet);
            qs7 qs7VarX3 = qs7.x();
            w4oVar.toString();
            qs7VarX3.getClass();
            return true;
        }
    }
}
