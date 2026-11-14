package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r55 extends a8o {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final ArrayList r;
    public final fql s;
    public p55 t;
    public q55 u;
    public long v;
    public long w;

    public r55(o55 o55Var) {
        super(o55Var.a);
        this.l = o55Var.b;
        this.m = o55Var.c;
        this.n = o55Var.d;
        this.o = o55Var.e;
        this.p = o55Var.f;
        this.q = o55Var.g;
        this.r = new ArrayList();
        this.s = new fql();
    }

    @Override // defpackage.a8o
    public final void A(gql gqlVar) {
        if (this.u != null) {
            return;
        }
        C(gqlVar);
    }

    public final void C(gql gqlVar) {
        long j;
        long j2;
        long j3;
        fql fqlVar = this.s;
        gqlVar.n(0, fqlVar);
        long j4 = fqlVar.o;
        p55 p55Var = this.t;
        long j5 = this.m;
        ArrayList arrayList = this.r;
        if (p55Var == null || arrayList.isEmpty() || this.o) {
            boolean z = this.p;
            j = this.l;
            if (z) {
                long j6 = fqlVar.k;
                j += j6;
                j2 = j6 + j5;
            } else {
                j2 = j5;
            }
            this.v = j4 + j;
            this.w = j5 != Long.MIN_VALUE ? j4 + j2 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                n55 n55Var = (n55) arrayList.get(i);
                long j7 = this.v;
                long j8 = this.w;
                n55Var.e = j7;
                n55Var.f = j8;
            }
            j3 = j2;
        } else {
            j = this.v - j4;
            j3 = j5 != Long.MIN_VALUE ? this.w - j4 : Long.MIN_VALUE;
        }
        try {
            p55 p55Var2 = new p55(gqlVar, j, j3, this.q);
            this.t = p55Var2;
            n(p55Var2);
        } catch (q55 e) {
            this.u = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((n55) arrayList.get(i2)).g = this.u;
            }
        }
    }

    @Override // defpackage.l73
    public final boolean a(qjd qjdVar) {
        l73 l73Var = this.k;
        return l73Var.i().f.equals(qjdVar.f) && l73Var.a(qjdVar);
    }

    @Override // defpackage.l73
    public final nkd c(jrd jrdVar, l45 l45Var, long j) {
        n55 n55Var = new n55(this.k.c(jrdVar, l45Var, j), this.n, this.v, this.w);
        this.r.add(n55Var);
        return n55Var;
    }

    @Override // defpackage.th5, defpackage.l73
    public final void k() throws q55 {
        q55 q55Var = this.u;
        if (q55Var != null) {
            throw q55Var;
        }
        super.k();
    }

    @Override // defpackage.l73
    public final void o(nkd nkdVar) {
        ArrayList arrayList = this.r;
        z4o.H(arrayList.remove(nkdVar));
        this.k.o(((n55) nkdVar).a);
        if (!arrayList.isEmpty() || this.o) {
            return;
        }
        p55 p55Var = this.t;
        p55Var.getClass();
        C(p55Var.e);
    }

    @Override // defpackage.th5, defpackage.l73
    public final void q() {
        super.q();
        this.u = null;
        this.t = null;
    }
}
