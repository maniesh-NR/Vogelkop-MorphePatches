package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class be4 implements zd4 {
    public final ysm a;
    public final xd4 b;
    public final mc4 c;
    public final ctm d;
    public final mf4 e;
    public final String f;
    public ec4 g;
    public final int h;
    public final af2 i;

    public be4(m20 m20Var, ysm ysmVar, xd4 xd4Var, mc4 mc4Var, ctm ctmVar, mf4 mf4Var) {
        this.a = ysmVar;
        this.b = xd4Var;
        this.c = mc4Var;
        this.d = ctmVar;
        this.e = mf4Var;
        String str = m20Var.b;
        this.f = str;
        this.g = fc4.a;
        bf2 bf2Var = ce4.a;
        bf2Var.getClass();
        this.h = bf2.b.incrementAndGet(bf2Var);
        this.i = c26.i(false);
        if (gyg.G(3, "CXCP")) {
            toString();
            sd4.b(str);
        }
    }

    @Override // defpackage.zd4
    public final x6f b() {
        return this.e.b;
    }

    @Override // defpackage.prm
    public final void c(qrm qrmVar) {
        ysm ysmVar = this.a;
        synchronized (ysmVar.k) {
            if (ysmVar.l.contains(qrmVar)) {
                ysmVar.k(ysmVar.l);
            }
        }
    }

    @Override // defpackage.zd4
    public final mc4 d() {
        return this.c;
    }

    @Override // defpackage.zd4
    public final cc4 e() {
        return this.g;
    }

    @Override // defpackage.zd4
    public final void f(boolean z) {
        ysm ysmVar = this.a;
        synchronized (ysmVar.k) {
            ysmVar.n = z;
            wrm wrmVarH = ysmVar.h();
            if (wrmVarH != null) {
                na2.B(wrmVarH.b.f, null, null, new vrm(null, wrmVarH, z), 3);
            }
        }
    }

    @Override // defpackage.zd4
    public final xd4 g() {
        return this.b;
    }

    @Override // defpackage.zd4
    public final void i(ec4 ec4Var) {
        this.g = ec4Var == null ? fc4.a : ec4Var;
        if (ec4Var != null) {
            ec4Var.p();
        }
        synchronized (this.a.k) {
        }
    }

    @Override // defpackage.prm
    public final void j(qrm qrmVar) {
        this.a.a(qrmVar);
    }

    @Override // defpackage.prm
    public final void k(qrm qrmVar) {
        ysm ysmVar = this.a;
        synchronized (ysmVar.k) {
            if (ysmVar.l.contains(qrmVar)) {
                ysmVar.l();
            }
        }
    }

    @Override // defpackage.zd4
    public final boolean l() {
        return this.i.b();
    }

    @Override // defpackage.zd4
    public final void m(ArrayList arrayList) {
        this.a.g(CollectionsKt.k0(arrayList));
    }

    @Override // defpackage.zd4
    public final void n(ArrayList arrayList) {
        this.a.d(CollectionsKt.k0(arrayList));
    }

    @Override // defpackage.zd4
    public final void o() {
        if (gyg.G(3, "CXCP")) {
            toString();
        }
        if (this.i.a()) {
            na2.B(this.d.a, null, null, new ae4(this, null, (byte) 0), 3);
        }
    }

    @Override // defpackage.zd4
    public final void q(boolean z) {
        ysm ysmVar = this.a;
        synchronized (ysmVar.k) {
            ysmVar.p = z;
        }
    }

    @Override // defpackage.prm
    public final void r(qrm qrmVar) {
        ysm ysmVar = this.a;
        synchronized (ysmVar.k) {
            if (ysmVar.m.remove(qrmVar)) {
                ysmVar.l();
            }
        }
    }

    @Override // defpackage.zd4
    public final ListenableFuture release() {
        return k1g.z(new jl4(na2.B(this.d.a, null, null, new ae4(this, null, (byte) 1), 3), (byte) 21));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInternalAdapter<");
        sb.append((Object) sd4.b(this.f));
        sb.append('(');
        return p3p.k(this.h, ")>", sb);
    }
}
