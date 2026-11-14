package com.opera.android.autofill;

import J.N;

/* loaded from: classes.dex */
public final class PersonalDataMonitor {
    public Runnable a;
    public long b;

    public final void a() {
        this.a = null;
        long j = this.b;
        if (j != 0) {
            N.Mdhcfmkv(j);
            this.b = 0L;
        }
    }

    public final void onPersonalDataChanged() {
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
