package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class v5k extends u5k {
    public final int c;

    public v5k(Class cls, ijc ijcVar, e6k e6kVar, int i) {
        super(cls, ijcVar, e6kVar);
        this.c = i;
    }

    public abstract ab2 B(ViewGroup viewGroup);

    @Override // defpackage.ea2
    public final ab2 k(ViewGroup viewGroup, int i) {
        if (i == this.c) {
            return B(viewGroup);
        }
        return null;
    }

    @Override // defpackage.ea2
    public final int q(ja2 ja2Var, int i, ca2 ca2Var) {
        return this.c;
    }
}
