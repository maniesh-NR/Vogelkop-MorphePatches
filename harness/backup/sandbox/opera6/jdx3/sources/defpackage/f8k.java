package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f8k {
    public final boolean a;
    public final boolean b;
    public final w6k c;
    public final w6k d;
    public final w6k e;
    public final v8k f;
    public final rmn g;
    public final eyh h;
    public final int i;
    public final q8l j;

    public f8k(boolean z, boolean z2, w6k w6kVar, w6k w6kVar2, w6k w6kVar3, v8k v8kVar, rmn rmnVar, eyh eyhVar, int i, q8l q8lVar) {
        this.a = z;
        this.b = z2;
        this.c = w6kVar;
        this.d = w6kVar2;
        this.e = w6kVar3;
        this.f = v8kVar;
        this.g = rmnVar;
        this.h = eyhVar;
        this.i = i;
        this.j = q8lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8k)) {
            return false;
        }
        f8k f8kVar = (f8k) obj;
        return this.a == f8kVar.a && this.b == f8kVar.b && this.c == f8kVar.c && this.d == f8kVar.d && this.e == f8kVar.e && this.f == f8kVar.f && Intrinsics.a(this.g, f8kVar.g) && Intrinsics.a(this.h, f8kVar.h) && this.i == f8kVar.i && Intrinsics.a(this.j, f8kVar.j);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + fki.k(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31;
        rmn rmnVar = this.g;
        int iHashCode2 = (iHashCode + (rmnVar == null ? 0 : rmnVar.hashCode())) * 31;
        eyh eyhVar = this.h;
        return this.j.hashCode() + rfp.c(this.i, (iHashCode2 + (eyhVar != null ? eyhVar.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "";
    }
}
