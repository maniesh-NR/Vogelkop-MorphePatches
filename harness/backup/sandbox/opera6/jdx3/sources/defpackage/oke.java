package defpackage;

import android.os.SystemClock;
import org.chromium.content_public.browser.NavigationHandle;

/* loaded from: classes.dex */
public final class oke {
    public final long a = SystemClock.uptimeMillis();
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public long e;
    public long f;
    public NavigationHandle g;

    public oke(boolean z, boolean z2, NavigationHandle navigationHandle) {
        this.b = z;
        this.c = navigationHandle.c;
        this.d = z2;
        this.g = navigationHandle;
    }
}
