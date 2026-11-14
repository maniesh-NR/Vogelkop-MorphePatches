package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class vu8 extends ba2 implements x82 {
    public final ow8 b;
    public final d53 c;
    public final Object d;
    public final nw8 e;
    public boolean f;
    public boolean g;
    public uu8 h;

    public vu8(ow8 ow8Var, d53 d53Var, Object obj, nw8 nw8Var) {
        super(uu8.class);
        this.b = ow8Var;
        this.c = d53Var;
        this.d = obj;
        this.e = nw8Var;
        d53Var.b.b(this);
        if (!d53Var.a.isEmpty()) {
            l();
        }
        ow8Var.registerAdapterDataObserver(new a83(this, (byte) 7));
    }

    @Override // defpackage.aa2
    public final void d(int i, ArrayList arrayList) {
        if (i == 0 && this.f) {
            if (this.g || !this.b.K(j82.class)) {
                uu8 uu8Var = new uu8(this.e, this.c.k(this.d));
                this.h = uu8Var;
                arrayList.add(uu8Var);
            }
        }
    }

    @Override // defpackage.ea2
    public final ab2 k(ViewGroup viewGroup, int i) {
        if (i == 2131558817) {
            return new tu8(ha2.M(viewGroup, i, 0));
        }
        if (i == 2131558826) {
            return new su8(ha2.M(viewGroup, i, 0));
        }
        return null;
    }

    @Override // defpackage.x82
    public final void l() {
        boolean zK = this.c.k(this.d);
        uu8 uu8Var = this.h;
        if (uu8Var == null || uu8Var.d == zK) {
            return;
        }
        uu8 uu8Var2 = new uu8(this.e, zK);
        this.h = uu8Var2;
        this.b.W(uu8Var2, uu8Var2);
    }

    @Override // defpackage.ba2, defpackage.fa2
    public final void onDestroy() {
        this.c.b.c(this);
    }

    @Override // defpackage.ea2
    public final int q(ja2 ja2Var, int i, ca2 ca2Var) {
        return this.g ? 2131558817 : 2131558826;
    }

    public final void t() {
        boolean z = this.f;
        ow8 ow8Var = this.b;
        boolean z2 = z && (this.g || !ow8Var.K(j82.class));
        uu8 uu8Var = this.h;
        if (uu8Var != null) {
            if (z2) {
                return;
            }
            ow8Var.V(uu8Var);
            this.h = null;
            return;
        }
        if (z2) {
            this.h = new uu8(this.e, this.c.k(this.d));
            int iL = ow8Var.L(sv8.class);
            ow8Var.H(iL >= 0 ? iL : 0, this.h);
        }
    }
}
