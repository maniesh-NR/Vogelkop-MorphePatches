package org.chromium.content_public.browser;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.chromium.url.GURL;
import org.chromium.url.Origin;

/* loaded from: classes.dex */
public class NavigationHandle {
    public boolean a;
    public final boolean b;
    public boolean c;
    public int d;
    public GURL e;
    public GURL f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public String l;
    public int m;
    public Origin n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public long s;
    public boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public WebContents x;
    public Page y;
    public Map z = null;

    public NavigationHandle(long j, GURL gurl, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.e = gurl;
        this.b = z;
        this.u = z2;
        this.v = z3;
        this.w = z6;
        a();
    }

    public final void a() {
        Map map = this.z;
        if (map == null) {
            return;
        }
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            map2.put(key, value);
        }
        Collections.unmodifiableMap(map2);
    }

    public final void didFinish(GURL gurl, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2, String str, int i3, boolean z6, boolean z7, String str2, Page page, boolean z8, Map<String, String> map, int i4) {
        this.e = gurl;
        this.j = z;
        this.h = z2;
        this.i = z4;
        this.d = i;
        this.k = i2;
        this.l = str;
        this.m = i3;
        this.r = z6;
        if (z2 && this.a) {
            this.y = page;
        }
        this.z = map;
        a();
    }

    public final void didRedirect(GURL gurl, boolean z, GURL gurl2, int i) {
        this.e = gurl;
        this.q = true;
        this.r = z;
        this.f = gurl2;
        this.g = i;
        a();
    }

    public final void didStart(GURL gurl, int i, GURL gurl2, boolean z, boolean z2, Origin origin, int i2, boolean z3, boolean z4, boolean z5, boolean z6, long j, boolean z7, boolean z8, String str, long j2, WebContents webContents) {
        this.f = gurl;
        this.g = i;
        this.a = z;
        this.c = z2;
        this.n = origin;
        this.d = i2;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = z6;
        this.s = j;
        this.t = z7;
        this.x = webContents;
        a();
    }

    public final void release() {
    }
}
