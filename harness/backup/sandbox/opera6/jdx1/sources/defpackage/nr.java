package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nr implements zd4 {
    public final zd4 a;
    public final mr b;
    public final lr c;

    public nr(zd4 zd4Var, mr mrVar) {
        this.a = zd4Var;
        this.b = mrVar;
        ec4 ec4Var = mrVar.c;
        mc4 mc4VarD = zd4Var.d();
        ec4Var.p();
        this.c = new lr(mc4VarD);
    }

    @Override // defpackage.zd4, defpackage.jb4
    public final ud4 a() {
        return this.b;
    }

    @Override // defpackage.zd4
    public final x6f b() {
        return this.a.b();
    }

    @Override // defpackage.prm
    public final void c(qrm qrmVar) {
        this.a.c(qrmVar);
    }

    @Override // defpackage.zd4
    public final mc4 d() {
        return this.c;
    }

    @Override // defpackage.zd4
    public final cc4 e() {
        return this.a.e();
    }

    @Override // defpackage.zd4
    public final void f(boolean z) {
        this.a.f(z);
    }

    @Override // defpackage.zd4
    public final xd4 g() {
        return this.b;
    }

    @Override // defpackage.zd4
    public final boolean h() {
        return this.a.h();
    }

    @Override // defpackage.zd4
    public final void i(ec4 ec4Var) {
        this.a.i(ec4Var);
    }

    @Override // defpackage.prm
    public final void j(qrm qrmVar) {
        this.a.j(qrmVar);
    }

    @Override // defpackage.prm
    public final void k(qrm qrmVar) {
        this.a.k(qrmVar);
    }

    @Override // defpackage.zd4
    public final boolean l() {
        return this.a.l();
    }

    @Override // defpackage.zd4
    public final void m(ArrayList arrayList) {
        this.a.m(arrayList);
    }

    @Override // defpackage.zd4
    public final void n(ArrayList arrayList) {
        this.a.n(arrayList);
    }

    @Override // defpackage.zd4
    public final boolean p() {
        return this.a.p();
    }

    @Override // defpackage.zd4
    public final void q(boolean z) {
        this.a.q(z);
    }

    @Override // defpackage.prm
    public final void r(qrm qrmVar) {
        this.a.r(qrmVar);
    }

    @Override // defpackage.zd4
    public final ListenableFuture release() {
        return this.a.release();
    }
}
