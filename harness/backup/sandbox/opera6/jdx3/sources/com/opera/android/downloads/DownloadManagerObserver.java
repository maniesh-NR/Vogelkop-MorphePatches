package com.opera.android.downloads;

import J.N;
import androidx.annotation.NonNull;
import com.opera.android.browser.chromium.OperaBrowserContext;

/* loaded from: classes.dex */
public abstract class DownloadManagerObserver {
    public final long a;

    public DownloadManagerObserver(OperaBrowserContext operaBrowserContext) {
        this.a = N.Mfi4c_0o(this, operaBrowserContext);
    }

    public final void finalize() throws Throwable {
        N.M1TDJPsf(this.a);
        super.finalize();
    }

    public abstract void onDownloadCreated(@NonNull DownloadItem downloadItem, @NonNull String str, int i, int i2);
}
