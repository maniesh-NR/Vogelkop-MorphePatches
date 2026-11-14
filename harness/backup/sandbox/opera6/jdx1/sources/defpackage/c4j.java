package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c4j {
    public static final fig k;
    public static final c4j l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public final fig a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    static {
        fig figVar = new fig(null, 0, null, null, 0, 0L, 0L, -1, -1);
        k = figVar;
        l = new c4j(figVar, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = tym.a;
        m = "0";
        n = "1";
        o = "2";
        p = "3";
        q = "4";
        r = "5";
        s = "6";
        t = "7";
        u = "8";
        v = "9";
    }

    public c4j(fig figVar, boolean z, long j, long j2, long j3, int i, long j4, long j5, long j6, long j7) {
        z4o.w(z == (figVar.h != -1));
        this.a = figVar;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i;
        this.g = j4;
        this.h = j5;
        this.i = j6;
        this.j = j7;
    }

    public static c4j b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(m);
        return new c4j(bundle2 == null ? k : fig.c(bundle2), bundle.getBoolean(n, false), bundle.getLong(o, -9223372036854775807L), bundle.getLong(p, -9223372036854775807L), bundle.getLong(q, 0L), bundle.getInt(r, 0), bundle.getLong(s, 0L), bundle.getLong(t, -9223372036854775807L), bundle.getLong(u, -9223372036854775807L), bundle.getLong(v, 0L));
    }

    public final c4j a(boolean z, boolean z2) {
        fig figVar;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        if (z && z2) {
            return this;
        }
        fig figVarB = this.a.b(z, z2);
        int i = 0;
        boolean z3 = z && this.b;
        if (z) {
            j = this.d;
            long j7 = this.e;
            i = this.f;
            j4 = this.g;
            j2 = this.h;
            j3 = this.i;
            figVar = figVarB;
            j5 = this.j;
            j6 = j7;
        } else {
            figVar = figVarB;
            j = -9223372036854775807L;
            j2 = -9223372036854775807L;
            j3 = -9223372036854775807L;
            j4 = 0;
            j5 = 0;
            j6 = 0;
        }
        return new c4j(figVar, z3, this.c, j, j6, i, j4, j2, j3, j5);
    }

    public final Bundle c(int i) {
        Bundle bundle = new Bundle();
        fig figVar = this.a;
        if (i < 3 || !k.a(figVar)) {
            bundle.putBundle(m, figVar.d(i));
        }
        boolean z = this.b;
        if (z) {
            bundle.putBoolean(n, z);
        }
        long j = this.c;
        if (j != -9223372036854775807L) {
            bundle.putLong(o, j);
        }
        long j2 = this.d;
        if (j2 != -9223372036854775807L) {
            bundle.putLong(p, j2);
        }
        long j3 = this.e;
        if (i < 3 || j3 != 0) {
            bundle.putLong(q, j3);
        }
        int i2 = this.f;
        if (i2 != 0) {
            bundle.putInt(r, i2);
        }
        long j4 = this.g;
        if (j4 != 0) {
            bundle.putLong(s, j4);
        }
        long j5 = this.h;
        if (j5 != -9223372036854775807L) {
            bundle.putLong(t, j5);
        }
        long j6 = this.i;
        if (j6 != -9223372036854775807L) {
            bundle.putLong(u, j6);
        }
        long j7 = this.j;
        if (i >= 3 && j7 == 0) {
            return bundle;
        }
        bundle.putLong(v, j7);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c4j.class == obj.getClass()) {
            c4j c4jVar = (c4j) obj;
            if (this.c == c4jVar.c && this.a.equals(c4jVar.a) && this.b == c4jVar.b && this.d == c4jVar.d && this.e == c4jVar.e && this.f == c4jVar.f && this.g == c4jVar.g && this.h == c4jVar.h && this.i == c4jVar.i && this.j == c4jVar.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        fig figVar = this.a;
        sb.append(figVar.b);
        sb.append(", periodIndex=");
        sb.append(figVar.e);
        sb.append(", positionMs=");
        sb.append(figVar.f);
        sb.append(", contentPositionMs=");
        sb.append(figVar.g);
        sb.append(", adGroupIndex=");
        sb.append(figVar.h);
        sb.append(", adIndexInAdGroup=");
        sb.append(figVar.i);
        sb.append("}, isPlayingAd=");
        sb.append(this.b);
        sb.append(", eventTimeMs=");
        sb.append(this.c);
        sb.append(", durationMs=");
        sb.append(this.d);
        sb.append(", bufferedPositionMs=");
        sb.append(this.e);
        sb.append(", bufferedPercentage=");
        sb.append(this.f);
        sb.append(", totalBufferedDurationMs=");
        sb.append(this.g);
        sb.append(", currentLiveOffsetMs=");
        sb.append(this.h);
        sb.append(", contentDurationMs=");
        sb.append(this.i);
        sb.append(", contentBufferedPositionMs=");
        return j7c.o(this.j, "}", sb);
    }
}
