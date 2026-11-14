package com.opera.android.browser;

import defpackage.fv0;
import defpackage.x56;
import defpackage.x5f;
import defpackage.zpa;

/* loaded from: classes.dex */
public final class NativeStatsTracker {
    public final x5f a;

    public NativeStatsTracker(x5f x5fVar) {
        this.a = x5fVar;
    }

    public final void logGooglePageWithCaptcha() {
        x5f x5fVar = this.a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            x56VarF.z(zpaVar).e(16);
            x5fVar.U0(x56VarF);
        }
    }

    public final void logYatLookupErrorPage() {
        this.a.S0(fv0.d);
    }

    public final void logYatLookupUrlRedirect() {
        this.a.S0(fv0.b);
    }

    public final void logYatLookupYatRedirect() {
        this.a.S0(fv0.c);
    }
}
