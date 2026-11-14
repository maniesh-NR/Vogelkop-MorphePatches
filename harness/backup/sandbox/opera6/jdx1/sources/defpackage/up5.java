package defpackage;

/* loaded from: classes.dex */
public final class up5 extends i73 {
    public final int o;
    public final long p;
    public final m14 q;
    public long r;
    public volatile boolean s;
    public boolean t;

    public up5(ed6 ed6Var, nd6 nd6Var, oj9 oj9Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, m14 m14Var) {
        super(ed6Var, nd6Var, oj9Var, i, obj, j, j2, j3, j4, j5);
        this.o = i2;
        this.p = j6;
        this.q = m14Var;
    }

    @Override // defpackage.fgd
    public final long a() {
        return this.j + this.o;
    }

    @Override // defpackage.fgd
    public final boolean b() {
        return this.t;
    }

    @Override // defpackage.rsc
    public final void cancelLoad() {
        this.s = true;
    }

    @Override // defpackage.rsc
    public final void load() {
        k5o k5oVar = this.m;
        k5oVar.getClass();
        if (this.r == 0) {
            long j = this.p;
            for (uhi uhiVar : (uhi[]) k5oVar.c) {
                if (uhiVar.F != j) {
                    uhiVar.F = j;
                    uhiVar.z = true;
                }
            }
            m14 m14Var = this.q;
            long j2 = this.k;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.p;
            long j4 = this.l;
            m14Var.b(k5oVar, j3, j4 != -9223372036854775807L ? j4 - this.p : -9223372036854775807L);
        }
        try {
            nd6 nd6VarB = this.b.b(this.r);
            vbk vbkVar = this.i;
            lp6 lp6Var = new lp6(vbkVar, nd6VarB.e, vbkVar.b(nd6VarB));
            while (!this.s) {
                try {
                    int iB = this.q.a.b(lp6Var, m14.j);
                    z4o.H(iB != 1);
                    if (!(iB == 0)) {
                        break;
                    }
                } finally {
                    this.r = lp6Var.d - this.b.e;
                }
            }
            oj9 oj9Var = this.d;
            String str = oj9Var.m;
            int i = oj9Var.M;
            int i2 = oj9Var.N;
            if (dzd.m(str) && ((i > 1 || i2 > 1) && i != -1 && i2 != -1)) {
                hyl hylVarS = k5oVar.s(4);
                int i3 = i * i2;
                long j5 = (this.h - this.g) / i3;
                for (int i4 = 1; i4 < i3; i4++) {
                    hylVarS.f(0, new g1g());
                    hylVarS.a(i4 * j5, 0, 0, 0, null);
                }
            }
            oup.P(this.i);
            this.t = !this.s;
        } catch (Throwable th) {
            oup.P(this.i);
            throw th;
        }
    }
}
