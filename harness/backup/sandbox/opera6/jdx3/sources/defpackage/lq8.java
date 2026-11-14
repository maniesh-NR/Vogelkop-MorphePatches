package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lq8 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Set f;

    public lq8(int i, String str, String str2, String str3, String str4, Set set) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq8)) {
            return false;
        }
        lq8 lq8Var = (lq8) obj;
        return this.a == lq8Var.a && this.b.equals(lq8Var.b) && Intrinsics.a(this.c, lq8Var.c) && this.d.equals(lq8Var.d) && this.e.equals(lq8Var.e) && Intrinsics.a(this.f, lq8Var.f);
    }

    public final int hashCode() {
        int iF = z1m.f(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return this.f.hashCode() + z1m.f(z1m.f((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "";
    }
}
