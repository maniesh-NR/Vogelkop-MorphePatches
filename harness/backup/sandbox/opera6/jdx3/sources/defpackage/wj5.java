package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wj5 extends x1p {
    public final String p;
    public final List q;
    public final ffb r;
    public final ffb s;
    public final boolean t;
    public final boolean u;

    public wj5(String str, List list, ffb ffbVar, ffb ffbVar2, boolean z, boolean z2) {
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
        if (!(obj instanceof wj5)) {
            return false;
        }
        wj5 wj5Var = (wj5) obj;
        return Intrinsics.a(this.p, wj5Var.p) && Intrinsics.a(this.q, wj5Var.q) && Intrinsics.a(this.r, wj5Var.r) && Intrinsics.a(this.s, wj5Var.s) && this.t == wj5Var.t && this.u == wj5Var.u;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.u) + fki.k((this.s.hashCode() + ((this.r.hashCode() + rfp.f(this.p.hashCode() * 31, 31, this.q)) * 31)) * 31, 31, this.t);
    }

    public final String toString() {
        return "";
    }
}
