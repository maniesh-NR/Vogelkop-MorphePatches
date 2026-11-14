package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ls6 {
    public final String a;
    public final String b;
    public final String c;

    public ls6(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls6)) {
            return false;
        }
        ls6 ls6Var = (ls6) obj;
        return Intrinsics.a(this.a, ls6Var.a) && Intrinsics.a(this.b, ls6Var.b) && Intrinsics.a(this.c, ls6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
