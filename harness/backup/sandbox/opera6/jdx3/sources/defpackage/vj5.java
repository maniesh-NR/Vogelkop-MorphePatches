package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vj5 extends x1p {
    public final String p;
    public final ArrayList q;
    public final ffb r;
    public final ffb s;
    public final boolean t;
    public final boolean u;

    public vj5(String str, ArrayList arrayList, ffb ffbVar, ffb ffbVar2, boolean z, boolean z2) {
        this.p = str;
        this.q = arrayList;
        this.r = ffbVar;
        this.s = ffbVar2;
        this.t = z;
        this.u = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj5)) {
            return false;
        }
        vj5 vj5Var = (vj5) obj;
        return Intrinsics.a(this.p, vj5Var.p) && this.q.equals(vj5Var.q) && Intrinsics.a(this.r, vj5Var.r) && Intrinsics.a(this.s, vj5Var.s) && this.t == vj5Var.t && this.u == vj5Var.u;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.u) + fki.k((this.s.hashCode() + ((this.r.hashCode() + z1m.g(this.q, this.p.hashCode() * 31, 31)) * 31)) * 31, 31, this.t);
    }

    public final String toString() {
        return "";
    }
}
