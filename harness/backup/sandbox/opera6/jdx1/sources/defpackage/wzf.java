package defpackage;

/* loaded from: classes.dex */
public final class wzf {
    public String a;
    public ikl b;
    public mh9 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public vfd i;
    public y81 j;
    public boolean k;
    public jwb m;
    public c91 n;
    public d2c o;
    public long s;
    public long h = e8b.a;
    public long l = 0;
    public long p = ap5.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public wzf(String str, ikl iklVar, mh9 mh9Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = iklVar;
        this.c = mh9Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final int a(int i, d2c d2cVar) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = ap5.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jwb jwbVarS = x1p.s(this.m, d2cVar, this.b, this.i, this.c);
            this.m = jwbVarS;
            jA = jwbVarS.a(this.g, jA);
        }
        c91 c91Var = (c91) d(d2cVar);
        long jL = c09.l(jA, this.e, this.d, c91Var.i.c());
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iD = y7h.d(new y81(c91Var, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jL).f);
        int i6 = yo5.i(jA);
        if (iD < i6) {
            iD = i6;
        }
        this.q = i;
        this.r = iD;
        return iD;
    }

    public final boolean b(long j, d2c d2cVar) {
        long jA;
        c91 c91Var;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        if (this.g > 1) {
            jwb jwbVarS = x1p.s(this.m, d2cVar, this.b, this.i, this.c);
            this.m = jwbVarS;
            jA = jwbVarS.a(this.g, j);
        } else {
            jA = j;
        }
        y81 y81Var = this.j;
        boolean z2 = false;
        if (y81Var != null && (c91Var = this.n) != null && !c91Var.a() && d2cVar == this.o && (yo5.b(jA, this.p) || (yo5.h(jA) == yo5.h(this.p) && yo5.j(jA) == yo5.j(this.p) && yo5.g(jA) >= y81Var.f && !y81Var.d.d))) {
            if (!yo5.b(jA, this.p)) {
                y81 y81Var2 = this.j;
                this.l = ap5.d(jA, (y7h.d(Math.min(y81Var2.a.i.c(), y81Var2.c())) << 32) | (y7h.d(y81Var2.f) & 4294967295L));
                if (this.d == 3 || (((int) (r12 >> 32)) >= y81Var2.c() && ((int) (r12 & 4294967295L)) >= y81Var2.f)) {
                    z = false;
                }
                this.k = z;
                this.p = jA;
            }
            return false;
        }
        c91 c91Var2 = (c91) d(d2cVar);
        long jL = c09.l(jA, this.e, this.d, c91Var2.i.c());
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        y81 y81Var3 = new y81(c91Var2, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jL);
        this.p = jA;
        int iD = y7h.d(y81Var3.c());
        float f = y81Var3.f;
        this.l = ap5.d(jA, (iD << 32) | (y7h.d(f) & 4294967295L));
        if (this.d != 3 && (((int) (r3 >> 32)) < y81Var3.c() || ((int) (r3 & 4294967295L)) < f)) {
            z2 = true;
        }
        this.k = z2;
        this.j = y81Var3;
        return true;
    }

    public final void c(vfd vfdVar) {
        long jA;
        vfd vfdVar2 = this.i;
        if (vfdVar != null) {
            int i = e8b.b;
            jA = e8b.a(vfdVar.b(), vfdVar.n0());
        } else {
            jA = e8b.a;
        }
        if (vfdVar2 == null) {
            this.i = vfdVar;
            this.h = jA;
            return;
        }
        if (vfdVar == null || this.h != jA) {
            this.i = vfdVar;
            this.h = jA;
            this.s = (this.s << 2) | 1;
            this.j = null;
            this.n = null;
            this.o = null;
            this.q = -1;
            this.r = -1;
            this.p = ap5.h(0, 0, 0, 0);
            this.l = 0L;
            this.k = false;
        }
    }

    public final vzf d(d2c d2cVar) {
        c91 c91Var = this.n;
        if (c91Var == null || d2cVar != this.o || c91Var.a()) {
            this.o = d2cVar;
            String str = this.a;
            ikl iklVarV = xgh.v(this.b, d2cVar);
            l08 l08Var = l08.a;
            c91Var = new c91(str, iklVarV, l08Var, l08Var, this.c, this.i, this.e);
        }
        this.n = c91Var;
        return c91Var;
    }

    public final String toString() {
        return j7c.o(this.s, ", constraints=$)", z1m.n("ParagraphLayoutCache(paragraph=", this.j != null ? "<paragraph>" : "null", ", lastDensity=", e8b.b(this.h), ", history="));
    }
}
