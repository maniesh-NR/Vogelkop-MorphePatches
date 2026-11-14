package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w88 implements z88 {
    public final int a;
    public final String b;

    public w88(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w88)) {
            return false;
        }
        w88 w88Var = (w88) obj;
        return this.a == w88Var.a && Intrinsics.a(this.b, w88Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "";
    }
}
