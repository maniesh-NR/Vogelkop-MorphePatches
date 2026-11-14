package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class sd2 {
    public final Object a;
    public final hd2 b;
    public final xxa c;

    public sd2(Object obj, hd2 hd2Var, xxa xxaVar) {
        this.a = obj;
        this.b = hd2Var;
        this.c = xxaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd2)) {
            return false;
        }
        sd2 sd2Var = (sd2) obj;
        hd2 hd2Var = sd2Var.b;
        hd2 hd2Var2 = this.b;
        return Intrinsics.a(hd2Var2, hd2Var) && hd2Var2.a(this.a, sd2Var.a) && Intrinsics.a(this.c, sd2Var.c);
    }

    public final int hashCode() {
        hd2 hd2Var = this.b;
        return this.c.hashCode() + ((hd2Var.b(this.a) + (hd2Var.hashCode() * 31)) * 31);
    }
}
