package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zl4 implements em4 {
    public final String a;
    public final l01 b;
    public final String c;
    public final String d;

    public zl4(String str, l01 l01Var, String str2, String str3) {
        this.a = str;
        this.b = l01Var;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl4)) {
            return false;
        }
        zl4 zl4Var = (zl4) obj;
        return this.a.equals(zl4Var.a) && this.b == zl4Var.b && Intrinsics.a(this.c, zl4Var.c) && this.d.equals(zl4Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return ((this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31) + 1231;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Confirmation(amount=");
        sb.append(this.a);
        sb.append(", currency=");
        sb.append(this.b);
        sb.append(", estimatedUsd=");
        return sko.n(sb, this.c, ", phoneNumber=", this.d, ", displayNetworkFeeWarning=true)");
    }
}
