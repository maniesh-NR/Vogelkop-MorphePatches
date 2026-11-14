package com.opera.android.browser.chromium.media;

import android.util.SparseArray;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class OperaMediaRouterClient {
    public static OperaMediaRouterClient b;
    public final SparseArray a = new SparseArray();

    public static void initialize() {
        if (b != null) {
            return;
        }
        b = new OperaMediaRouterClient();
    }

    public final void a(jkd jkdVar) {
        Callback callback = (Callback) this.a.get(jkdVar.e);
        if (callback != null) {
            callback.run(jkdVar);
        }
        f03.h0(jkdVar);
    }
}
