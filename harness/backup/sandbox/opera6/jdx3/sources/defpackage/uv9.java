package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class uv9 {
    public final double a;
    public final double b;
    public final ebb c;

    public uv9(double d, double d2, ebb ebbVar) {
        this.a = d;
        this.b = d2;
        this.c = ebbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv9)) {
            return false;
        }
        uv9 uv9Var = (uv9) obj;
        return Double.compare(this.a, uv9Var.a) == 0 && Double.compare(this.b, uv9Var.b) == 0 && Intrinsics.a(this.c, uv9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((Double.hashCode(this.b) + (Double.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
