package defpackage;

/* loaded from: classes.dex */
public final class cmj extends i73 {
    public final int o;
    public final oj9 p;
    public long q;
    public boolean r;

    public cmj(ed6 ed6Var, nd6 nd6Var, oj9 oj9Var, int i, Object obj, long j, long j2, long j3, int i2, oj9 oj9Var2) {
        super(ed6Var, nd6Var, oj9Var, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.o = i2;
        this.p = oj9Var2;
    }

    @Override // defpackage.fgd
    public final boolean b() {
        return this.r;
    }

    @Override // defpackage.rsc
    public final void cancelLoad() {
    }

    @Override // defpackage.rsc
    public final void load() {
        vbk vbkVar = this.i;
        k5o k5oVar = this.m;
        k5oVar.getClass();
        int iC = 0;
        for (uhi uhiVar : (uhi[]) k5oVar.c) {
            if (uhiVar.F != 0) {
                uhiVar.F = 0L;
                uhiVar.z = true;
            }
        }
        hyl hylVarS = k5oVar.s(this.o);
        hylVarS.g(this.p);
        try {
            long jB = vbkVar.b(this.b.b(this.q));
            if (jB != -1) {
                jB += this.q;
            }
            lp6 lp6Var = new lp6(vbkVar, this.q, jB);
            while (true) {
                long j = this.q;
                if (iC == -1) {
                    hylVarS.a(this.g, 1, (int) j, 0, null);
                    oup.P(vbkVar);
                    this.r = true;
                    return;
                }
                this.q = j + iC;
                iC = hylVarS.c(lp6Var, Integer.MAX_VALUE, true);
            }
        } catch (Throwable th) {
            oup.P(vbkVar);
            throw th;
        }
    }
}
