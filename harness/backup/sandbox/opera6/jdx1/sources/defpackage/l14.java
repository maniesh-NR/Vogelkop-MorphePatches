package defpackage;

/* loaded from: classes.dex */
public final class l14 implements hyl {
    public final int a;
    public final oj9 b;
    public final s97 c = new s97();
    public oj9 d;
    public hyl e;
    public long f;

    public l14(int i, int i2, oj9 oj9Var) {
        this.a = i2;
        this.b = oj9Var;
    }

    @Override // defpackage.hyl
    public final void a(long j, int i, int i2, int i3, gyl gylVar) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        hyl hylVar = this.e;
        String str = tym.a;
        hylVar.a(j, i, i2, i3, gylVar);
    }

    @Override // defpackage.hyl
    public final void b(g1g g1gVar, int i, int i2) {
        hyl hylVar = this.e;
        String str = tym.a;
        hylVar.f(i, g1gVar);
    }

    @Override // defpackage.hyl
    public final int d(oc6 oc6Var, int i, boolean z) {
        hyl hylVar = this.e;
        String str = tym.a;
        return hylVar.c(oc6Var, i, z);
    }

    @Override // defpackage.hyl
    public final void g(oj9 oj9Var) {
        oj9 oj9Var2 = this.b;
        if (oj9Var2 != null) {
            oj9Var = oj9Var.d(oj9Var2);
        }
        this.d = oj9Var;
        hyl hylVar = this.e;
        String str = tym.a;
        hylVar.g(oj9Var);
    }
}
