package defpackage;

import android.os.Trace;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public abstract class pb3 {
    public static final hp7 a = new hp7(new vk1((byte) 25), (byte) 1);
    public static Boolean b;

    public static final void a(final sf1 sf1Var, final ikl iklVar, final mh9 mh9Var, final List list, final boolean z, ih5 ih5Var) {
        vt9 vt9Var = (vt9) ih5Var;
        Executor executor = (Executor) vt9Var.j(a);
        if (executor == null || !b(sf1Var.b.length())) {
            vt9Var.W(317137883);
            vt9Var.p(false);
            return;
        }
        vt9Var.W(315439796);
        final d2c d2cVar = (d2c) vt9Var.j(mi5.n);
        final n27 n27Var = (n27) vt9Var.j(mi5.h);
        try {
            executor.execute(new Runnable() { // from class: ob3
                @Override // java.lang.Runnable
                public final void run() {
                    yee yeeVarC;
                    ikl iklVar2 = iklVar;
                    d2c d2cVar2 = d2cVar;
                    sf1 sf1Var2 = sf1Var;
                    n27 n27Var2 = n27Var;
                    mh9 mh9Var2 = mh9Var;
                    boolean z2 = z;
                    Trace.beginSection("BackgroundTextMeasurement");
                    try {
                        ttj ttjVarH = ytj.h();
                        yee yeeVar = ttjVarH instanceof yee ? (yee) ttjVarH : null;
                        if (yeeVar == null || (yeeVarC = yeeVar.C(null, null)) == null) {
                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        }
                        try {
                            ttj ttjVarJ = yeeVarC.j();
                            try {
                                ikl iklVarV = xgh.v(iklVar2, d2cVar2);
                                l08 l08Var = list;
                                if (l08Var == null) {
                                    l08Var = l08.a;
                                }
                                x79 x79Var = new x79(sf1Var2, n27Var2, mh9Var2, iklVarV, l08Var, z2);
                                x79Var.D();
                                x79Var.E();
                                ttj.q(ttjVarJ);
                                yeeVarC.w().f();
                                yeeVarC.c();
                            } catch (Throwable th) {
                                ttj.q(ttjVarJ);
                                throw th;
                            }
                        } finally {
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        vt9Var.p(false);
    }

    public static final boolean b(int i) {
        if (i >= 8 && i < 1000) {
            Boolean boolValueOf = b;
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                b = boolValueOf;
            }
            if (boolValueOf.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
