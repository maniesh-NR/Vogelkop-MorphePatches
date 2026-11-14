package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class uo7 {
    public final GURL a;
    public final qo7 b;
    public final boolean c;
    public final kag d;
    public final boolean e;
    public final boolean f;

    public uo7(GURL gurl, qo7 qo7Var, boolean z, kag kagVar, boolean z2, boolean z3) {
        this.a = gurl;
        this.b = qo7Var;
        this.c = z;
        this.d = kagVar;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo7)) {
            return false;
        }
        uo7 uo7Var = (uo7) obj;
        return Intrinsics.a(this.a, uo7Var.a) && this.b.equals(uo7Var.b) && this.c == uo7Var.c && this.d == uo7Var.d && this.e == uo7Var.e && this.f == uo7Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + fki.k((this.d.hashCode() + fki.k((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        return "";
    }
}
