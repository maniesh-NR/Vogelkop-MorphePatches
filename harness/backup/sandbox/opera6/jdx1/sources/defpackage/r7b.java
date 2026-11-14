package defpackage;

/* loaded from: classes.dex */
public final class r7b extends wz4 {
    public final m14 j;
    public k5o k;
    public long l;
    public volatile boolean m;

    public r7b(ed6 ed6Var, nd6 nd6Var, oj9 oj9Var, int i, Object obj, m14 m14Var) {
        super(ed6Var, nd6Var, 2, oj9Var, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.j = m14Var;
    }

    @Override // defpackage.rsc
    public final void cancelLoad() {
        this.m = true;
    }

    @Override // defpackage.rsc
    public final void load() {
        if (this.l == 0) {
            this.j.b(this.k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            nd6 nd6VarB = this.b.b(this.l);
            vbk vbkVar = this.i;
            lp6 lp6Var = new lp6(vbkVar, nd6VarB.e, vbkVar.b(nd6VarB));
            while (!this.m) {
                try {
                    int iB = this.j.a.b(lp6Var, m14.j);
                    boolean z = false;
                    z4o.H(iB != 1);
                    if (iB == 0) {
                        z = true;
                    }
                    if (!z) {
                        break;
                    }
                } finally {
                    this.l = lp6Var.d - this.b.e;
                    this.j.a();
                }
            }
        } finally {
            oup.P(this.i);
        }
    }
}
