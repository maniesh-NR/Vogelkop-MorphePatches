package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class no extends mq {
    public final bz p;
    public boolean q;

    public no(uo uoVar, km kmVar, k8 k8Var, List list) {
        super(null, uoVar.b, kmVar, k8Var, null, list);
        this.p = uoVar.a;
    }

    @Override // defpackage.mq
    public final boolean g(boolean z, boolean z2) {
        if (j()) {
            return false;
        }
        if (z2 && this.h.b) {
            return true;
        }
        if (this.q) {
            return false;
        }
        return i(lq.a, lq.c);
    }

    @Override // defpackage.mq
    public final void l(boolean z) {
        if (!z && this.q) {
            this.q = false;
        }
        super.l(z);
    }
}
