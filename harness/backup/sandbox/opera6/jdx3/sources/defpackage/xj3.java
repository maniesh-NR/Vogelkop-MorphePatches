package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xj3 {
    public final wj3 a;
    public final String b;

    public xj3(wj3 wj3Var, String str) {
        this.a = wj3Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj3)) {
            return false;
        }
        xj3 xj3Var = (xj3) obj;
        return this.a.equals(xj3Var.a) && Intrinsics.a(this.b, xj3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
