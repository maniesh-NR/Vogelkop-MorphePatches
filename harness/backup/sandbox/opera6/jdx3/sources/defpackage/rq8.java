package defpackage;

/* loaded from: classes.dex */
public final class rq8 {
    public final r9i a;
    public final g77 b;
    public final lld c;
    public final jv1 d;
    public final jv1 e;
    public final jv1 f;
    public final rb g;
    public final ode h = new ode();

    public rq8(r9i r9iVar, g77 g77Var, lld lldVar, uu1 uu1Var, jv1 jv1Var, jv1 jv1Var2, jv1 jv1Var3, rb rbVar) {
        this.a = r9iVar;
        this.b = g77Var;
        this.c = lldVar;
        this.d = jv1Var;
        this.e = jv1Var2;
        this.f = jv1Var3;
        this.g = rbVar;
        lldVar.e0(new hu5((Object) new oz2((byte) 2, this, false), (Object) this, (byte) 10));
    }

    public final void a(nq8 nq8Var, boolean z) {
        rn9 rn9Var = new rn9((byte) 16, (Object) this, (Object) nq8Var, z);
        r9i r9iVar = this.a;
        qie qieVar = (qie) r9iVar.e;
        umi umiVar = (umi) r9iVar.c;
        nml nmlVarE = umiVar.e(new bm8(r9iVar, (byte) 2));
        nmlVarE.b(umiVar.f(new bm8(rn9Var, (byte) 3)));
        qieVar.n(new oml(nmlVarE), null);
    }

    public final void b(oq8 oq8Var) {
        ode odeVar = this.h;
        if (oq8Var != null) {
            odeVar.r(new jq8(oq8Var.b, oq8Var.c));
        } else {
            l08 l08Var = l08.a;
            odeVar.r(new jq8(l08Var, l08Var));
        }
    }
}
