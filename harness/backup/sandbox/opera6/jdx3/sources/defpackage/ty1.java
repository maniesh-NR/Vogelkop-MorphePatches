package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ty1 extends vy1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ty1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty1)) {
            return false;
        }
        ty1 ty1Var = (ty1) obj;
        return Intrinsics.a(this.a, ty1Var.a) && Intrinsics.a(this.b, ty1Var.b) && Intrinsics.a(this.c, ty1Var.c) && Intrinsics.a(this.d, ty1Var.d);
    }

    public final int hashCode() {
        int iF = z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "";
    }
}
