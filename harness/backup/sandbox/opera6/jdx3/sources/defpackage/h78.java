package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h78 {
    public final pxh a;
    public final e78 b;
    public final g78 c;

    public h78() {
        this(new rxh(2132018896), null, g78.a);
    }

    public h78(pxh pxhVar, e78 e78Var, g78 g78Var) {
        this.a = pxhVar;
        this.b = e78Var;
        this.c = g78Var;
    }

    public static h78 a(h78 h78Var, pxh pxhVar, int i) {
        e78 e78Var = (i & 2) != 0 ? h78Var.b : null;
        g78 g78Var = h78Var.c;
        h78Var.getClass();
        return new h78(pxhVar, e78Var, g78Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h78)) {
            return false;
        }
        h78 h78Var = (h78) obj;
        return Intrinsics.a(this.a, h78Var.a) && Intrinsics.a(this.b, h78Var.b) && this.c == h78Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        e78 e78Var = this.b;
        return this.c.hashCode() + ((iHashCode + (e78Var == null ? 0 : e78Var.hashCode())) * 31);
    }

    public final String toString() {
        return "";
    }
}
