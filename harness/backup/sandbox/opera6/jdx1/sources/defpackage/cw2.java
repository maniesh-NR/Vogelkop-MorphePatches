package defpackage;

import kotlin.Metadata;
import kotlin.Unit;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcw2;", "Lh8e;", "Lbw2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class cw2 extends h8e {
    public bw2 b;
    public cd5 c;

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new bw2(this);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
    }

    public final int hashCode() {
        return 234;
    }

    public final Object i(nt5 nt5Var) {
        cd5 cd5Var = this.c;
        if (cd5Var == null) {
            cd5Var = new cd5();
            this.c = cd5Var;
            bw2 bw2Var = this.b;
            if (bw2Var != null && bw2Var.n) {
                bw2Var.o = k1g.c0(bw2Var, new cv2(bw2Var, bw2Var.p, (byte) 1));
            }
        }
        Object objA = cd5Var.A(nt5Var);
        return objA == px5.a ? objA : Unit.a;
    }
}
