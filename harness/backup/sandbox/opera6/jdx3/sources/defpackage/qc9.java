package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class qc9 implements sc9 {
    public final /* synthetic */ rc9 a;

    public qc9(rc9 rc9Var) {
        this.a = rc9Var;
    }

    public final void a(int i, List list) {
        rc9 rc9Var = this.a;
        rc9Var.c.addAll(i, list);
        int size = list.size();
        h7f h7fVar = rc9Var.d;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((mb9) g7fVarH.next()).h(i, size);
        }
    }
}
