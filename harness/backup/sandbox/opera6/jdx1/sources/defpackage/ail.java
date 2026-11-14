package defpackage;

/* loaded from: classes.dex */
public final class ail implements mgl {
    public final /* synthetic */ dil a;
    public final /* synthetic */ boolean b;

    public ail(dil dilVar, boolean z) {
        this.a = dilVar;
        this.b = z;
    }

    @Override // defpackage.mgl
    public final void a() {
        ojl ojlVarD;
        boolean z = this.b;
        x6a x6aVar = z ? x6a.b : x6a.c;
        dil dilVar = this.a;
        dilVar.q(x6aVar);
        long jA = hzi.a(dilVar.j(z));
        gbc gbcVar = dilVar.d;
        if (gbcVar == null || (ojlVarD = gbcVar.d()) == null) {
            return;
        }
        long jE = ojlVarD.e(jA);
        dilVar.n = jE;
        dilVar.p(new y8f(jE));
        dilVar.p = 0L;
        dilVar.s = -1;
        gbc gbcVar2 = dilVar.d;
        if (gbcVar2 != null) {
            gbcVar2.q.setValue(Boolean.TRUE);
        }
        dilVar.u(false);
    }

    @Override // defpackage.mgl
    public final void b(long j, hai haiVar) {
    }

    @Override // defpackage.mgl
    public final void c() {
        dil dilVar = this.a;
        dilVar.q(null);
        dilVar.p(null);
        dilVar.u(true);
    }

    @Override // defpackage.mgl
    public final void d(long j) {
        dil dilVar = this.a;
        long jE = y8f.e(dilVar.p, j);
        dilVar.p = jE;
        dilVar.p(new y8f(y8f.e(dilVar.n, jE)));
        dilVar.v(dilVar.l(), dilVar.g().a, false, this.b, ujp.r, true, new k7a(9));
        dilVar.u(false);
    }

    @Override // defpackage.mgl
    public final void onCancel() {
    }

    @Override // defpackage.mgl
    public final void onStop() {
        dil dilVar = this.a;
        dilVar.q(null);
        dilVar.p(null);
        dilVar.u(true);
    }
}
