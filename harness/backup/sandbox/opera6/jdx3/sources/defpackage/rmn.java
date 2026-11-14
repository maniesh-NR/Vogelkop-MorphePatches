package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rmn {
    public final qjn a;
    public final lkn b;
    public final lkn c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final ikn h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public rmn(qjn qjnVar, lkn lknVar, lkn lknVar2, int i, int i2, int i3, int i4, ikn iknVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = qjnVar;
        this.b = lknVar;
        this.c = lknVar2;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = iknVar;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmn)) {
            return false;
        }
        rmn rmnVar = (rmn) obj;
        return Intrinsics.a(this.a, rmnVar.a) && this.b.equals(rmnVar.b) && this.c.equals(rmnVar.c) && this.d == rmnVar.d && this.e == rmnVar.e && this.f == rmnVar.f && this.g == rmnVar.g && Intrinsics.a(this.h, rmnVar.h) && this.i == rmnVar.i && this.j == rmnVar.j && this.k == rmnVar.k && this.l == rmnVar.l;
    }

    public final int hashCode() {
        int iC = rfp.c(this.g, rfp.c(this.f, rfp.c(this.e, rfp.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31), 31), 31);
        ikn iknVar = this.h;
        return Boolean.hashCode(this.l) + fki.k(fki.k(fki.k((iC + (iknVar == null ? 0 : iknVar.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        return "";
    }
}
