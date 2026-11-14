package org.chromium.content_public.browser;

import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class NavigationEntry {
    public final GURL a;
    public final GURL b;
    public final GURL c;
    public final int d;
    public final boolean e;

    public NavigationEntry(GURL gurl, GURL gurl2, GURL gurl3, int i, boolean z) {
        this.a = gurl;
        this.c = gurl2;
        this.b = gurl3;
        this.d = i;
        this.e = z;
    }
}
