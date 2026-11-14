package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v6k {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final laj d;
    public final w6k e;
    public final zpn f;

    public v6k(boolean z, boolean z2, boolean z3, laj lajVar, w6k w6kVar, zpn zpnVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lajVar;
        this.e = w6kVar;
        this.f = zpnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6k)) {
            return false;
        }
        v6k v6kVar = (v6k) obj;
        return this.a == v6kVar.a && this.b == v6kVar.b && this.c == v6kVar.c && Intrinsics.a(this.d, v6kVar.d) && this.e == v6kVar.e && Intrinsics.a(this.f, v6kVar.f);
    }

    public final int hashCode() {
        int iK = fki.k(fki.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        laj lajVar = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iK + (lajVar == null ? 0 : lajVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
