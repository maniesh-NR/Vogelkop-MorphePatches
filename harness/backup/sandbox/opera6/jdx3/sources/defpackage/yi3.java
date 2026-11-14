package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yi3 {
    public final pn7 a;
    public final int b;

    public yi3(pn7 pn7Var, int i) {
        this.a = pn7Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi3)) {
            return false;
        }
        yi3 yi3Var = (yi3) obj;
        return Intrinsics.a(this.a, yi3Var.a) && this.b == yi3Var.b;
    }

    public final int hashCode() {
        pn7 pn7Var = this.a;
        return Integer.hashCode(this.b) + ((pn7Var == null ? 0 : Long.hashCode(pn7Var.a)) * 31);
    }

    public final String toString() {
        return "";
    }
}
