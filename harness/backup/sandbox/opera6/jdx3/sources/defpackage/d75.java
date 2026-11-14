package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d75 {
    public final o65 a;
    public final o65 b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public d75(o65 o65Var, o65 o65Var2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        o65Var = (i & 1) != 0 ? new o65(-1, -1, -1, "latest") : o65Var;
        o65Var2 = (i & 2) != 0 ? new o65(-1, -1, -1, "latest") : o65Var2;
        str = (i & 4) != 0 ? "" : str;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? false : z2;
        z3 = (i & 32) != 0 ? false : z3;
        z4 = (i & 64) != 0 ? false : z4;
        z5 = (i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) != 0 ? false : z5;
        boolean z6 = (i & Constants.Crypt.KEY_LENGTH) == 0;
        this.a = o65Var;
        this.b = o65Var2;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d75)) {
            return false;
        }
        d75 d75Var = (d75) obj;
        return Intrinsics.a(this.a, d75Var.a) && Intrinsics.a(this.b, d75Var.b) && Intrinsics.a(this.c, d75Var.c) && this.d == d75Var.d && this.e == d75Var.e && this.f == d75Var.f && this.g == d75Var.g && this.h == d75Var.h && this.i == d75Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + fki.k(fki.k(fki.k(fki.k(fki.k(z1m.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        return "";
    }
}
