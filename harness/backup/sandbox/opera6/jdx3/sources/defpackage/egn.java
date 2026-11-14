package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class egn {
    public final uvg a;
    public final byte b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final nfn h;
    public final dgh i;
    public final boolean j;

    /* JADX WARN: Multi-variable type inference failed */
    public egn(uvg uvgVar, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, nfn nfnVar, dgh dghVar, boolean z6) {
        this.a = uvgVar;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = nfnVar;
        this.i = dghVar;
        this.j = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egn)) {
            return false;
        }
        egn egnVar = (egn) obj;
        return this.a == egnVar.a && this.b == egnVar.b && this.c == egnVar.c && this.d == egnVar.d && this.e == egnVar.e && this.f == egnVar.f && this.g == egnVar.g && Intrinsics.a(this.h, egnVar.h) && Intrinsics.a(this.i, egnVar.i) && this.j == egnVar.j;
    }

    public final int hashCode() {
        int iK = fki.k(fki.k(fki.k(fki.k(fki.k(rfp.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        nfn nfnVar = this.h;
        int iHashCode = (iK + (nfnVar == null ? 0 : nfnVar.hashCode())) * 31;
        dgh dghVar = this.i;
        return Boolean.hashCode(this.j) + ((iHashCode + (dghVar != null ? dghVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "";
    }
}
