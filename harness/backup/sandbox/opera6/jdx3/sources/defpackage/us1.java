package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class us1 {
    public static final us1 e = new us1(l08.a, null, false, false);
    public final List a;
    public final qs1 b;
    public final boolean c;
    public final boolean d;

    public us1(List list, qs1 qs1Var, boolean z, boolean z2) {
        this.a = list;
        this.b = qs1Var;
        this.c = z;
        this.d = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public static us1 a(us1 us1Var, ArrayList arrayList, qs1 qs1Var, boolean z, boolean z2, int i) {
        ArrayList arrayList2 = arrayList;
        if ((i & 1) != 0) {
            arrayList2 = us1Var.a;
        }
        if ((i & 2) != 0) {
            qs1Var = us1Var.b;
        }
        if ((i & 4) != 0) {
            z = us1Var.c;
        }
        if ((i & 8) != 0) {
            z2 = us1Var.d;
        }
        us1Var.getClass();
        return new us1(arrayList2, qs1Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us1)) {
            return false;
        }
        us1 us1Var = (us1) obj;
        return Intrinsics.a(this.a, us1Var.a) && Intrinsics.a(this.b, us1Var.b) && this.c == us1Var.c && this.d == us1Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        qs1 qs1Var = this.b;
        return Boolean.hashCode(this.d) + fki.k((iHashCode + (qs1Var == null ? 0 : qs1Var.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
