package defpackage;

import android.content.Context;
import android.view.View;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class jkg extends yrf {
    public final ikg f;
    public final Callback g;
    public final ikg[] h;

    public jkg(mej mejVar, int i, ikg[] ikgVarArr, ikg ikgVar, Callback callback) {
        super(mejVar, i == 0 ? null : mejVar.getContext().getString(i), false);
        this.f = ikgVar;
        this.g = callback;
        this.h = ikgVarArr;
    }

    @Override // defpackage.yrf, defpackage.dej
    public final View a(Context context) {
        View viewA = super.a(context);
        for (ikg ikgVar : this.h) {
            d(ikgVar);
        }
        return viewA;
    }

    @Override // defpackage.yrf
    public final boolean e(lrf lrfVar) {
        return lrfVar == this.f;
    }

    @Override // defpackage.yrf
    public final void f(lrf lrfVar) {
        this.g.run((ikg) lrfVar);
    }
}
