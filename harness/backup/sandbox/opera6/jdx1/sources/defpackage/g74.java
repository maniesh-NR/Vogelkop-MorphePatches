package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g74 implements n27 {
    public e14 a = c08.a;
    public qe6 b;

    public final qe6 a(Function1 function1) {
        qe6 qe6Var = new qe6((byte) 6);
        qe6Var.b = function1;
        this.b = qe6Var;
        return qe6Var;
    }

    @Override // defpackage.n27
    public final float b() {
        return this.a.b().b();
    }

    @Override // defpackage.n27
    public final float n0() {
        return this.a.b().n0();
    }
}
