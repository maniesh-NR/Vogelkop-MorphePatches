package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class q42 extends r22 {
    public final hq3 e;
    public final vsn f;

    public q42(t42 t42Var, hq3 hq3Var, vsn vsnVar) {
        super((x22) t42Var, t42Var.l, t42Var.m, (Function1) new p42(t42Var, (byte) 2));
        this.e = hq3Var;
        this.f = vsnVar;
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
