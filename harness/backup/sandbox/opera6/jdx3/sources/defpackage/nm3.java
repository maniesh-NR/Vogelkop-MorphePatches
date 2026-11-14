package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nm3 implements mkf {
    public final yv3 a;
    public final dw3 b;
    public final dw3 c;

    public nm3(yv3 yv3Var, dw3 dw3Var, dw3 dw3Var2) {
        this.a = yv3Var;
        this.b = dw3Var;
        this.c = dw3Var2;
    }

    @Override // defpackage.mkf
    public final l7n a(Class cls) {
        if (Intrinsics.a(cls, h2b.class)) {
            return new h2b((pm3) this.a.get(), (orm) this.b.get(), (skm) this.c.get());
        }
        return null;
    }
}
