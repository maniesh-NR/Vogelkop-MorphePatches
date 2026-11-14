package com.opera.android.downloads;

import J.N;
import defpackage.g7f;
import defpackage.h7f;
import defpackage.pf7;
import defpackage.re7;

/* loaded from: classes.dex */
public class DownloadPauseManager {
    public final long a;
    public final h7f b = new h7f();

    public DownloadPauseManager(long j) {
        this.a = j;
    }

    public final void finalize() throws Throwable {
        N.MvDqqe5e(this.a);
        super.finalize();
    }

    public final void onDownloadPauseChanged(long j, boolean z) {
        h7f h7fVar = this.b;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            pf7 pf7Var = (pf7) g7fVarH.next();
            re7 re7VarD = pf7Var.b.d((pf7Var.a.a() ? 4611686018427387904L : 0L) | j);
            if (re7VarD != null) {
                re7VarD.B(re7VarD.t.getState(), z);
            }
        }
    }
}
