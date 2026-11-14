package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ah9 extends i17 implements i0j, gz9, hi5, j7f, u5m {
    public static final ir5 w = new ir5();
    public lde q;
    public final r2 r;
    public wf9 s;
    public q5c t;
    public wye u;
    public final vg9 v;

    public ah9(lde ldeVar, int i, r2 r2Var) throws pxb {
        this.q = ldeVar;
        this.r = r2Var;
        vg9 vg9Var = new vg9(i, new s2(2, this, ah9.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, (byte) 10), 10);
        T0(vg9Var);
        this.v = vg9Var;
    }

    public final void G(wye wyeVar) throws pxb {
        this.u = wyeVar;
        if (this.v.Y0().g()) {
            if (!wyeVar.Z0().n) {
                X0();
                return;
            }
            wye wyeVar2 = this.u;
            if (wyeVar2 == null || !wyeVar2.Z0().n) {
                return;
            }
            X0();
        }
    }

    @Override // defpackage.b8e
    public final boolean I0() {
        return false;
    }

    public final void J() {
        pqh pqhVar = new pqh();
        x7d.y(this, new gv8(pqhVar, this, (byte) 4));
        q5c q5cVar = (q5c) pqhVar.a;
        if (this.v.Y0().g()) {
            q5c q5cVar2 = this.t;
            if (q5cVar2 != null) {
                q5cVar2.b();
            }
            if (q5cVar != null) {
                q5cVar.a();
            } else {
                q5cVar = null;
            }
            this.t = q5cVar;
        }
    }

    @Override // defpackage.b8e
    public final void N0() {
        q5c q5cVar = this.t;
        if (q5cVar != null) {
            q5cVar.b();
        }
        this.t = null;
    }

    @Override // defpackage.i0j
    public final void R(q0j q0jVar) {
        boolean zG = this.v.Y0().g();
        xtb[] xtbVarArr = o0j.a;
        p0j p0jVar = n0j.l;
        xtb xtbVar = o0j.a[4];
        Boolean boolValueOf = Boolean.valueOf(zG);
        p0jVar.getClass();
        q0jVar.b(p0jVar, boolValueOf);
        q0jVar.b(e0j.w, new c8(null, new qv7(0, this, ah9.class, "requestFocus", "requestFocus()Z", 0, (byte) 8)));
    }

    public final void W0(lde ldeVar, ndb ndbVar) {
        if (!this.n) {
            ldeVar.b(ndbVar);
            return;
        }
        unb unbVar = H0().b.get(ulp.h);
        na2.B(H0(), null, null, new s3(ldeVar, ndbVar, unbVar != null ? unbVar.s(new ry7(ldeVar, ndbVar, (byte) 10)) : null, null, (byte) 29), 3);
    }

    public final void X0() throws pxb {
        tah tahVar;
        if (this.n) {
            if (!this.a.n) {
                a8b.b("visitAncestors called on an unattached node");
            }
            b8e b8eVar = this.a.e;
            m3c m3cVarE0 = ui6.e0(this);
            while (m3cVarE0 != null) {
                if ((((b8e) m3cVarE0.F.g).d & 262144) != 0) {
                    while (b8eVar != null) {
                        if ((b8eVar.c & 262144) != 0) {
                            b8e b8eVarU = b8eVar;
                            dfe dfeVar = null;
                            while (b8eVarU != null) {
                                if (b8eVarU instanceof u5m) {
                                    if (bh9.o == ((u5m) b8eVarU).h()) {
                                        return;
                                    }
                                }
                                if ((b8eVarU.c & 262144) != 0 && (b8eVarU instanceof i17)) {
                                    int i = 0;
                                    for (b8e b8eVar2 = ((i17) b8eVarU).p; b8eVar2 != null; b8eVar2 = b8eVar2.f) {
                                        if ((b8eVar2.c & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                b8eVarU = b8eVar2;
                                            } else {
                                                if (dfeVar == null) {
                                                    dfeVar = new dfe(new b8e[16]);
                                                }
                                                if (b8eVarU != null) {
                                                    dfeVar.c(b8eVarU);
                                                    b8eVarU = null;
                                                }
                                                dfeVar.c(b8eVar2);
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                b8eVarU = ui6.U(dfeVar);
                            }
                        }
                        b8eVar = b8eVar.e;
                    }
                }
                m3cVarE0 = m3cVarE0.u();
                b8eVar = (m3cVarE0 == null || (tahVar = m3cVarE0.F) == null) ? null : (lbl) tahVar.f;
            }
        }
    }

    public final void Y0(lde ldeVar) {
        wf9 wf9Var;
        if (Intrinsics.a(this.q, ldeVar)) {
            return;
        }
        lde ldeVar2 = this.q;
        if (ldeVar2 != null && (wf9Var = this.s) != null) {
            ldeVar2.b(new xf9(wf9Var));
        }
        this.s = null;
        this.q = ldeVar;
    }

    @Override // defpackage.u5m
    public final Object h() {
        return w;
    }
}
