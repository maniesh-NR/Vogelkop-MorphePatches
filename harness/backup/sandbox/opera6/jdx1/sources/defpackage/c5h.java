package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c5h implements hyl {
    public final uhi a;
    public final uhi b;
    public final s97 c = new s97();
    public final AtomicReference d = new AtomicReference(b5h.a);

    public c5h(uhi uhiVar) {
        this.a = uhiVar;
        this.b = uhiVar;
    }

    @Override // defpackage.hyl
    public final void a(long j, int i, int i2, int i3, gyl gylVar) {
        h().a(j, i, i2, i3, gylVar);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == b5h.b) {
            this.b.D(false);
            atomicReference.set(b5h.c);
        }
    }

    @Override // defpackage.hyl
    public final void b(g1g g1gVar, int i, int i2) {
        h().b(g1gVar, i, i2);
    }

    @Override // defpackage.hyl
    public final int c(oc6 oc6Var, int i, boolean z) {
        return h().c(oc6Var, i, z);
    }

    @Override // defpackage.hyl
    public final int d(oc6 oc6Var, int i, boolean z) {
        return h().d(oc6Var, i, z);
    }

    @Override // defpackage.hyl
    public final void e(long j) {
    }

    @Override // defpackage.hyl
    public final void f(int i, g1g g1gVar) {
        h().f(i, g1gVar);
    }

    @Override // defpackage.hyl
    public final void g(oj9 oj9Var) {
        this.a.g(oj9Var);
    }

    public final hyl h() {
        return this.d.get() == b5h.c ? this.c : this.b;
    }
}
