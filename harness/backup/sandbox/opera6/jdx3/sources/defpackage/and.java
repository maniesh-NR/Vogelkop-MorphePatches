package defpackage;

import androidx.fragment.app.i;
import androidx.fragment.app.w;
import org.chromium.components.media_router.BrowserMediaRouterDialogController;

/* loaded from: classes.dex */
public final class and extends k73 {
    public final String g;
    public final lmd h;

    public and(String str, vnd vndVar, String str2, BrowserMediaRouterDialogController browserMediaRouterDialogController) {
        super(str, vndVar, browserMediaRouterDialogController);
        this.h = new lmd(this, (byte) 3);
        this.g = str2;
    }

    @Override // defpackage.k73
    public final i q(w wVar) {
        if (wVar.F("androidx.mediarouter:MediaRouteControllerDialogFragment") != null) {
            return null;
        }
        lmd lmdVar = this.h;
        zmd zmdVar = new zmd(this, lmdVar);
        ((dod) this.d).a((vnd) this.c, lmdVar, 0);
        zmdVar.show(wVar, "androidx.mediarouter:MediaRouteControllerDialogFragment");
        wVar.D();
        return zmdVar;
    }
}
