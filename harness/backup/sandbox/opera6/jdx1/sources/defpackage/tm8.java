package defpackage;

import org.chromium.base.Callback;
import org.chromium.url.GURL;
import org.chromium.url.Origin;

/* loaded from: classes.dex */
public final class tm8 {
    public final GURL a;
    public final boolean b;
    public final cm c;
    public final GURL d;
    public final int e;
    public final boolean f;
    public final bp g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final Callback p;
    public final boolean q;
    public final Origin r;
    public final long s;
    public final boolean t;
    public d23 u;

    public tm8(GURL gurl, boolean z, cm cmVar, int i, boolean z2, bp bpVar, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Callback callback, boolean z8, Origin origin, boolean z9, boolean z10, boolean z11, long j, boolean z12, boolean z13, boolean z14) {
        String str;
        this.a = gurl;
        this.b = z;
        this.e = i;
        this.c = cmVar;
        this.d = (cmVar == null || (str = cmVar.c) == null) ? zs9.a : new GURL(str);
        this.f = z2;
        this.g = bpVar;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.p = callback;
        this.q = z8;
        this.r = origin;
        this.m = z9;
        this.n = z10;
        this.o = z11;
        this.s = j;
        this.t = z14;
    }
}
