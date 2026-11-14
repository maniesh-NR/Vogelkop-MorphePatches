package defpackage;

/* loaded from: classes.dex */
public final class yhl implements mgl {
    public final /* synthetic */ dil a;

    public yhl(dil dilVar) {
        this.a = dilVar;
    }

    @Override // defpackage.mgl
    public final void a() {
    }

    @Override // defpackage.mgl
    public final void b(long j, hai haiVar) {
        ojl ojlVarD;
        dil dilVar = this.a;
        long jA = hzi.a(dilVar.j(true));
        gbc gbcVar = dilVar.d;
        if (gbcVar == null || (ojlVarD = gbcVar.d()) == null) {
            return;
        }
        long jE = ojlVarD.e(jA);
        dilVar.n = jE;
        dilVar.p(new y8f(jE));
        dilVar.p = 0L;
        dilVar.q(x6a.a);
        dilVar.u(false);
    }

    @Override // defpackage.mgl
    public final void c() {
        dil dilVar = this.a;
        dilVar.q(null);
        dilVar.p(null);
    }

    @Override // defpackage.mgl
    public final void d(long j) {
        ojl ojlVarD;
        fgg fggVar;
        dil dilVar = this.a;
        dilVar.p = y8f.e(dilVar.p, j);
        gbc gbcVar = dilVar.d;
        if (gbcVar == null || (ojlVarD = gbcVar.d()) == null) {
            return;
        }
        dilVar.p(new y8f(y8f.e(dilVar.n, dilVar.p)));
        int iG = dilVar.b.g(ojlVarD.b(dilVar.g().a, true));
        long jC = upj.c(iG, iG);
        if (xjl.b(jC, dilVar.l().b)) {
            return;
        }
        gbc gbcVar2 = dilVar.d;
        if ((gbcVar2 == null || ((Boolean) gbcVar2.q.getValue()).booleanValue()) && (fggVar = dilVar.j) != null) {
            fggVar.a(9);
        }
        dilVar.c.invoke(dil.b(dilVar.l().a, jC));
        dilVar.v = new xjl(jC);
    }

    @Override // defpackage.mgl
    public final void onCancel() {
    }

    @Override // defpackage.mgl
    public final void onStop() {
        dil dilVar = this.a;
        dilVar.q(null);
        dilVar.p(null);
    }
}
