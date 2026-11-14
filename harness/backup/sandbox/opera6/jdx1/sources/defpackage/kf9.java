package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class kf9 extends b8e implements nf9 {
    public Function1 o;
    public qg9 p;

    @Override // defpackage.nf9
    public final void r(qg9 qg9Var) {
        if (Intrinsics.a(this.p, qg9Var)) {
            return;
        }
        this.p = qg9Var;
        this.o.invoke(qg9Var);
    }
}
