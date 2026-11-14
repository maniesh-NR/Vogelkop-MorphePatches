package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pt8 {
    public final String a;
    public final String b;

    public pt8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt8)) {
            return false;
        }
        pt8 pt8Var = (pt8) obj;
        return Intrinsics.a(this.a, pt8Var.a) && Intrinsics.a(this.b, pt8Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
