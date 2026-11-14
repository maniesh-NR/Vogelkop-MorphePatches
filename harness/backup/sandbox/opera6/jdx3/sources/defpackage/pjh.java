package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pjh {
    public final ee0 a;
    public final eo0 b;
    public final String c;
    public final Integer d;

    public pjh(ee0 ee0Var, eo0 eo0Var, String str, Integer num) {
        this.a = ee0Var;
        this.b = eo0Var;
        this.c = str;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pjh) {
            pjh pjhVar = (pjh) obj;
            if (Intrinsics.a(this.a, pjhVar.a) && this.b == pjhVar.b && Intrinsics.a(this.c, pjhVar.c) && Intrinsics.a(this.d, pjhVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ee0 ee0Var = this.a;
        int iHashCode = (this.b.hashCode() + ((ee0Var == null ? 0 : ee0Var.hashCode()) * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
