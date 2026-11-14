package com.opera.android.browser;

import com.leanplum.internal.Clock;
import defpackage.u59;

/* loaded from: classes.dex */
public final class FraudProtectionService {
    public final u59 a;

    public FraudProtectionService(u59 u59Var) {
        this.a = u59Var;
    }

    public final int getDaysSinceFirstLaunch() {
        long j = this.a.H().b;
        if (j == 0) {
            return -1;
        }
        return (int) ((System.currentTimeMillis() - j) / Clock.DAY_MILLIS);
    }
}
