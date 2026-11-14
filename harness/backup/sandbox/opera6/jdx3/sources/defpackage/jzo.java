package defpackage;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class jzo {

    @NotNull
    public static final syo Companion = new syo();
    public final String a;
    public final azo b;
    public final int c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;
    public final int m;
    public final float n;
    public final int o;
    public final int p;
    public final String q;
    public final String r;
    public final String s;
    public final int t;
    public final String u;
    public final wyo v;

    public jzo(int i, String str, azo azoVar, int i2, String str2, int i3, String str3, String str4, String str5, String str6, String str7, int i4, int i5, int i6, float f, int i7, int i8, String str8, String str9, String str10, int i9, String str11, wyo wyoVar) {
        if (2670567 != (i & 2670567)) {
            x7d.I(i, 2670567, pyo.b);
            throw null;
        }
        this.a = str;
        this.b = azoVar;
        this.c = i2;
        if ((i & 8) == 0) {
            this.d = "127.0.0.1";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = 1;
        } else {
            this.e = i3;
        }
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = i4;
        this.l = i5;
        this.m = i6;
        this.n = f;
        if ((i & 16384) == 0) {
            this.o = 1;
        } else {
            this.o = i7;
        }
        this.p = i8;
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str8;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = str9;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = str10;
        }
        this.t = i9;
        if ((i & 1048576) == 0) {
            this.u = null;
        } else {
            this.u = str11;
        }
        this.v = wyoVar;
    }

    public jzo(String str, azo azoVar, int i, int i2, int i3, int i4, int i5, float f, int i6, String str2, String str3, String str4, int i7, String str5, wyo wyoVar) {
        String str6 = Build.MANUFACTURER;
        String str7 = Build.MODEL;
        String str8 = Build.VERSION.RELEASE;
        String str9 = Build.DEVICE;
        this.a = str;
        this.b = azoVar;
        this.c = i;
        this.d = "127.0.0.1";
        this.e = i2;
        this.f = str6;
        this.g = str7;
        this.h = "Android";
        this.i = str8;
        this.j = str9;
        this.k = i3;
        this.l = i4;
        this.m = i5;
        this.n = f;
        this.o = 1;
        this.p = i6;
        this.q = str2;
        this.r = str3;
        this.s = str4;
        this.t = i7;
        this.u = str5;
        this.v = wyoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzo)) {
            return false;
        }
        jzo jzoVar = (jzo) obj;
        return Intrinsics.a(this.a, jzoVar.a) && Intrinsics.a(this.b, jzoVar.b) && this.c == jzoVar.c && Intrinsics.a(this.d, jzoVar.d) && this.e == jzoVar.e && Intrinsics.a(this.f, jzoVar.f) && Intrinsics.a(this.g, jzoVar.g) && Intrinsics.a(this.h, jzoVar.h) && Intrinsics.a(this.i, jzoVar.i) && Intrinsics.a(this.j, jzoVar.j) && this.k == jzoVar.k && this.l == jzoVar.l && this.m == jzoVar.m && Float.compare(this.n, jzoVar.n) == 0 && this.o == jzoVar.o && this.p == jzoVar.p && Intrinsics.a(this.q, jzoVar.q) && Intrinsics.a(this.r, jzoVar.r) && Intrinsics.a(this.s, jzoVar.s) && this.t == jzoVar.t && Intrinsics.a(this.u, jzoVar.u) && Intrinsics.a(this.v, jzoVar.v);
    }

    public final int hashCode() {
        int iC = rfp.c(this.p, rfp.c(this.o, sko.d(this.n, rfp.c(this.m, rfp.c(this.l, rfp.c(this.k, z1m.f(z1m.f(z1m.f(z1m.f(z1m.f(rfp.c(this.e, z1m.f(rfp.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31), 31), 31), 31), 31);
        String str = this.q;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.r;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.s;
        int iC2 = rfp.c(this.t, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.u;
        return this.v.hashCode() + ((iC2 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DeviceObject(ua=" + this.a + ", geo=" + this.b + ", limitAdTracking=" + this.c + ", ip=" + this.d + ", deviceType=" + this.e + ", manufacturer=" + this.f + ", model=" + this.g + ", os=" + this.h + ", osv=" + this.i + ", hwv=" + this.j + ", w=" + this.k + ", h=" + this.l + ", pixelsPerInch=" + this.m + ", pixelsRatio=" + this.n + ", js=" + this.o + ", geofetch=" + this.p + ", language=" + this.q + ", carrier=" + this.r + ", mccmnc=" + this.s + ", connectionType=" + this.t + ", gaid=" + this.u + ", ext=" + this.v + ')';
    }
}
