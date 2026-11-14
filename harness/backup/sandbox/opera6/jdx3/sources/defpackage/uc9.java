package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class uc9 extends yrf {
    public final k24 f;
    public final tc9[] g;

    public uc9(mej mejVar, k24 k24Var, tc9[] tc9VarArr) {
        super(mejVar, mejVar.getContext().getResources().getText(2132019077).toString(), false);
        this.f = k24Var;
        this.g = tc9VarArr;
    }

    @Override // defpackage.yrf, defpackage.dej
    public final View a(Context context) {
        View viewA = super.a(context);
        for (tc9 tc9Var : this.g) {
            d(tc9Var);
        }
        return viewA;
    }

    @Override // defpackage.yrf
    public final void f(lrf lrfVar) {
        int iOrdinal = ((tc9) lrfVar).ordinal();
        mej mejVar = this.b;
        if (iOrdinal == 0) {
            na2.T(mejVar.getContext());
            return;
        }
        if (iOrdinal == 1) {
            new cd9().w0(mejVar.getContext());
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            xih.u(this.f.getParentFragmentManager());
        }
    }
}
