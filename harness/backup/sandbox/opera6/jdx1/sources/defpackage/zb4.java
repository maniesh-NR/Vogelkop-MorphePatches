package defpackage;

import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class zb4 implements sxa {
    public final yb4 a;

    public zb4(yb4 yb4Var) {
        this.a = yb4Var;
    }

    @Override // defpackage.sxa
    public final void a(xg8 xg8Var) {
        this.a.a(xg8Var);
    }

    @Override // defpackage.sxa
    public final Matrix b() {
        return new Matrix();
    }

    @Override // defpackage.sxa
    public final int c() {
        int iA = vep.A(this.a.c());
        if (iA == 1) {
            return 2;
        }
        if (iA != 2) {
            return iA != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // defpackage.sxa
    public final hbl d() {
        return this.a.d();
    }

    @Override // defpackage.sxa
    public final long e() {
        return this.a.e();
    }

    @Override // defpackage.sxa
    public final int f() {
        return 0;
    }
}
