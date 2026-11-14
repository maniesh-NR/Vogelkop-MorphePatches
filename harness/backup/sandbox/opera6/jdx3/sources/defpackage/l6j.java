package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l6j {
    public final int a;
    public final x6j b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final ehc h;

    public l6j(int i, x6j x6jVar, String str, String str2, int i2, boolean z, boolean z2, ehc ehcVar) {
        this.a = i;
        this.b = x6jVar;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = z;
        this.g = z2;
        this.h = ehcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6j)) {
            return false;
        }
        l6j l6jVar = (l6j) obj;
        return this.a == l6jVar.a && Intrinsics.a(this.b, l6jVar.b) && Intrinsics.a(this.c, l6jVar.c) && Intrinsics.a(this.d, l6jVar.d) && this.e == l6jVar.e && this.f == l6jVar.f && this.g == l6jVar.g && Intrinsics.a(this.h, l6jVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + fki.k(fki.k(rfp.c(this.e, z1m.f(z1m.f((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "";
    }
}
