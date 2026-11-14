package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class da2 implements ea2 {
    public final Class a;
    public final int b;
    public final int c;
    public final jr9 d;

    public da2(Class cls, int i, int i2, jr9 jr9Var) {
        this.a = cls;
        this.b = i;
        this.c = i2;
        this.d = jr9Var;
    }

    @Override // defpackage.ea2
    public final ab2 k(ViewGroup viewGroup, int i) {
        if (this.b != i && this.c != i) {
            return null;
        }
        return (ab2) this.d.apply(ha2.M(viewGroup, i, 0));
    }

    @Override // defpackage.ea2
    public final int q(ja2 ja2Var, int i, ca2 ca2Var) {
        if (this.a.isInstance(ja2Var)) {
            return ca2Var.a ? this.b : this.c;
        }
        return 0;
    }
}
