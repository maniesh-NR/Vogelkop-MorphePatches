package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z3a implements vmi, ocf, dg8 {
    public final Context a;
    public final e17 c;
    public boolean d;
    public final t1h g;
    public final wzg h;
    public final jl5 i;
    public Boolean k;
    public final oji l;
    public final a5o m;
    public final w7j n;
    public final HashMap b = new HashMap();
    public final Object e = new Object();
    public final jvg f = new jvg(new x5i((byte) 1));
    public final HashMap j = new HashMap();

    static {
        qs7.B("GreedyScheduler");
    }

    public z3a(Context context, jl5 jl5Var, azl azlVar, t1h t1hVar, wzg wzgVar, a5o a5oVar) {
        this.a = context;
        xm5 xm5Var = jl5Var.f;
        this.c = new e17(this, xm5Var, jl5Var.d);
        w7j w7jVar = new w7j();
        w7jVar.a = xm5Var;
        w7jVar.b = wzgVar;
        w7jVar.c = new Object();
        w7jVar.d = new LinkedHashMap();
        this.n = w7jVar;
        this.m = a5oVar;
        this.l = new oji(azlVar);
        this.i = jl5Var;
        this.g = t1hVar;
        this.h = wzgVar;
    }

    public final void a(w4o w4oVar, boolean z) {
        unb unbVar;
        w8k w8kVarB = this.f.B(w4oVar);
        if (w8kVarB != null) {
            this.n.a(w8kVarB);
        }
        synchronized (this.e) {
            unbVar = (unb) this.b.remove(w4oVar);
        }
        if (unbVar != null) {
            qs7 qs7VarX = qs7.x();
            Objects.toString(w4oVar);
            qs7VarX.getClass();
            unbVar.k((CancellationException) null);
        }
        if (z) {
            return;
        }
        synchronized (this.e) {
            this.j.remove(w4oVar);
        }
    }

    @Override // defpackage.vmi
    public final void b(String str) {
        Runnable runnable;
        Boolean boolValueOf = this.k;
        if (boolValueOf == null) {
            int i = o1h.a;
            String processName = Application.getProcessName();
            this.i.getClass();
            boolValueOf = Boolean.valueOf(Intrinsics.a(processName, this.a.getApplicationInfo().processName));
            this.k = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            qs7.x().getClass();
            return;
        }
        if (!this.d) {
            this.g.a(this);
            this.d = true;
        }
        qs7.x().getClass();
        e17 e17Var = this.c;
        if (e17Var != null && (runnable = (Runnable) e17Var.c.remove(str)) != null) {
            ((Handler) e17Var.b.a).removeCallbacks(runnable);
        }
        for (w8k w8kVar : this.f.C(str)) {
            this.n.a(w8kVar);
            this.h.c(w8kVar, -512);
        }
    }

    @Override // defpackage.vmi
    public final void c(h5o... h5oVarArr) {
        long jMax;
        Boolean boolValueOf = this.k;
        if (boolValueOf == null) {
            Context context = this.a;
            jl5 jl5Var = this.i;
            int i = o1h.a;
            String processName = Application.getProcessName();
            jl5Var.getClass();
            boolValueOf = Boolean.valueOf(Intrinsics.a(processName, context.getApplicationInfo().processName));
            this.k = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            qs7.x().getClass();
            return;
        }
        if (!this.d) {
            this.g.a(this);
            this.d = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (h5o h5oVar : h5oVarArr) {
            if (!this.f.s(y7h.g(h5oVar))) {
                synchronized (this.e) {
                    w4o w4oVar = new w4o(h5oVar.a, h5oVar.t);
                    y3a y3aVar = (y3a) this.j.get(w4oVar);
                    if (y3aVar == null) {
                        int i2 = h5oVar.k;
                        ioj iojVar = this.i.d;
                        y3aVar = new y3a(i2, System.currentTimeMillis());
                        this.j.put(w4oVar, y3aVar);
                    }
                    jMax = (Math.max((h5oVar.k - y3aVar.a) - 5, 0) * 30000) + y3aVar.b;
                }
                long jMax2 = Math.max(h5oVar.a(), jMax);
                ioj iojVar2 = this.i.d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (h5oVar.b == 1) {
                    if (jCurrentTimeMillis < jMax2) {
                        e17 e17Var = this.c;
                        if (e17Var != null) {
                            xm5 xm5Var = e17Var.b;
                            HashMap map = e17Var.c;
                            Runnable runnable = (Runnable) map.remove(h5oVar.a);
                            if (runnable != null) {
                                ((Handler) xm5Var.a).removeCallbacks(runnable);
                            }
                            Runnable wr9Var = new wr9((byte) 7, e17Var, h5oVar, false);
                            map.put(h5oVar.a, wr9Var);
                            ((Handler) xm5Var.a).postDelayed(wr9Var, jMax2 - System.currentTimeMillis());
                        }
                    } else if (h5oVar.b()) {
                        xo5 xo5Var = h5oVar.j;
                        if (xo5Var.d) {
                            qs7 qs7VarX = qs7.x();
                            h5oVar.toString();
                            qs7VarX.getClass();
                        } else if (xo5Var.i.isEmpty()) {
                            hashSet.add(h5oVar);
                            hashSet2.add(h5oVar.a);
                        } else {
                            qs7 qs7VarX2 = qs7.x();
                            h5oVar.toString();
                            qs7VarX2.getClass();
                        }
                    } else if (!this.f.s(new w4o(h5oVar.a, h5oVar.t))) {
                        qs7.x().getClass();
                        jvg jvgVar = this.f;
                        jvgVar.getClass();
                        w8k w8kVarD = jvgVar.D(new w4o(h5oVar.a, h5oVar.t));
                        this.n.p(w8kVarD);
                        wzg wzgVar = this.h;
                        ((a5o) wzgVar.c).a(new h4m(wzgVar, w8kVarD, (Object) null, (byte) 10));
                    }
                }
            }
        }
        synchronized (this.e) {
            if (!hashSet.isEmpty()) {
                TextUtils.join(",", hashSet2);
                qs7.x().getClass();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    h5o h5oVar2 = (h5o) it.next();
                    w4o w4oVarG = y7h.g(h5oVar2);
                    if (!this.b.containsKey(w4oVarG)) {
                        this.b.put(w4oVarG, q4o.a(this.l, h5oVar2, this.m.b, this));
                    }
                }
            }
        }
    }

    public final void d(h5o h5oVar, fp5 fp5Var) {
        w4o w4oVar = new w4o(h5oVar.a, h5oVar.t);
        boolean z = fp5Var instanceof dp5;
        wzg wzgVar = this.h;
        w7j w7jVar = this.n;
        jvg jvgVar = this.f;
        if (z) {
            if (jvgVar.s(w4oVar)) {
                return;
            }
            qs7 qs7VarX = qs7.x();
            w4oVar.toString();
            qs7VarX.getClass();
            w8k w8kVarD = jvgVar.D(w4oVar);
            w7jVar.p(w8kVarD);
            ((a5o) wzgVar.c).a(new h4m(wzgVar, w8kVarD, (Object) null, (byte) 10));
            return;
        }
        qs7 qs7VarX2 = qs7.x();
        w4oVar.toString();
        qs7VarX2.getClass();
        w8k w8kVarB = jvgVar.B(w4oVar);
        if (w8kVarB != null) {
            w7jVar.a(w8kVarB);
            wzgVar.c(w8kVarB, ((ep5) fp5Var).a);
        }
    }

    @Override // defpackage.vmi
    public final boolean e() {
        return false;
    }
}
