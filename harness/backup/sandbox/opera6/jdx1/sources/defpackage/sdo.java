package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class sdo extends r72 {
    public final void f(qya qyaVar) throws Exception {
        Object objA;
        sxa sxaVarH1 = qyaVar.h1();
        yb4 yb4Var = sxaVarH1 instanceof zb4 ? ((zb4) sxaVarH1).a : null;
        if (yb4Var == null || !((yb4Var.p() == vb4.f || yb4Var.p() == vb4.d) && yb4Var.t() == ub4.e && yb4Var.q() == wb4.d)) {
            ((h9o) this.d).getClass();
            qyaVar.close();
            return;
        }
        synchronized (this.c) {
            objA = ((ArrayDeque) this.b).size() >= this.a ? a() : null;
            ((ArrayDeque) this.b).addFirst(qyaVar);
        }
        if (((h9o) this.d) == null || objA == null) {
            return;
        }
        ((qya) objA).close();
    }
}
