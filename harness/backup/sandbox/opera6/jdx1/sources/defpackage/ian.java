package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ian implements zd4 {
    public final zd4 a;
    public final lr b;
    public final kan c;
    public final jan d;

    public ian(zd4 zd4Var, jan janVar, txi txiVar) {
        this.a = zd4Var;
        this.d = janVar;
        this.b = new lr(zd4Var.d(), txiVar);
        this.c = new kan(zd4Var.g());
    }

    @Override // defpackage.zd4
    public final x6f b() {
        return this.a.b();
    }

    @Override // defpackage.prm
    public final void c(qrm qrmVar) {
        xug.i();
        this.d.c(qrmVar);
    }

    @Override // defpackage.zd4
    public final mc4 d() {
        return this.b;
    }

    @Override // defpackage.zd4
    public final xd4 g() {
        return this.c;
    }

    @Override // defpackage.prm
    public final void j(qrm qrmVar) {
        xug.i();
        this.d.j(qrmVar);
    }

    @Override // defpackage.prm
    public final void k(qrm qrmVar) {
        xug.i();
        this.d.k(qrmVar);
    }

    @Override // defpackage.zd4
    public final void m(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.zd4
    public final void n(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.zd4
    public final boolean p() {
        return false;
    }

    @Override // defpackage.prm
    public final void r(qrm qrmVar) {
        xug.i();
        this.d.r(qrmVar);
    }

    @Override // defpackage.zd4
    public final ListenableFuture release() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }
}
