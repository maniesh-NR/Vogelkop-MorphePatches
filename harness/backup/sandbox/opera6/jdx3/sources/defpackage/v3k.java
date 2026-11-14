package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v3k implements z3k {
    public final int a;
    public final String b;
    public final yx9 c;

    public v3k(int i, String str, yx9 yx9Var) {
        this.a = i;
        this.b = str;
        this.c = yx9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3k)) {
            return false;
        }
        v3k v3kVar = (v3k) obj;
        return this.a == v3kVar.a && Intrinsics.a(this.b, v3kVar.b) && Intrinsics.a(this.c, v3kVar.c);
    }

    public final int hashCode() {
        int iF = z1m.f(Integer.hashCode(this.a) * 31, 31, this.b);
        yx9 yx9Var = this.c;
        return iF + (yx9Var == null ? 0 : yx9Var.a.hashCode());
    }

    public final String toString() {
        return "";
    }
}
