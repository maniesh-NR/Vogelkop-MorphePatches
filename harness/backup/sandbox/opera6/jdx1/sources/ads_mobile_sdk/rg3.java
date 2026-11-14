package ads_mobile_sdk;

import defpackage.cs5;
import defpackage.z1m;
import java.io.Closeable;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class rg3 implements Closeable {
    public kh3 a;
    public final rg3 b;
    public final long c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicLong e = new AtomicLong();
    public final AtomicLong f = new AtomicLong();

    public rg3(fw0 fw0Var, kh3 kh3Var, rg3 rg3Var, long j) {
        this.a = kh3Var;
        this.b = rg3Var;
        this.c = j;
        vr3 vr3Var = xu0.a;
        sko.t("Trace ", fw0Var.name(), " started.", (Throwable) null);
    }

    public abstract rg3 a(fw0 fw0Var, List list, boolean z);

    public final void a(Throwable th) {
        if (!this.d.get()) {
            e().m = false;
            e().o = th;
            return;
        }
        nw.a("This trace " + e().c.name() + " has already finished, can't set causing exception");
    }

    public void a$1() {
        if (this.d.getAndSet(true)) {
            nw.a("This trace " + e().c.name() + " has already finished, can't finish again");
            return;
        }
        ub2 ub2VarE = e();
        on7 on7Var = pn7.b;
        long j = this.e.get();
        un7 un7Var = un7.d;
        ub2VarE.q = cs5.y0(j, un7Var);
        e().r = cs5.y0(this.f.get(), un7Var);
        rg3 rg3Var = this.b;
        if (rg3Var != null) {
            rg3Var.f.addAndGet(pn7.f(pn7.m(e().q, e().r)));
        }
        h();
        ub2 ub2VarE2 = e();
        String str = ub2VarE2.m ? "successfully" : "unsuccessfully";
        vr3 vr3Var = xu0.a;
        String strName = ub2VarE2.c.name();
        long jF = pn7.f(ub2VarE2.p);
        StringBuilder sbN = z1m.n("Trace ", strName, " completed ", str, " in ");
        sbN.append(jF);
        sbN.append("ms.");
        xu0.b(sbN.toString(), null);
    }

    public final void b(Throwable th) {
        if (!this.d.get()) {
            e().m = false;
            e().n = th;
            return;
        }
        nw.a("This trace " + e().c.name() + " has already finished, can't set exception");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ub2 ub2VarE;
        fw0 fw0Var;
        gh3 gh3VarB = hh3.b();
        rg3 rg3Var = gh3VarB.a;
        if (rg3Var == null) {
            nw.a("Tried to end trace " + e().c.name() + " (" + e().a + "), but there was no active trace. If this is a test, did you forget to add a TraceThreadContextElement to your CoroutineScope?");
        }
        if (this != rg3Var) {
            String strName = e().c.name();
            int i = e().a;
            String strName2 = (rg3Var == null || (ub2VarE = rg3Var.e()) == null || (fw0Var = ub2VarE.c) == null) ? null : fw0Var.name();
            Integer numValueOf = rg3Var != null ? Integer.valueOf(rg3Var.e().a) : null;
            StringBuilder sbP = sko.p(i, "Tried to end trace ", strName, " (", "), but that trace is not the current trace. The current trace is ");
            sbP.append(strName2);
            sbP.append(" (");
            sbP.append(numValueOf);
            sbP.append(").");
            nw.a(sbP.toString());
        }
        hh3.a(gh3VarB, rg3Var != null ? rg3Var.b : null);
        a$1();
    }

    public abstract ub2 e();

    public abstract void h();
}
