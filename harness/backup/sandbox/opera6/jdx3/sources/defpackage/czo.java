package defpackage;

import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class czo extends jsd {
    public View c;
    public u2p d;

    @Override // defpackage.jsd
    public final void b(cie cieVar, w06 w06Var) {
        View view;
        if (getChildCount() > 0) {
            removeAllViews();
        }
        u2p u2pVar = new u2p(getContext(), null);
        this.d = u2pVar;
        jsd.c(u2pVar, cieVar);
        if (w06Var == w06.h && (view = this.c) != null) {
            this.d.v(view);
        }
        Objects.toString(w06Var);
    }

    @Override // defpackage.jsd
    public final void e(cie cieVar) {
        super.e(cieVar);
        u2p u2pVar = this.d;
        if (u2pVar != null) {
            u2pVar.unregister();
        }
    }
}
