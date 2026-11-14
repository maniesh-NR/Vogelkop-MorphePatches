package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hv7 {
    public final List a;
    public final eri b;
    public final eri c;
    public final l42 d;
    public final eri e;

    static {
        int i = l42.l;
    }

    public hv7(List list, eri eriVar, eri eriVar2, l42 l42Var, eri eriVar3) {
        this.a = list;
        this.b = eriVar;
        this.c = eriVar2;
        this.d = l42Var;
        this.e = eriVar3;
    }

    public static hv7 a(hv7 hv7Var, List list, eri eriVar, eri eriVar2, l42 l42Var, eri eriVar3, int i) {
        if ((i & 1) != 0) {
            list = hv7Var.a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            eriVar = hv7Var.b;
        }
        eri eriVar4 = eriVar;
        if ((i & 4) != 0) {
            eriVar2 = hv7Var.c;
        }
        eri eriVar5 = eriVar2;
        if ((i & 8) != 0) {
            l42Var = hv7Var.d;
        }
        l42 l42Var2 = l42Var;
        if ((i & 16) != 0) {
            eriVar3 = hv7Var.e;
        }
        hv7Var.getClass();
        return new hv7(list2, eriVar4, eriVar5, l42Var2, eriVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv7)) {
            return false;
        }
        hv7 hv7Var = (hv7) obj;
        return Intrinsics.a(this.a, hv7Var.a) && Intrinsics.a(this.b, hv7Var.b) && Intrinsics.a(this.c, hv7Var.c) && Intrinsics.a(this.d, hv7Var.d) && Intrinsics.a(this.e, hv7Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        l42 l42Var = this.d;
        int iHashCode2 = (iHashCode + (l42Var == null ? 0 : l42Var.hashCode())) * 31;
        eri eriVar = this.e;
        return iHashCode2 + (eriVar != null ? eriVar.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
