package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ejf extends aqi implements nq {
    public final z13 u;

    public ejf(z13 z13Var, rm rmVar, String str, dl dlVar, int i, bp bpVar, i3j i3jVar, ap apVar) {
        super(yo.OPERA, rmVar, str, dlVar, bpVar, i, i3jVar, apVar);
        this.u = z13Var;
    }

    @Override // defpackage.nq
    public final mq a(dl dlVar, km kmVar, k8 k8Var, kq kqVar, List list) {
        return new fjf(this, dlVar, kmVar, k8Var, kqVar, list);
    }

    @Override // defpackage.aqi, defpackage.yz
    public final void c() {
        super.c();
        this.u.f();
    }

    @Override // defpackage.yz
    public final v50 e() {
        return v50.n;
    }

    @Override // defpackage.aqi
    public final boolean u() {
        z13 z13Var = this.u;
        return !z13Var.e || z13Var.o;
    }
}
