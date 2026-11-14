package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class xwk extends yrf {
    public final int f;
    public final boolean g;
    public final vwk h;
    public final vwk i;

    public xwk(mej mejVar, boolean z) {
        super(mejVar, mejVar.getContext().getString(2132021750), true);
        this.h = new vwk(0, 2131232288, 2132021747, 2132021746);
        this.i = new vwk(1, 2131232168, 2132021749, 2132021748);
        this.f = z ? 1 : 0;
        this.g = z;
    }

    @Override // defpackage.yrf, defpackage.dej
    public final View a(Context context) {
        View viewA = super.a(context);
        boolean z = this.g;
        vwk vwkVar = this.h;
        if (z) {
            this.e.t(vwkVar, false);
        } else {
            d(vwkVar);
        }
        d(this.i);
        return viewA;
    }

    @Override // defpackage.yrf
    public final boolean e(lrf lrfVar) {
        return lrfVar.getValue() == this.f;
    }

    @Override // defpackage.yrf
    public final void f(lrf lrfVar) {
        if (lrfVar == this.i) {
            zhj.a(new a06(), 4099).c(this.b.getContext());
        }
    }
}
