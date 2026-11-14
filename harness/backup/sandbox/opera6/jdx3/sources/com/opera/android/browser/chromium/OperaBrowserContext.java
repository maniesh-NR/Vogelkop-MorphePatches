package com.opera.android.browser.chromium;

import defpackage.j4c;
import defpackage.kw3;

/* loaded from: classes.dex */
public final class OperaBrowserContext {
    public static final j4c b = new j4c(new kw3(21), (byte) 0);
    public final boolean a;

    public OperaBrowserContext(boolean z) {
        this.a = z;
    }

    public static boolean shouldDiscardSessionCookiesAtStartup(boolean z) {
        return z || ((Boolean) b.get()).booleanValue();
    }

    public final boolean isOffTheRecord() {
        return this.a;
    }
}
