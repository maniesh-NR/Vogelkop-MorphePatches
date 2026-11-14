package defpackage;

import android.content.res.Resources;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class cn5 extends bn5 {
    public final jt b;
    public final jl4 c;

    public cn5(jt jtVar, jl4 jl4Var) {
        super(jtVar.b);
        this.b = jtVar;
        this.c = jl4Var;
    }

    @Override // defpackage.bn5
    public final void U(gn5 gn5Var, int i) throws Resources.NotFoundException {
        dn5 dn5Var = (dn5) gn5Var;
        OperaListItem operaListItem = this.b.b;
        operaListItem.E(new rxh(dn5Var.b));
        u35.k(dn5Var.c, operaListItem);
        operaListItem.setChecked(dn5Var.e);
        operaListItem.setEnabled(dn5Var.f);
        operaListItem.u = new so4((Object) this, (Object) dn5Var, i, (byte) 1);
    }

    @Override // defpackage.bn5
    public final void V() {
        this.b.b.u = null;
    }
}
