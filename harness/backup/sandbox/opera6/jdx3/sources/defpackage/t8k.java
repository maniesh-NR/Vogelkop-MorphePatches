package defpackage;

/* loaded from: classes.dex */
public final class t8k {
    public final boolean a;
    public final boolean b;
    public final s8k c;
    public final r8k d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public t8k(boolean z, boolean z2, s8k s8kVar, r8k r8kVar, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = s8kVar;
        this.d = r8kVar;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8k)) {
            return false;
        }
        t8k t8kVar = (t8k) obj;
        return this.a == t8kVar.a && this.b == t8kVar.b && this.c == t8kVar.c && this.d == t8kVar.d && this.e == t8kVar.e && this.f == t8kVar.f && this.g == t8kVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + fki.k(fki.k((this.d.hashCode() + ((this.c.hashCode() + fki.k(fki.k((((((p7j.c.hashCode() + 37893873) * 31) + 1231) * 31) + 1231) * 31, 31, this.a), 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "";
    }
}
