package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class oe6 {
    public final ne6 a;
    public final boolean b;
    public final int c;
    public final int d;

    public oe6(ne6 ne6Var, boolean z, int i, int i2) {
        this.a = ne6Var;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe6)) {
            return false;
        }
        oe6 oe6Var = (oe6) obj;
        return Intrinsics.a(this.a, oe6Var.a) && this.b == oe6Var.b && this.c == oe6Var.c && this.d == oe6Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + rfp.c(this.c, fki.k(this.a.a * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "";
    }
}
