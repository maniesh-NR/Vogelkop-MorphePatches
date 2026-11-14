package defpackage;

import android.util.Range;

/* loaded from: classes.dex */
public final class fvk implements u3n {
    public final u3n a;

    public fvk(u3n u3nVar) {
        this.a = u3nVar;
        if (u3nVar.f()) {
            return;
        }
        qp2.o("Failed requirement.");
        throw null;
    }

    @Override // defpackage.u3n
    public final Range C() {
        return this.a.E();
    }

    @Override // defpackage.u3n
    public final Range E() {
        return this.a.C();
    }

    @Override // defpackage.u3n
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.u3n
    public final Range g(int i) {
        return this.a.z(i);
    }

    @Override // defpackage.u3n
    public final int h() {
        return this.a.q();
    }

    @Override // defpackage.u3n
    public final boolean i(int i, int i2) {
        return this.a.i(i2, i);
    }

    @Override // defpackage.u3n
    public final boolean o(int i, int i2) {
        return this.a.o(i2, i);
    }

    @Override // defpackage.u3n
    public final int q() {
        return this.a.h();
    }

    @Override // defpackage.u3n
    public final Range r() {
        return this.a.r();
    }

    @Override // defpackage.u3n
    public final Range z(int i) {
        return this.a.g(i);
    }
}
