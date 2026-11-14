package defpackage;

import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class rzi implements vzi {
    public final /* synthetic */ tzi a;

    public rzi(tzi tziVar) {
        this.a = tziVar;
    }

    public final void G(long j, boolean z) {
        tzi tziVar = this.a;
        if (z) {
            tziVar.c();
        } else if (((LinkedHashSet) tziVar.a.c).isEmpty()) {
            tziVar.d();
        }
        if (tziVar.h) {
            return;
        }
        tziVar.a();
    }
}
