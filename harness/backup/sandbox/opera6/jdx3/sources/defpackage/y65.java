package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y65 {
    public final String a;
    public final String b;
    public final String c;

    public y65(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y65)) {
            return false;
        }
        y65 y65Var = (y65) obj;
        return Intrinsics.a(this.a, y65Var.a) && Intrinsics.a(this.b, y65Var.b) && Intrinsics.a(this.c, y65Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
