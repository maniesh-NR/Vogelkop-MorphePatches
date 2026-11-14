package com.opera.android.webcore;

import J.N;
import androidx.annotation.NonNull;
import defpackage.ilm;
import defpackage.xyn;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class WebcoreRpcBridge {
    public long a;
    public final xyn b;

    public WebcoreRpcBridge(int i, WebContents webContents, xyn xynVar) {
        this.a = N.M06kqhI2(i, this, webContents);
        this.b = xynVar;
    }

    public final void a(String str) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.MqkSRV_q(j, str, "ofa-baseline ofa-mode ofa-mode-1");
    }

    public final void transferRequestToBrowser(@NonNull String str) {
        this.b.w(str, new ilm(this, (byte) 17));
    }

    public final void transferResponseToBrowser(@NonNull String str) {
        this.b.t(str);
    }
}
