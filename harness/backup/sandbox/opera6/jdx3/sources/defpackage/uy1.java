package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class uy1 extends vy1 {
    public final String a;
    public final String b;
    public final String c;

    public uy1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy1)) {
            return false;
        }
        uy1 uy1Var = (uy1) obj;
        return Intrinsics.a(this.a, uy1Var.a) && Intrinsics.a(this.b, uy1Var.b) && Intrinsics.a(this.c, uy1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
