package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d98 {
    public final String a;
    public final long b;
    public final f98 c;
    public final ebb d;
    public final Boolean e;
    public final e98 f;

    public d98(String str, long j, f98 f98Var, ebb ebbVar, Boolean bool, e98 e98Var) {
        this.a = str;
        this.b = j;
        this.c = f98Var;
        this.d = ebbVar;
        this.e = bool;
        this.f = e98Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d98)) {
            return false;
        }
        d98 d98Var = (d98) obj;
        return Intrinsics.a(this.a, d98Var.a) && pn7.e(this.b, d98Var.b) && this.c == d98Var.c && Intrinsics.a(this.d, d98Var.d) && Intrinsics.a(this.e, d98Var.e) && Intrinsics.a(this.f, d98Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        on7 on7Var = pn7.b;
        int iHashCode2 = (this.c.hashCode() + z1m.e(iHashCode, 31, this.b)) * 31;
        ebb ebbVar = this.d;
        int iHashCode3 = (iHashCode2 + (ebbVar == null ? 0 : ebbVar.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        e98 e98Var = this.f;
        return iHashCode4 + (e98Var != null ? e98Var.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
