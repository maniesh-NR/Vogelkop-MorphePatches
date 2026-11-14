package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class va8 implements fb8 {
    public final de8 a;
    public final String b;

    public va8(de8 de8Var, String str) {
        this.a = de8Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va8)) {
            return false;
        }
        va8 va8Var = (va8) obj;
        return this.a == va8Var.a && Intrinsics.a(this.b, va8Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CashOut(name=" + this.a + ", currency=" + this.b + ")";
    }
}
