package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dm6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public dm6(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm6)) {
            return false;
        }
        dm6 dm6Var = (dm6) obj;
        return Intrinsics.a(this.a, dm6Var.a) && Intrinsics.a(this.b, dm6Var.b) && Intrinsics.a(this.c, dm6Var.c) && Intrinsics.a(this.d, dm6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
