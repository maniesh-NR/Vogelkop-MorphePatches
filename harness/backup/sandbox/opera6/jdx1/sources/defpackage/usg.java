package defpackage;

import android.os.Trace;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class usg implements t5c {
    public final int a;
    public final p8f b;
    public final Function1 c;
    public yo5 d;
    public gkk e;
    public fkk f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public ly l;
    public boolean m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public final /* synthetic */ tn r;

    public usg(tn tnVar, int i, p8f p8fVar, Function1 function1) {
        this.r = tnVar;
        this.a = i;
        this.b = p8fVar;
        this.c = function1;
        tpl.a.getClass();
        f9e.a.getClass();
        this.p = f9e.b();
    }

    @Override // defpackage.t5c
    public final void a() {
        this.m = true;
    }

    public final void b() {
        fkk fkkVar = this.f;
        if (fkkVar != null) {
            fkkVar.cancel();
        }
        this.f = null;
        gkk gkkVar = this.e;
        if (gkkVar != null) {
            gkkVar.dispose();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(unk unkVar) {
        boolean zD;
        if (!this.r.a) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(unkVar);
            } finally {
                Trace.endSection();
            }
        } else {
            zD = d(unkVar);
        }
        Trace.setCounter("compose:lazy:prefetch:execute:item", -1L);
        return zD;
    }

    @Override // defpackage.t5c
    public final void cancel() {
        if (this.h) {
            return;
        }
        this.h = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x01d9  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.unk r22) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usg.d(unk):boolean");
    }

    public final boolean e() {
        fkk fkkVar;
        return this.i || ((fkkVar = this.f) != null && fkkVar.j());
    }

    public final void f(Object obj, Object obj2, pv2 pv2Var) {
        fkk esgVar;
        fkk fkkVar = this.f;
        boolean z = false;
        if (fkkVar == null) {
            tn tnVar = this.r;
            Function2 function2A = ((j5c) tnVar.b).a(this.a, obj, obj2);
            z3c z3cVarA = ((hkk) tnVar.c).a();
            byte b = 21;
            if (z3cVarA.a.H()) {
                z3cVarA.k(obj, function2A, true);
                esgVar = new esg(b, z3cVarA, obj, z);
            } else {
                esgVar = new bpd(z3cVarA, obj, b);
            }
            fkkVar = esgVar;
            this.f = fkkVar;
            this.j = obj;
        }
        this.q = false;
        while (!fkkVar.j() && !this.q) {
            fkkVar.i(new mgf(this, pv2Var, (byte) 8));
        }
        h();
        boolean z2 = this.q;
        long j = this.o;
        if (z2) {
            pv2Var.b = pv2.a(j, pv2Var.b);
        } else {
            pv2Var.a = pv2.a(j, pv2Var.a);
        }
    }

    public final boolean g(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        return j > j2;
    }

    public final void h() {
        tpl.a.getClass();
        f9e f9eVar = f9e.a;
        f9eVar.getClass();
        long jB = f9e.b();
        long j = this.p;
        f9eVar.getClass();
        long jG = pn7.g(z4o.x0(jB, j, un7.b));
        this.o = jG;
        long j2 = this.n - jG;
        this.n = j2;
        this.p = jB;
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", j2);
    }

    public final String toString() {
        yo5 yo5Var = this.d;
        boolean zE = e();
        boolean z = this.g;
        boolean z2 = this.h;
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.a);
        sb.append(", constraints = ");
        sb.append(yo5Var);
        sb.append(", isComposed = ");
        z1m.v(sb, zE, ", isMeasured = ", z, ", isCanceled = ");
        return z1m.m(sb, z2, " }");
    }
}
