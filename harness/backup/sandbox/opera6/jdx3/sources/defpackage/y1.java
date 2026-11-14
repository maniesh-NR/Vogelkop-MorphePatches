package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y1 {
    public final l2 a;
    public final Object b;

    public y1(l2 l2Var, Object obj) {
        this.a = l2Var;
        this.b = obj;
        if (l2Var.d().e(obj)) {
            return;
        }
        qp2.o("Failed requirement.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return this.a.equals(y1Var.a) && Intrinsics.a(this.b, y1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AbiArg(type=" + this.a + ", value=" + this.b + ")";
    }
}
