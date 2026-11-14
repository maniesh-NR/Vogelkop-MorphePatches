package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nlm {
    public final boolean a;
    public final r22 b;
    public final Set c;
    public final pxh d;
    public final boolean e;
    public final rxh f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public nlm(boolean z, r22 r22Var, Set set, pxh pxhVar, boolean z2, rxh rxhVar, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = r22Var;
        this.c = set;
        this.d = pxhVar;
        this.e = z2;
        this.f = rxhVar;
        this.g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlm)) {
            return false;
        }
        nlm nlmVar = (nlm) obj;
        return this.a == nlmVar.a && Intrinsics.a(this.b, nlmVar.b) && Intrinsics.a(this.c, nlmVar.c) && this.d.equals(nlmVar.d) && this.e == nlmVar.e && this.f.equals(nlmVar.f) && this.g == nlmVar.g && this.h == nlmVar.h && this.i == nlmVar.i;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        r22 r22Var = this.b;
        return Boolean.hashCode(this.i) + fki.k(fki.k(rfp.c(this.f.a, fki.k((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (r22Var == null ? 0 : r22Var.hashCode())) * 31)) * 31)) * 31, 31, this.e), 31), 31, this.g), 31, this.h);
    }

    public final String toString() {
        return "";
    }
}
