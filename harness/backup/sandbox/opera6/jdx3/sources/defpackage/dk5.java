package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dk5 extends ek5 {
    public final uj5 a;
    public final gk5 b;

    public dk5(uj5 uj5Var, gk5 gk5Var) {
        this.a = uj5Var;
        this.b = gk5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk5)) {
            return false;
        }
        dk5 dk5Var = (dk5) obj;
        return Intrinsics.a(this.a, dk5Var.a) && this.b == dk5Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
