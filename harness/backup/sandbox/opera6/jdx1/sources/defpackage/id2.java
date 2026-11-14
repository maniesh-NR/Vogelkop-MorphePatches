package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class id2 {
    public final xxa a;
    public final bza b;
    public final hd2 c;

    public id2(xxa xxaVar, bza bzaVar, hd2 hd2Var) {
        this.a = xxaVar;
        this.b = bzaVar;
        this.c = hd2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id2)) {
            return false;
        }
        id2 id2Var = (id2) obj;
        if (!Intrinsics.a(this.a, id2Var.a)) {
            return false;
        }
        hd2 hd2Var = id2Var.c;
        hd2 hd2Var2 = this.c;
        return Intrinsics.a(hd2Var2, hd2Var) && hd2Var2.a(this.b, id2Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hd2 hd2Var = this.c;
        return hd2Var.b(this.b) + ((hd2Var.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.a + ", request=" + this.b + ", modelEqualityDelegate=" + this.c + ")";
    }
}
