package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ey5 {
    public final String a;
    public final String b;
    public final String c;

    public ey5(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey5)) {
            return false;
        }
        ey5 ey5Var = (ey5) obj;
        return Intrinsics.a(this.a, ey5Var.a) && this.b.equals(ey5Var.b) && this.c.equals(ey5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return z1m.l(z1m.n("CountryPrefix(name=", this.a, ", dialCode=", this.b, ", code="), this.c, ")");
    }
}
