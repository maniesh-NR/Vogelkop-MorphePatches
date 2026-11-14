package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pxg {
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final int e;
    public final int f;

    public pxg(String str, String str2, long j, String str3, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxg)) {
            return false;
        }
        pxg pxgVar = (pxg) obj;
        return Intrinsics.a(this.a, pxgVar.a) && Intrinsics.a(this.b, pxgVar.b) && this.c == pxgVar.c && Intrinsics.a(this.d, pxgVar.d) && this.e == pxgVar.e && this.f == pxgVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + rfp.c(this.e, z1m.f(z1m.e(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        return "";
    }
}
