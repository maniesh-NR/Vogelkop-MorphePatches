package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ace {
    public sf1 a;
    public mh9 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public jwb h;
    public n27 j;
    public ikl k;
    public x79 l;
    public d2c m;
    public njl n;
    public long q;
    public long i = e8b.a;
    public int o = -1;
    public int p = -1;

    public ace(sf1 sf1Var, ikl iklVar, mh9 mh9Var, int i, boolean z, int i2, int i3, List list) {
        this.a = sf1Var;
        this.b = mh9Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.k = iklVar;
    }

    public final int a(int i, d2c d2cVar) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = ap5.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            jwb jwbVarS = x1p.s(this.h, d2cVar, this.k, this.j, this.b);
            this.h = jwbVarS;
            jA = jwbVarS.a(this.f, jA);
        }
        int iD = y7h.d(b(jA, d2cVar).e);
        int i4 = yo5.i(jA);
        if (iD < i4) {
            iD = i4;
        }
        this.o = i;
        this.p = iD;
        return iD;
    }

    public final xbe b(long j, d2c d2cVar) {
        x79 x79VarE = e(d2cVar);
        long jL = c09.l(j, this.d, this.c, x79VarE.D());
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new xbe(x79VarE, jL, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final boolean c(long j, d2c d2cVar) {
        this.q = (this.q << 2) | 3;
        if (this.f > 1) {
            jwb jwbVarS = x1p.s(this.h, d2cVar, this.k, this.j, this.b);
            this.h = jwbVarS;
            j = jwbVarS.a(this.f, j);
        }
        njl njlVar = this.n;
        if (njlVar != null) {
            xbe xbeVar = njlVar.b;
            mjl mjlVar = njlVar.a;
            if (!xbeVar.a.B()) {
                d2c d2cVar2 = mjlVar.h;
                long j2 = mjlVar.j;
                if (d2cVar == d2cVar2 && (yo5.b(j, j2) || (yo5.h(j) == yo5.h(j2) && yo5.j(j) == yo5.j(j2) && yo5.g(j) >= xbeVar.e && !xbeVar.c))) {
                    if (yo5.b(j, this.n.a.j)) {
                        return false;
                    }
                    this.n = f(d2cVar, j, this.n.b);
                    return true;
                }
            }
        }
        this.n = f(d2cVar, j, b(j, d2cVar));
        return true;
    }

    public final void d(n27 n27Var) {
        long jA;
        n27 n27Var2 = this.j;
        if (n27Var != null) {
            int i = e8b.b;
            jA = e8b.a(n27Var.b(), n27Var.n0());
        } else {
            jA = e8b.a;
        }
        if (n27Var2 == null) {
            this.j = n27Var;
            this.i = jA;
        } else if (n27Var == null || this.i != jA) {
            this.j = n27Var;
            this.i = jA;
            this.q = (this.q << 2) | 1;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
    }

    public final x79 e(d2c d2cVar) {
        x79 x79Var = this.l;
        if (x79Var == null || d2cVar != this.m || x79Var.B()) {
            this.m = d2cVar;
            sf1 sf1Var = this.a;
            ikl iklVarV = xgh.v(this.k, d2cVar);
            n27 n27Var = this.j;
            mh9 mh9Var = this.b;
            l08 l08Var = this.g;
            if (l08Var == null) {
                l08Var = l08.a;
            }
            x79Var = new x79(sf1Var, n27Var, mh9Var, iklVarV, l08Var, this.d);
        }
        this.l = x79Var;
        return x79Var;
    }

    public final njl f(d2c d2cVar, long j, xbe xbeVar) {
        float fMin = Math.min(xbeVar.a.D(), xbeVar.d);
        sf1 sf1Var = this.a;
        ikl iklVar = this.k;
        l08 l08Var = this.g;
        if (l08Var == null) {
            l08Var = l08.a;
        }
        return new njl(new mjl(sf1Var, iklVar, l08Var, this.e, this.d, this.c, this.j, d2cVar, this.b, j), xbeVar, ap5.d(j, (y7h.d(fMin) << 32) | (y7h.d(xbeVar.e) & 4294967295L)));
    }

    public final String toString() {
        String str = this.n != null ? "<TextLayoutResult>" : "null";
        String strB = e8b.b(this.i);
        long j = this.q;
        njl njlVar = this.n;
        Object yo5Var = njlVar != null ? new yo5(njlVar.a.j) : "null";
        StringBuilder sbN = z1m.n("MultiParagraphLayoutCache(textLayoutResult=", str, ", lastDensity=", strB, ", history=");
        sbN.append(j);
        sbN.append(", constraints=");
        sbN.append(yo5Var);
        sbN.append(")");
        return sbN.toString();
    }
}
