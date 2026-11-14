package defpackage;

import androidx.fragment.app.i;
import androidx.fragment.app.w;

/* loaded from: classes.dex */
public final class qmd extends k73 {
    @Override // defpackage.k73
    public final i q(w wVar) {
        if (wVar.F("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
            return null;
        }
        pmd pmdVar = new pmd(this);
        pmdVar.i0((vnd) this.c);
        pmdVar.show(wVar, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
        wVar.D();
        return pmdVar;
    }
}
