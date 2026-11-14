package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fy9 implements ky9 {
    public final String a;
    public final String b;
    public final int c;

    public fy9(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy9)) {
            return false;
        }
        fy9 fy9Var = (fy9) obj;
        return Intrinsics.a(this.a, fy9Var.a) && Intrinsics.a(this.b, fy9Var.b) && this.c == fy9Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
