package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class mwj extends View {
    public final pde a;
    public q2l b;

    public mwj(Context context, pde pdeVar, pde pdeVar2) {
        super(context);
        this.a = pdeVar2;
        this.b = q2l.a;
        a26.T(pdeVar2, pdeVar, new qzg(this, (byte) 12));
    }

    public final void a() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        eyj eyjVar = (eyj) this.a.g();
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            layoutParams.width = eyjVar.j.f.getWidth();
            layoutParams.height = eyjVar.j.f.getHeight();
        } else if (iOrdinal != 1) {
            h9o.p();
        } else {
            layoutParams.width = eyjVar.j.g.getWidth();
            layoutParams.height = eyjVar.j.g.getHeight();
        }
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        a();
    }
}
