package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cy9 implements dy9 {
    public final boolean a;
    public final String b;
    public final String c;
    public final int d;

    public cy9(boolean z, String str, String str2, int i) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy9)) {
            return false;
        }
        cy9 cy9Var = (cy9) obj;
        return this.a == cy9Var.a && Intrinsics.a(this.b, cy9Var.b) && Intrinsics.a(this.c, cy9Var.c) && this.d == cy9Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + z1m.f(z1m.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
