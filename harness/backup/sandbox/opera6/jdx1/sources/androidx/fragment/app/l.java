package androidx.fragment.app;

import android.view.View;
import defpackage.idc;
import defpackage.ndc;
import defpackage.occ;

/* loaded from: classes.dex */
public final class l implements idc {
    public final /* synthetic */ Fragment a;

    public l(Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.idc
    public final void E(ndc ndcVar, occ occVar) {
        View view;
        if (occVar != occ.ON_STOP || (view = this.a.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
