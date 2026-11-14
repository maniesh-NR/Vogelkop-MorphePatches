package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class f46 implements i46 {

    @NotNull
    public static final e46 Companion = new e46();
    public static final l4c[] f = {z4c.a(f7c.b, new ki5((byte) 9)), null, null, null, null};
    public final g46 a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public f46(int i, g46 g46Var, String str, String str2, int i2, int i3) {
        if (1 != (i & 1)) {
            x7d.I(i, 1, d46.a.getDescriptor());
            throw null;
        }
        this.a = g46Var;
        this.b = (i & 2) == 0 ? g46Var.a : str;
        if ((i & 4) == 0) {
            String str3 = g46Var.d;
            this.c = str3 == null ? g46Var.a : str3;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = g46Var.b;
        } else {
            this.d = i2;
        }
        if ((i & 16) == 0) {
            this.e = g46Var.c;
        } else {
            this.e = i3;
        }
    }

    @Override // defpackage.i46
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f46)) {
            return false;
        }
        f46 f46Var = (f46) obj;
        return this.a == f46Var.a && Intrinsics.a(this.b, f46Var.b) && Intrinsics.a(this.c, f46Var.c) && this.d == f46Var.d && this.e == f46Var.e;
    }

    @Override // defpackage.i46
    public final String g() {
        return this.b;
    }

    @Override // defpackage.i46
    public final int h() {
        return this.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + rfp.c(this.d, z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    @Override // defpackage.i46
    public final String i() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Custom(fiat=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", symbol=");
        sb.append(this.c);
        sb.append(", decimals=");
        sb.append(this.d);
        sb.append(", formatDecimals=");
        return p3p.k(this.e, ")", sb);
    }
}
