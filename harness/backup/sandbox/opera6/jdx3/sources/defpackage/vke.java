package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vke {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public vke(String str, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vke)) {
            return false;
        }
        vke vkeVar = (vke) obj;
        return Intrinsics.a(this.a, vkeVar.a) && this.b == vkeVar.b && this.c == vkeVar.c && this.d == vkeVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + fki.k(fki.k(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
