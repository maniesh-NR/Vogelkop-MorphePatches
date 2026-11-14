package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ilc {
    public final qmc a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public ilc(qmc qmcVar, boolean z, boolean z2, boolean z3) {
        this.a = qmcVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilc)) {
            return false;
        }
        ilc ilcVar = (ilc) obj;
        return Intrinsics.a(this.a, ilcVar.a) && this.b == ilcVar.b && this.c == ilcVar.c && this.d == ilcVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + fki.k(fki.k(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
