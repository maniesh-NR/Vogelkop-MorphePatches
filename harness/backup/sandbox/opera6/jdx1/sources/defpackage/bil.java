package defpackage;

/* loaded from: classes.dex */
public final class bil implements mgl {
    public xjl b;
    public final /* synthetic */ dil d;
    public boolean a = true;
    public hai c = ujp.o;

    public bil(dil dilVar) {
        this.d = dilVar;
    }

    @Override // defpackage.mgl
    public final void a() {
    }

    @Override // defpackage.mgl
    public final void b(long j, hai haiVar) {
        long j2;
        ojl ojlVarD;
        ojl ojlVarD2;
        dil dilVar = this.d;
        if (dilVar.i() && ((x6a) dilVar.q.getValue()) == null) {
            dilVar.q(x6a.c);
            dilVar.s = -1;
            this.a = true;
            this.c = haiVar;
            dilVar.m();
            gbc gbcVar = dilVar.d;
            if (gbcVar == null || (ojlVarD2 = gbcVar.d()) == null || !ojlVarD2.c(j)) {
                j2 = j;
                gbc gbcVar2 = dilVar.d;
                if (gbcVar2 != null && (ojlVarD = gbcVar2.d()) != null) {
                    int iG = dilVar.b.g(ojlVarD.b(j2, true));
                    mil milVarB = dil.b(dilVar.l().a, upj.c(iG, iG));
                    dilVar.e(false);
                    fgg fggVar = dilVar.j;
                    if (fggVar != null) {
                        fggVar.a(0);
                    }
                    dilVar.c.invoke(milVarB);
                    dilVar.v = new xjl(milVarB.b);
                }
                this.a = false;
            } else {
                if (dilVar.l().a.b.length() == 0) {
                    return;
                }
                dilVar.e(false);
                long jV = dilVar.v(mil.a(dilVar.l(), null, xjl.b, 5), j, true, false, this.c, true, new k7a(0));
                j2 = j;
                dilVar.o = new xjl(jV);
                this.b = new xjl(jV);
            }
            dilVar.r(b7a.a);
            dilVar.n = j2;
            dilVar.p(new y8f(j2));
            dilVar.p = 0L;
        }
    }

    @Override // defpackage.mgl
    public final void c() {
    }

    @Override // defpackage.mgl
    public final void d(long j) {
        ojl ojlVarD;
        long jV;
        dil dilVar = this.d;
        if (!dilVar.i() || dilVar.l().a.b.length() == 0) {
            return;
        }
        dilVar.p = y8f.e(dilVar.p, j);
        gbc gbcVar = dilVar.d;
        if (gbcVar != null && (ojlVarD = gbcVar.d()) != null) {
            dilVar.p(new y8f(y8f.e(dilVar.n, dilVar.p)));
            if (dilVar.o != null || ojlVarD.c(dilVar.g().a)) {
                xjl xjlVar = dilVar.o;
                int iB = xjlVar != null ? (int) (xjlVar.a >> 32) : ojlVarD.b(dilVar.n, false);
                int iB2 = ojlVarD.b(dilVar.g().a, false);
                if (dilVar.o == null && iB == iB2) {
                    return;
                } else {
                    jV = dilVar.v(dilVar.l(), dilVar.g().a, false, false, this.c, true, new k7a(9));
                }
            } else {
                jV = dilVar.v(dilVar.l(), dilVar.g().a, false, false, dilVar.b.g(ojlVarD.b(dilVar.n, true)) == dilVar.b.g(ojlVarD.b(dilVar.g().a, true)) ? ujp.o : ujp.p, true, new k7a(9));
            }
            this.b = new xjl(jV);
            if (!xjl.a(jV, dilVar.o)) {
                this.a = false;
            }
        }
        dilVar.u(false);
    }

    public final void e() {
        dil dilVar = this.d;
        dilVar.q(null);
        dilVar.p(null);
        this.c = ujp.o;
        dilVar.u(true);
        xjl xjlVar = this.b;
        boolean zC = xjl.c(xjlVar != null ? xjlVar.a : dilVar.l().b);
        dilVar.r(zC ? b7a.c : b7a.b);
        gbc gbcVar = dilVar.d;
        if (gbcVar != null) {
            gbcVar.m.setValue(Boolean.valueOf(!zC && dbh.A(dilVar, true)));
        }
        gbc gbcVar2 = dilVar.d;
        if (gbcVar2 != null) {
            gbcVar2.n.setValue(Boolean.valueOf(!zC && dbh.A(dilVar, false)));
        }
        gbc gbcVar3 = dilVar.d;
        if (gbcVar3 != null) {
            gbcVar3.o.setValue(Boolean.valueOf(zC && dbh.A(dilVar, true)));
        }
        if (this.a) {
            dilVar.n(dilVar.o);
        }
        dilVar.o = null;
    }

    @Override // defpackage.mgl
    public final void onCancel() {
        e();
    }

    @Override // defpackage.mgl
    public final void onStop() {
        e();
    }
}
