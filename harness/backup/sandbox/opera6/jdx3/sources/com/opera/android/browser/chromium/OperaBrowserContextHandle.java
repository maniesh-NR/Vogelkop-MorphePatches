package com.opera.android.browser.chromium;

import org.chromium.content_public.browser.BrowserContextHandle;

/* loaded from: classes.dex */
public class OperaBrowserContextHandle implements BrowserContextHandle {
    public final long a;

    public OperaBrowserContextHandle(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }
}
