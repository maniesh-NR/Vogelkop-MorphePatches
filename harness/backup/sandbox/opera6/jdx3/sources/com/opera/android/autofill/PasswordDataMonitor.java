package com.opera.android.autofill;

import J.N;

/* loaded from: classes.dex */
public final class PasswordDataMonitor {
    public Runnable a;
    public long b;

    public final void a() {
        this.a = null;
        long j = this.b;
        if (j == 0) {
            return;
        }
        N.MVsRjClz(j);
        this.b = 0L;
    }

    public final void finalize() {
    }

    public final void onLoginsChanged() {
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
