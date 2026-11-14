package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q85 {
    public final boolean a;
    public final eri b;
    public final o24 c;
    public final o24 d;
    public final zm8 e;

    static {
        byte b = jf.g;
    }

    public q85(boolean z, eri eriVar, o24 o24Var, o24 o24Var2, zm8 zm8Var) {
        this.a = z;
        this.b = eriVar;
        this.c = o24Var;
        this.d = o24Var2;
        this.e = zm8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q85)) {
            return false;
        }
        q85 q85Var = (q85) obj;
        return this.a == q85Var.a && Intrinsics.a(this.b, q85Var.b) && Intrinsics.a(this.c, q85Var.c) && Intrinsics.a(this.d, q85Var.d) && Intrinsics.a(this.e, q85Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        o24 o24Var = this.c;
        int iHashCode2 = (iHashCode + (o24Var == null ? 0 : o24Var.hashCode())) * 31;
        o24 o24Var2 = this.d;
        int iHashCode3 = (iHashCode2 + (o24Var2 == null ? 0 : o24Var2.hashCode())) * 31;
        zm8 zm8Var = this.e;
        return iHashCode3 + (zm8Var != null ? zm8Var.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
