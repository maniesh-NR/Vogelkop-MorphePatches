package ads_mobile_sdk;

import defpackage.iao;
import defpackage.mip;
import defpackage.vr9;

/* loaded from: classes.dex */
public final class th3 {
    public final qm1 a;
    public final mip b;

    public th3(mip mipVar, qm1 qm1Var) {
        this.a = qm1Var;
        this.b = mipVar;
    }

    public final iao a(fl0 fl0Var) {
        return new iao(fl0Var, this.b, this.a);
    }

    public final void a(fl0 fl0Var, ef9 ef9Var) {
        iao iaoVar = new iao(fl0Var, this.b, this.a);
        iaoVar.b();
        ef9Var.addListener(new vr9(ef9Var, new e7((Object) iaoVar, (byte) 28), (byte) 0), m97.a);
    }

    public final void a(fl0 fl0Var, Runnable runnable) {
        try {
            new iao(fl0Var, this.b, this.a).b();
            runnable.run();
        } finally {
        }
    }

    public final void b(fl0 fl0Var) {
        this.a.a(fl0Var.a, -1L, null, null);
    }
}
