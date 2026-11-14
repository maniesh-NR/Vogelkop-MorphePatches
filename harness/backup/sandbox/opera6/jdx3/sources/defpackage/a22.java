package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class a22 extends r22 {
    public final xy3 e;
    public final vsn f;
    public final int g;

    public a22(b22 b22Var, xy3 xy3Var, vsn vsnVar, int i) {
        super((x22) b22Var, b22Var.l, b22Var.m, (Function1) new y12(b22Var, (byte) 1));
        this.e = xy3Var;
        this.f = vsnVar;
        this.g = i;
    }

    @Override // defpackage.r22
    public final vsn g() {
        return this.f;
    }

    @Override // defpackage.r22
    public final s62 h() {
        return this.e;
    }
}
