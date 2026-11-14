package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class m4a extends nb6 {
    public final /* synthetic */ nb6 k;
    public final /* synthetic */ nb6 l;

    public m4a(nb6 nb6Var, nb6 nb6Var2) {
        this.k = nb6Var;
        this.l = nb6Var2;
    }

    @Override // defpackage.nb6
    public final int t(View view, int i, int i2) {
        return (view.getLayoutDirection() == 1 ? this.l : this.k).t(view, i, i2);
    }

    @Override // defpackage.nb6
    public final String w() {
        return "SWITCHING[L:" + this.k.w() + ", R:" + this.l.w() + "]";
    }

    @Override // defpackage.nb6
    public final int y(int i, View view) {
        return (view.getLayoutDirection() == 1 ? this.l : this.k).y(i, view);
    }
}
