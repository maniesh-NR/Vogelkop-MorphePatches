package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class uv8 extends ba2 implements x82 {
    public final d53 b;
    public final Object c;
    public final ow8 d;
    public boolean e;

    public uv8(d53 d53Var, Object obj, ow8 ow8Var) {
        super(sv8.class);
        this.b = d53Var;
        this.c = obj;
        this.d = ow8Var;
        d53Var.b.b(this);
        if (d53Var.a.isEmpty()) {
            return;
        }
        l();
    }

    @Override // defpackage.aa2
    public final void d(int i, ArrayList arrayList) {
        if (i == 0) {
            arrayList.add(new sv8(t()));
        }
    }

    @Override // defpackage.ea2
    public final ab2 k(ViewGroup viewGroup, int i) {
        if (i == 2131559268) {
            return new tv8(ha2.M(viewGroup, i, 0));
        }
        return null;
    }

    @Override // defpackage.x82
    public final void l() {
        if (this.e && this.b.k(this.c)) {
            this.e = false;
        }
        sv8 sv8Var = new sv8(t());
        this.d.W(sv8Var, sv8Var);
    }

    @Override // defpackage.ba2, defpackage.fa2
    public final void onDestroy() {
        this.b.b.c(this);
    }

    @Override // defpackage.ea2
    public final int q(ja2 ja2Var, int i, ca2 ca2Var) {
        return 2131559268;
    }

    public final int t() {
        if (this.e) {
            return 3;
        }
        return (this.b.k(this.c) && this.d.K(j82.class)) ? 1 : 2;
    }
}
