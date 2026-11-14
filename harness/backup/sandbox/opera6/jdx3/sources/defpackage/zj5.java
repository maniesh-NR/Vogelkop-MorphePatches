package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zj5 {
    public final String a;
    public final gk5 b;

    public zj5(String str, gk5 gk5Var) {
        this.a = str;
        this.b = gk5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj5)) {
            return false;
        }
        zj5 zj5Var = (zj5) obj;
        return Intrinsics.a(this.a, zj5Var.a) && this.b == zj5Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
