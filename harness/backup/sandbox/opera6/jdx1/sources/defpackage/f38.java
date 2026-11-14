package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f38 {
    public static final boolean h = Log.isLoggable("Engine", 2);
    public final qfb a;
    public final hv5 b;
    public final a4d c;
    public final ami d;
    public final nrl e;
    public final ro9 f;
    public final vzk g;

    public f38(a4d a4dVar, qfb qfbVar, wy9 wy9Var, wy9 wy9Var2, wy9 wy9Var3, wy9 wy9Var4) throws Throwable {
        this.c = a4dVar;
        e38 e38Var = new e38(qfbVar);
        vzk vzkVar = new vzk((byte) 1);
        this.g = vzkVar;
        synchronized (this) {
            try {
                try {
                    synchronized (vzkVar) {
                        try {
                            vzkVar.d = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                    this.b = new hv5();
                    this.a = new qfb((byte) 1);
                    this.d = new ami(wy9Var, wy9Var2, wy9Var3, wy9Var4, this, this);
                    this.f = new ro9(e38Var);
                    this.e = new nrl((byte) 25);
                    a4dVar.e = this;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    public static void e(kyh kyhVar) {
        if (kyhVar instanceof t38) {
            ((t38) kyhVar).c();
        } else {
            qp2.o("Cannot release anything but an EngineResource");
        }
    }

    public final ua7 a(ry9 ry9Var, Object obj, hub hubVar, int i, int i2, Class cls, Class cls2, nyg nygVar, w97 w97Var, v74 v74Var, boolean z, boolean z2, trf trfVar, boolean z3, boolean z4, zlj zljVar, ng8 ng8Var) {
        long jElapsedRealtimeNanos = h ? SystemClock.elapsedRealtimeNanos() : 0L;
        this.b.getClass();
        s38 s38Var = new s38(obj, hubVar, i, i2, v74Var, cls, cls2, trfVar);
        synchronized (this) {
            t38 t38VarB = b(s38Var, z3, jElapsedRealtimeNanos);
            if (t38VarB == null) {
                return f(ry9Var, obj, hubVar, i, i2, cls, cls2, nygVar, w97Var, v74Var, z, z2, trfVar, z3, z4, zljVar, ng8Var, s38Var, jElapsedRealtimeNanos);
            }
            zljVar.h(t38VarB, 5);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t38 b(s38 s38Var, boolean z, long j) {
        t38 t38Var;
        Object objRemove;
        f38 f38Var;
        s38 s38Var2;
        t38 t38Var2;
        if (z) {
            vzk vzkVar = this.g;
            synchronized (vzkVar) {
                jg jgVar = (jg) ((HashMap) vzkVar.b).get(s38Var);
                if (jgVar == null) {
                    t38Var = null;
                } else {
                    t38Var = (t38) jgVar.get();
                    if (t38Var == null) {
                        vzkVar.s(jgVar);
                    }
                }
            }
            if (t38Var != null) {
                t38Var.a();
                if (h) {
                    SystemClock.elapsedRealtimeNanos();
                    Objects.toString(s38Var);
                }
                return t38Var;
            }
            a4d a4dVar = this.c;
            synchronized (a4dVar) {
                objRemove = ((LinkedHashMap) ((t59) a4dVar).c).remove(s38Var);
                if (objRemove != null) {
                    ((t59) a4dVar).b -= a4dVar.f(objRemove);
                }
            }
            kyh kyhVar = (kyh) objRemove;
            if (kyhVar == null) {
                f38Var = this;
                s38Var2 = s38Var;
                t38Var2 = null;
            } else if (kyhVar instanceof t38) {
                t38Var2 = (t38) kyhVar;
                f38Var = this;
                s38Var2 = s38Var;
            } else {
                f38Var = this;
                s38Var2 = s38Var;
                t38Var2 = new t38(kyhVar, true, true, s38Var2, f38Var);
            }
            if (t38Var2 != null) {
                t38Var2.a();
                f38Var.g.d(s38Var2, t38Var2);
                if (h) {
                    SystemClock.elapsedRealtimeNanos();
                    Objects.toString(s38Var2);
                }
                return t38Var2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000c, B:9:0x001e), top: B:16:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(defpackage.r38 r2, defpackage.s38 r3, defpackage.t38 r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r4 == 0) goto Lc
            boolean r0 = r4.a     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto Lc
            vzk r0 = r1.g     // Catch: java.lang.Throwable -> L25
            r0.d(r3, r4)     // Catch: java.lang.Throwable -> L25
        Lc:
            qfb r4 = r1.a     // Catch: java.lang.Throwable -> L25
            r4.getClass()     // Catch: java.lang.Throwable -> L25
            r2.getClass()     // Catch: java.lang.Throwable -> L25
            java.lang.Object r4 = r4.b     // Catch: java.lang.Throwable -> L25
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> L25
            java.lang.Object r0 = r4.get(r3)     // Catch: java.lang.Throwable -> L25
            if (r2 != r0) goto L21
            r4.remove(r3)     // Catch: java.lang.Throwable -> L25
        L21:
            monitor-exit(r1)
            return
        L23:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
            throw r2
        L25:
            r2 = move-exception
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f38.c(r38, s38, t38):void");
    }

    public final void d(s38 s38Var, t38 t38Var) {
        vzk vzkVar = this.g;
        synchronized (vzkVar) {
            jg jgVar = (jg) ((HashMap) vzkVar.b).remove(s38Var);
            if (jgVar != null) {
                jgVar.c = null;
                jgVar.clear();
            }
        }
        if (t38Var.a) {
        } else {
            this.e.L(t38Var, false);
        }
    }

    public final ua7 f(ry9 ry9Var, Object obj, hub hubVar, int i, int i2, Class cls, Class cls2, nyg nygVar, w97 w97Var, v74 v74Var, boolean z, boolean z2, trf trfVar, boolean z3, boolean z4, zlj zljVar, ng8 ng8Var, s38 s38Var, long j) {
        r38 r38Var = (r38) ((HashMap) this.a.b).get(s38Var);
        if (r38Var != null) {
            r38Var.a(zljVar, ng8Var);
            if (h) {
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(s38Var);
            }
            return new ua7(this, zljVar, r38Var);
        }
        r38 r38Var2 = (r38) ((ua7) this.d.h).h();
        synchronized (r38Var2) {
            r38Var2.j = s38Var;
            r38Var2.k = z3;
            r38Var2.l = z4;
        }
        ro9 ro9Var = this.f;
        cj6 cj6Var = (cj6) ((ua7) ro9Var.d).h();
        int i3 = ro9Var.b;
        ro9Var.b = i3 + 1;
        bj6 bj6Var = cj6Var.a;
        e38 e38Var = cj6Var.d;
        bj6Var.c = ry9Var;
        bj6Var.d = obj;
        bj6Var.n = hubVar;
        bj6Var.e = i;
        bj6Var.f = i2;
        bj6Var.p = w97Var;
        bj6Var.g = cls;
        bj6Var.h = e38Var;
        bj6Var.k = cls2;
        bj6Var.o = nygVar;
        bj6Var.i = trfVar;
        bj6Var.j = v74Var;
        bj6Var.q = z;
        bj6Var.r = z2;
        cj6Var.h = ry9Var;
        cj6Var.i = hubVar;
        cj6Var.j = nygVar;
        cj6Var.k = s38Var;
        cj6Var.l = i;
        cj6Var.m = i2;
        cj6Var.n = w97Var;
        cj6Var.o = trfVar;
        cj6Var.p = r38Var2;
        cj6Var.q = i3;
        cj6Var.B = 1;
        cj6Var.r = obj;
        qfb qfbVar = this.a;
        qfbVar.getClass();
        ((HashMap) qfbVar.b).put(s38Var, r38Var2);
        r38Var2.a(zljVar, ng8Var);
        synchronized (r38Var2) {
            r38Var2.s = cj6Var;
            int iG = cj6Var.g(1);
            ((iG == 2 || iG == 3) ? r38Var2.f : r38Var2.l ? r38Var2.h : r38Var2.g).execute(cj6Var);
        }
        if (h) {
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(s38Var);
        }
        return new ua7(this, zljVar, r38Var2);
    }
}
