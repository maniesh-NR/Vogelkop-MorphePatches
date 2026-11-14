package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class klc {
    public final wmc a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public klc(wmc wmcVar, boolean z, boolean z2, boolean z3) {
        this.a = wmcVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klc)) {
            return false;
        }
        klc klcVar = (klc) obj;
        return Intrinsics.a(this.a, klcVar.a) && this.b == klcVar.b && this.c == klcVar.c && this.d == klcVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + fki.k(fki.k(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
