package ads_mobile_sdk;

import android.os.SystemClock;
import defpackage.cs5;
import defpackage.mip;

/* loaded from: classes.dex */
public abstract class kr {
    public final mip a;
    public final long b;

    public kr(mip mipVar, long j) {
        this.a = mipVar;
        this.b = j;
    }

    public final boolean a() {
        on7 on7Var = pn7.b;
        this.a.getClass();
        return pn7.c(cs5.y0(SystemClock.elapsedRealtime(), un7.d), this.b) >= 0;
    }
}
