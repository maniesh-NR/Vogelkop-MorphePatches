package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fo8 {
    public static final fo8 c = new fo8(fvl.c, qp3.d);
    public final fvl a;
    public final qp3 b;

    public fo8(fvl fvlVar, qp3 qp3Var) {
        this.a = fvlVar;
        this.b = qp3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo8)) {
            return false;
        }
        fo8 fo8Var = (fo8) obj;
        return Intrinsics.a(this.a, fo8Var.a) && Intrinsics.a(this.b, fo8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
