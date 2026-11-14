package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class t9p extends bap {
    public t9p(boolean z, boolean z2, boolean z3) {
        super(8, true, z, z2, z3);
    }

    @Override // defpackage.bap
    public final n9p a() {
        return new n9p(this.d, this.b, this.e);
    }

    @Override // defpackage.bap
    public final bap b(k48 k48Var, u6p u6pVar) {
        k48Var.invoke(this);
        u9p u9pVar = new u9p(8, true, this.d, this.b, this.e);
        u9pVar.f = u6pVar;
        return u9pVar;
    }

    @Override // defpackage.bap
    public final bap c(Function1 function1) {
        bap bapVar = (bap) function1.invoke(this);
        return bapVar == null ? new j9p() : bapVar;
    }
}
