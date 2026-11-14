package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class uj5 extends x1p {
    public final String p;
    public final List q;
    public final ffb r;
    public final ffb s;
    public final boolean t;
    public final boolean u;

    public uj5(String str, List list, ffb ffbVar, ffb ffbVar2, boolean z, boolean z2) {
        this.p = str;
        this.q = list;
        this.r = ffbVar;
        this.s = ffbVar2;
        this.t = z;
        this.u = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj5)) {
            return false;
        }
        uj5 uj5Var = (uj5) obj;
        return Intrinsics.a(this.p, uj5Var.p) && Intrinsics.a(this.q, uj5Var.q) && Intrinsics.a(this.r, uj5Var.r) && Intrinsics.a(this.s, uj5Var.s) && this.t == uj5Var.t && this.u == uj5Var.u;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.u) + fki.k((this.s.hashCode() + ((this.r.hashCode() + rfp.f(this.p.hashCode() * 31, 31, this.q)) * 31)) * 31, 31, this.t);
    }

    public final String toString() {
        return "";
    }
}
