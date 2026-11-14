package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ua8 implements fb8 {
    public final String a;
    public final xd8 b;

    public ua8(String str, xd8 xd8Var) {
        this.a = str;
        this.b = xd8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua8)) {
            return false;
        }
        ua8 ua8Var = (ua8) obj;
        return Intrinsics.a(this.a, ua8Var.a) && this.b == ua8Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CardClick(id=" + this.a + ", location=" + this.b + ")";
    }
}
