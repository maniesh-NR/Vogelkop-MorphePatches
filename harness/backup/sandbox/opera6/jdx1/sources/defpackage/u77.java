package defpackage;

import android.view.View;
import androidx.fragment.app.i;

/* loaded from: classes.dex */
public final class u77 extends hl9 {
    public final /* synthetic */ hl9 a;
    public final /* synthetic */ i b;

    public u77(i iVar, hl9 hl9Var) {
        this.b = iVar;
        this.a = hl9Var;
    }

    @Override // defpackage.hl9
    public final View b(int i) {
        hl9 hl9Var = this.a;
        return hl9Var.c() ? hl9Var.b(i) : this.b.onFindViewById(i);
    }

    @Override // defpackage.hl9
    public final boolean c() {
        return this.a.c() || this.b.onHasView();
    }
}
