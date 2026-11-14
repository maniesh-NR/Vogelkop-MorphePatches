package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public b3(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return Intrinsics.a(this.a, b3Var.a) && Intrinsics.a(this.b, b3Var.b) && Intrinsics.a(this.c, b3Var.c) && Intrinsics.a(this.d, b3Var.d);
    }

    public final int hashCode() {
        int iF = z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "";
    }
}
