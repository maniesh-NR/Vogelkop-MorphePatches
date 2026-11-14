package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a98 {
    public static final a98 c = new a98("organic", "organic");
    public final String a;
    public final String b;

    public a98(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a98)) {
            return false;
        }
        a98 a98Var = (a98) obj;
        return Intrinsics.a(this.a, a98Var.a) && Intrinsics.a(this.b, a98Var.b);
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
