package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xi3 {
    public final int a;
    public final ti3 b;
    public final String c;
    public final String d;
    public final String e;

    public xi3(int i, ti3 ti3Var, String str, String str2, String str3) {
        this.a = i;
        this.b = ti3Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi3)) {
            return false;
        }
        xi3 xi3Var = (xi3) obj;
        return this.a == xi3Var.a && this.b == xi3Var.b && Intrinsics.a(this.c, xi3Var.c) && Intrinsics.a(this.d, xi3Var.d) && Intrinsics.a(this.e, xi3Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
